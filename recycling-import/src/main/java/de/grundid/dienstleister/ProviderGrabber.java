package de.grundid.dienstleister;

import static org.junit.Assert.assertEquals;
import static org.springframework.util.StringUtils.hasText;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import de.grundid.utils.AddressParser;
import de.grundid.utils.GrabUtils;

public class ProviderGrabber {

	private static final String TEST_DATA = "<div class=\"provider_list\"><div class=\"list_logo_border\">"
			+ "<div class=\"list_logo\" style=\"height:70px; top:8px;\"><a href=\"brautstyling-1147-donata-beauty-hair-augsburg.php\" title=\"Donata Beauty &amp; Hair Augsburg\"><img src=\"show_img.php?file=bilder%2F1147%2Flogo.png&amp;w=112&amp;h=70\" alt=\"Donata Beauty &amp; Hair, Augsburg\"></a></div></div>"
			+ "<p class=\"top\"><a href=\"brautstyling-1147-donata-beauty-hair-augsburg.php\" title=\"Donata Beauty &amp; Hair Augsburg\">"
			+ "Donata Beauty &amp; Hair</a><br>Ihre Spezialistin für Hochsteckfrisuren, Brautfrisuren, Haarverlängerungen</p>"
			+ "<p class=\"bottom\">Friedberger Str. 81<br>86161 Augsburg</p>"
			+ "<p class=\"bottom\" style=\"width:180px;\">Telefon: (0821) 65 08 85 85<br>Mobil:&nbsp;&nbsp;&nbsp;&nbsp; (0160) 96 78 22 71</p></div>";
	private static final String TEST_DATA_PREMIUM = "<div class=\"provider_list premium\"><div class=\"list_logo_border\">"
			+ "<div class=\"list_logo\" style=\"height:84px; top:1px;\"><a href=\"catering-1218-neu-ulm-genusspur-der-schwaebische-cateringservice-augsburg.php\" title=\"GenussPur - der schwäbische Cateringservice Neu Ulm\">"
			+ "<img src=\"show_img.php?file=bilder%2F1218%2Flogo.png&amp;w=112&amp;h=84\" alt=\"GenussPur - der schwäbische Cateringservice, Neu Ulm\"></a></div></div>"
			+ "<p class=\"top\"><a href=\"catering-1218-neu-ulm-genusspur-der-schwaebische-cateringservice-augsburg.php\" title=\"GenussPur Neu Ulm\">GenussPur - der schwäbische Cateringservice</a><br>Unser Haus besitzt einen eigenen Cateringservice, der voll und ganz nach den saisonalen Gegebenheiten kocht - unseren regionalen Erzeugern sei Dank.</p>"
			+ "<p class=\"bottom\">Dorfstraße 54 / 1<br>89233 Neu Ulm</p><p class=\"bottom\" style=\"width:180px;\">Telefon: (0731) 70 53 55 73<br>Mobil:&nbsp;&nbsp;&nbsp;&nbsp; (0173) 87 37 579</p>"
			+ "<p class=\"bottom\" style=\"width:230px;\"><a href=\"http://www.schwaebisch-geniessen.de\" rel=\"nofollow\" target=\"_blank\">www.schwaebisch-geniessen.de</a><br><script type=\"text/javascript\">\n"
			+ "<!--\n"
			+ "jsm('robert','de','schwaebisch-geniessen');\n"
			+ "//-->\n"
			+ "</script><noscript>robert&#169;\n" + "schwaebisch-geniessen&#44;\n" + "de</noscript></p></div>";
	private static final String TEST2_DATA = "<div class=\"kontakt\" style=\"top:50px;\"><h3>Kontakt</h3>"
			+ "<p><b>Donata Beauty &amp; Hair</b><br>Donata Mastro Monaco<br>Friedberger Str. 81<br>86161 Augsburg<br>"
			+ "<br>Telefon: (0821) 65 08 85 85<br>Mobil:&nbsp;&nbsp;&nbsp;&nbsp; (0160) 96 78 22 71<br><br>"
			+ "<a href=\"http://www.donata-beauty-hair.de\" target=\"_blank\">www.donata-beauty-hair.de</a><br><a href=\"#message\">zum Kontaktformular</a>		</p></div>";
	private static final AddressParser addressParser = new AddressParser();

	@Test
	public void itShouldParseDataPremium() throws Exception {
		Document document = Jsoup.parse(TEST_DATA_PREMIUM);
		ServiceProvider serviceProvider = new ServiceProvider();
		populateAddressData(serviceProvider, document.getElementsByClass("provider_list").first());
		assertEquals("GenussPur - der schwäbische Cateringservice", serviceProvider.getName());
		assertEquals(
				"Unser Haus besitzt einen eigenen Cateringservice, der voll und ganz nach den saisonalen Gegebenheiten kocht - unseren regionalen Erzeugern sei Dank.",
				serviceProvider.getDescription());
		assertEquals("catering-1218-neu-ulm-genusspur-der-schwaebische-cateringservice-augsburg.php",
				serviceProvider.getSource());
		assertEquals("Dorfstraße 54 / 1", serviceProvider.getStreet());
		assertEquals("89233", serviceProvider.getZip());
		assertEquals("Neu Ulm", serviceProvider.getCity());
		assertEquals("(0731) 70 53 55 73", serviceProvider.getPhone());
		assertEquals("http://www.schwaebisch-geniessen.de", serviceProvider.getHomepage());
		assertEquals("robert@schwaebisch-geniessen.de", serviceProvider.getMail());
	}

	@Test
	public void itShouldParseData() throws Exception {
		Document document = Jsoup.parse(TEST_DATA);
		ServiceProvider serviceProvider = new ServiceProvider();
		populateAddressData(serviceProvider, document.getElementsByClass("provider_list").first());
		assertEquals("Donata Beauty & Hair", serviceProvider.getName());
		assertEquals("Ihre Spezialistin für Hochsteckfrisuren, Brautfrisuren, Haarverlängerungen",
				serviceProvider.getDescription());
		assertEquals("brautstyling-1147-donata-beauty-hair-augsburg.php", serviceProvider.getSource());
		assertEquals("Friedberger Str. 81", serviceProvider.getStreet());
		assertEquals("86161", serviceProvider.getZip());
		assertEquals("Augsburg", serviceProvider.getCity());
		assertEquals("(0821) 65 08 85 85", serviceProvider.getPhone());
	}

	@Test
	public void itShouldParseHomepage() throws Exception {
		Document document = Jsoup.parse(TEST2_DATA);
		ServiceProvider serviceProvider = new ServiceProvider();
		populateHomepage(serviceProvider, document);
		assertEquals("http://www.donata-beauty-hair.de", serviceProvider.getHomepage());
	}

	public static void populateAddressData(ServiceProvider serviceProvider, Element element) {
		Elements title = element.getElementsByClass("top");
		List<Node> childNodesTop = title.first().childNodes();
		for (Node node : childNodesTop) {
			if (node.nodeName().equals("a")) {
				GrabUtils.setValue(node.attr("href"), "source", serviceProvider);
				GrabUtils.setValue(node.childNodes().get(0).toString(), "name", serviceProvider);
			}
			else if (node.nodeName().equals("#text")) {
				GrabUtils.setValue(node.toString(), "description", serviceProvider);
			}
		}
		Elements bottom = element.getElementsByClass("bottom");
		for (int x = 0; x < bottom.size(); x++) {
			Element bottomElement = bottom.get(x);
			if (x == 0) {
				addressParser.processStreetAddress(serviceProvider, bottomElement);
			}
			else {
				List<Node> childNodesPhone = bottomElement.childNodes();
				for (Node node : childNodesPhone) {
					String value = node.toString();
					if (value.contains("Telefon")) {
						int pos = value.indexOf(':');
						String phone = value.substring(pos + 1);
						GrabUtils.setValue(phone, "phone", serviceProvider);
					}
					else if (node.nodeName().equals("a")) {
						String href = node.attr("href");
						if (href.startsWith("http")) {
							GrabUtils.setValue(href, "homepage", serviceProvider);
						}
					}
					else if (node.nodeName().equals("noscript")) {
						String subValue = node.childNodes().get(0).toString().trim();
						subValue = subValue.replaceAll("&#169;", "@");
						subValue = subValue.replaceAll("&copy;", "@");
						subValue = subValue.replaceAll("&#44;", ".");
						subValue = subValue.replaceAll(",", ".");
						subValue = subValue.replaceAll(" ", "");
						GrabUtils.setValue(subValue, "mail", serviceProvider);
					}
				}
			}
		}
	}

	public static void populateHomepage(ServiceProvider serviceProvider, Element element) {
		Elements aHrefs = element.getElementsByTag("a");
		for (Element aHref : aHrefs) {
			String value = aHref.attr("href");
			if (value.startsWith("http")) {
				GrabUtils.setValue(value, "homepage", serviceProvider);
			}
		}
	}

	public static List<ServiceProvider> processUrl(UrlWithCategory url) {
		List<ServiceProvider> result = new ArrayList<ServiceProvider>();
		try {
			Document document = Jsoup.parse(new URL(url.getUrl()), 10000);
			Elements elements = document.getElementsByClass("provider_list");
			for (Element element : elements) {
				ServiceProvider sp = new ServiceProvider();
				populateAddressData(sp, element);
				sp.setCategory(url.getCategory());
				if (hasText(sp.getSource())) {
					sp.setSource(url.getBaseUrl() + sp.getSource());
				}
				if (!hasText(sp.getHomepage()) && hasText(sp.getSource())) {
					Document detailsDocument = Jsoup.parse(new URL(sp.getSource()), 10000);
					Elements kontaktElements = detailsDocument.getElementsByClass("kontakt");
					if (!kontaktElements.isEmpty())
						populateHomepage(sp, kontaktElements.first());
				}
				result.add(sp);
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static void main(String[] args) {
		UrlWithCategory url = new UrlWithCategory("http://www.hochzeitsportal-augsburg.de/",
				"http://www.hochzeitsportal-augsburg.de/catering.php", "");
		List<ServiceProvider> spList = processUrl(url);
		GrabUtils.writeJsonObject(spList, "service-provider-list.json");
	}
}
