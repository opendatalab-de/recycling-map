package de.grundid.standesamt;

import static org.springframework.util.StringUtils.hasText;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import de.grundid.utils.GrabUtils;

public class DirectParser {

	private static final String[] files = { "berlin.html", "brandenburg.html", "	bremen.html", "	bw.html",
			"	hamburg.html", "	hessen.html", "	meck-vorp.html", "	niedersachsen.html", "	nord-west.html",
			"	rheinland.html", "	saarland.html", "	sachsen-anhalt.html", "	sachsen.html", "	schleswig.html",
			"	thuerigen.html", };

	private void run() {
		List<Standesamt> result = new ArrayList<Standesamt>();
		for (String file : files) {
			String htmlData = readFully("/" + file.trim());
			Document document = Jsoup.parse(htmlData);
			Elements firstDivs = document.getElementsByAttributeValue("style",
					"min-height:400px;margin-left: 210px;padding-left:20px;font-size:14px;");
			Elements elements = firstDivs.get(0).getElementsByTag("p");
			for (Element element : elements) {
				String value = element.text();
				if (hasText(value)) {
					Standesamt stm = new Standesamt();
					stm.setOriginalData(element.html());
					List<Node> childNodes = element.childNodes();
					for (Node node : childNodes) {
						if (node.nodeName().equals("a")) {
							stm.setSource("http://www.standesamt.com" + node.attr("href"));
							Node childNode = node.childNode(0);
							DataParser.setValue(childNode.toString(), "name", stm);
						}
						else if (node.nodeName().equals("#text")) {
							String[] streetZipCity = node.toString().split(",");
							DataParser.setValue(streetZipCity[0], "street", stm);
							String zipCity = streetZipCity[1].trim();
							int pos = zipCity.indexOf(' ');
							if (pos != -1) {
								DataParser.setValue(zipCity.substring(0, pos), "zip", stm);
								DataParser.setValue(zipCity.substring(pos), "city", stm);
							}
						}
					}
					result.add(stm);
				}
			}
		}
		System.out.println("Elements " + result.size());
		GrabUtils.writeJsonObject(result, "standesaemter-list2.json");
	}

	private String readFully(String fileName) {
		try {
			List<String> lines = IOUtils.readLines(DirectParser.class.getResourceAsStream(fileName),
					Charset.forName("ISO-8859-1"));
			StringBuilder sb = new StringBuilder();
			for (String string : lines) {
				sb.append(string).append("\n");
			}
			return sb.toString();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		new DirectParser().run();
	}
}
