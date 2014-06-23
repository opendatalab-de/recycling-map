package de.grundid.standesamt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.util.StringUtils.hasText;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;

import de.grundid.utils.GrabUtils;

public class DataParser {

	private static final Pattern PHONE = Pattern.compile("[\\d\\-+ /,].*");

	@Test
	public void testPattern() throws Exception {
		assertTrue(PHONE.matcher("06104/703 – 3107, -3106, -3111").matches());
	}

	@Test
	public void testStreet() throws Exception {
		String input = "<p style=\"text-align: justify;\"><span style=\"font-family: Arial,Helvetica,sans-serif; "
				+ "font-size: small;\" face=\"Arial, Helvetica, sans-serif\" size=\"2\">Stadtplatz 1<br /> "
				+ "93326 Abensberg</span></p>";
		Document document = Jsoup.parse(input);
		Elements children = document.getElementsByTag("p");
		Standesamt standesamt = new Standesamt();
		processStreetAddress(standesamt, children.first());
		assertEquals("Stadtplatz 1", standesamt.getStreet());
		assertEquals("93326", standesamt.getZip());
		assertEquals("Abensberg", standesamt.getCity());
	}

	@Test
	public void testStreetSimple() throws Exception {
		String input = "<p style=\"text-align: justify;\">Stadtplatz 1<br />93326 Abensberg</p>";
		Document document = Jsoup.parse(input);
		Elements children = document.getElementsByTag("p");
		Standesamt standesamt = new Standesamt();
		processStreetAddress(standesamt, children.first());
		assertEquals("Stadtplatz 1", standesamt.getStreet());
		assertEquals("93326", standesamt.getZip());
		assertEquals("Abensberg", standesamt.getCity());
	}

	private void run() {
		de.grundid.standesamt.Document doc = new de.grundid.standesamt.Document();
		Context cx = Context.enter();
		ScriptableObject scope = cx.initStandardObjects();
		Object wrappedOut = Context.javaToJS(doc, scope);
		ScriptableObject.putProperty(scope, "document", wrappedOut);
		List<Standesamt> result = new ArrayList<Standesamt>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, String> standesaemter = objectMapper.readValue(new FileInputStream(
					"/Users/adrian/Documents/Data/standesamt-detail-map.json"), MapType.construct(HashMap.class,
					SimpleType.construct(String.class), SimpleType.construct(Object.class)));
			System.out.println("Anzahl: " + standesaemter.size());
			for (Entry<String, String> entry : standesaemter.entrySet()) {
				Standesamt standesamt = new Standesamt();
				standesamt.setOriginalData(entry.getValue());
				Document document = Jsoup.parse(entry.getValue());
				Elements allElements = document.getAllElements();
				boolean addressStart = false;
				boolean phoneStart = false;
				for (Element element : allElements) {
					String nodeName = element.nodeName().toLowerCase();
					if (nodeName.equals("h1")) {
						setValue(element.text(), "name", standesamt);
					}
					else if (nodeName.equals("h3")) {
						if (element.text().toLowerCase().trim().contains("adresse")) {
							addressStart = true;
						}
					}
					else if (nodeName.equals("script")) {
						String script = element.html();
						if (script.contains("prefix")) {
							doc.reset();
							cx.evaluateString(scope, script, "script", 0, null);
							setValue(extractTagContent(doc.getContent()), "mail", standesamt);
						}
					}
					else if (nodeName.equals("p")) {
						if (addressStart) {
							addressStart = !processStreetAddress(standesamt, element);
							phoneStart = !addressStart;
						}
						else if (phoneStart) {
							String possiblePhone = element.text().trim();
							if (PHONE.matcher(possiblePhone).matches()) {
								setValue(possiblePhone, "phone", standesamt);
							}
							phoneStart = false;
						}
					}
					else if (nodeName.equals("a")) {
						String href = element.attr("href").trim();
						if (href.startsWith("http")) {
							setValue(href, "homepage", standesamt);
						}
					}
				}
				if (hasText(standesamt.getName())) {
					result.add(standesamt);
				}
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		GrabUtils.writeJsonObject(result, "standesaemter-list.json");
	}

	private boolean processStreetAddress(Standesamt standesamt, Element element) {
		Node possibleAddress = element;
		List<Node> nodes = possibleAddress.childNodes();
		if (nodes.size() == 1 && nodes.get(0).nodeName().equalsIgnoreCase("span")) {
			possibleAddress = nodes.get(0);
		}
		boolean result = false;
		boolean street = !hasText(standesamt.getStreet());
		for (Node addressNode : possibleAddress.childNodes()) {
			if (addressNode.nodeName().equalsIgnoreCase("br")) {
				street = false;
			}
			else if (street) {
				String possibleStreet = addressNode.toString();
				if (!possibleStreet.contains("Standesamt") && !possibleStreet.contains("Bezirk")
						&& !possibleStreet.startsWith("B ") && !possibleStreet.startsWith("BA ")) {
					setValue(possibleStreet, "street", standesamt);
				}
			}
			else {
				String zipCity = addressNode.toString().trim();
				int pos = zipCity.indexOf(' ');
				if (pos != -1) {
					String zip = zipCity.substring(0, pos);
					String city = zipCity.substring(pos);
					setValue(zip, "zip", standesamt);
					setValue(city, "city", standesamt);
				}
				else {
					setValue(zipCity, "city", standesamt);
				}
				result = true;
			}
		}
		return result;
	}

	private String extractTagContent(String value) {
		Document document = Jsoup.parse(value);
		return document.text();
	}

	public static void setValue(String value, String property, Standesamt standesamt) {
		try {
			String currentValue = BeanUtils.getProperty(standesamt, property);
			if (!hasText(currentValue)) {
				String trimmed = StringUtils.trimWhitespace(StringEscapeUtils.unescapeHtml4(value));
				BeanUtils.setProperty(standesamt, property, trimmed);
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		new DataParser().run();
	}
}
