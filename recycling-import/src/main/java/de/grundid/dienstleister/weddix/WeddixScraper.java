package de.grundid.dienstleister.weddix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.dienstleister.UrlWithCategory;
import de.grundid.utils.AddressParser;
import de.grundid.utils.GrabUtils;

public class WeddixScraper {

	private static final Pattern ZIP_PATTERN = Pattern.compile("^\\d\\d\\d\\d\\d .*");
	private static final String MAIN_NAV = "<div class=\"leftNavContainer\">\n"
			+ "	<div class=\"leftNavRoot top\">"
			+ "<a class=\"leftNavLink selected\" href=\"http://www.weddix.de/branchenbuch-brautfrisur-brautschmuck.html\">Brautfrisur &amp; Beauty</a></div>"
			+ "<div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-brautkleider-brautschuhe-brautmode.html\">Brautmode</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-braeutigam-mode.html\">Bräutigam Mode</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-brautstrauss-hochzeitsdekoration.html\">Brautstrauß &amp; Hochzeitsdekoration</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/feuerwerk-hochzeit.html\">Feuerwerk zur Hochzeit</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-freie-trauungen.html\">Freie Trauung</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeit/gastgeschenke-hochzeit.html\">Gastgeschenke</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitskutsche-hochzeitsauto.html\">Hochzeitsauto</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitsfotograf.html\">Hochzeitsfotograf &amp; Video</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/hochzeitsgeschenk.html\">Hochzeitsgeschenke</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/hochzeits-homepage.html\">Hochzeitshomepage</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitsmesse.html\">Hochzeitsmessen</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitsmusik-hochzeitsunterhaltung.html\">Hochzeitsmusik &amp; Unterhaltung</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitsplanung-silberhochzeit.html\">Hochzeitsplanung</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/drucksachen.html\">Hochzeitsprint</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/hochzeitstauben.html\">Hochzeitstauben</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/hochzeitstisch.html\">Hochzeitstisch</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitstorten.html\">Hochzeitstorte</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/hochzeit-versicherung-finanzen.html\">Hochzeitsversicherung &amp; Finanzen</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/hochzeitsvideo.html\">Hochzeitsvideo</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeit/kinderbetreuung-hochzeit.html\">Kinderbetreuung</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-hochzeitsfeier-partyservice.html\">Partyservice/ Catering</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/reiseservice-heiraten-im-ausland.html\">Reiseservice</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/tanzunterricht.html\">Tanzunterricht Hochzeit</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch-trauringe-brautschmuck.html\">Trauring &amp; Brautschmuck</a></div><div class=\"leftNavRoot\"><a class=\"leftNavLink\" href=\"http://www.weddix.de/branchenbuch/wein-mehr.html\">Wein &amp; mehr</a></div>\n"
			+ "	</div>\n";
	private static final String TOP_NAV = "	<table class=\"xnavigation\" cellpadding=\"0\" cellspacing=\"0\">\n"
			+ "	<tbody><tr>\n"
			+ "	<td class=\"pageNavActive\">1</td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a href=\"http://www.weddix.de/branchenbuch/brautmode-2.html\" class=\"pageNavLink\">2</a></td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a href=\"http://www.weddix.de/branchenbuch/brautmode-3.html\" class=\"pageNavLink\">3</a></td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a href=\"http://www.weddix.de/branchenbuch/brautmode-4.html\" class=\"pageNavLink\">4</a></td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a href=\"http://www.weddix.de/branchenbuch/brautmode-5.html\" class=\"pageNavLink\">5</a></td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a class=\"pageNavLink\" href=\"http://www.weddix.de/branchenbuch/brautmode-2.html\"><img src=\"/weddix3-img/product-detail-page-next.gif\" alt=\"\"></a></td>\n"
			+ "	<td class=\"xnavigationSpan\"><img src=\"/common-img/d.gif\" alt=\"\"></td>\n"
			+ "	<td><a class=\"pageNavLink\" href=\"http://www.weddix.de/branchenbuch/brautmode-6.html\"><img src=\"/weddix3-img/product-detail-page-next.gif\" alt=\"\"><img src=\"/weddix3-img/product-detail-page-next.gif\" alt=\"\"></a></td>\n"
			+ "	</tr>\n" + "	</tbody></table>\n";
	private static final String LIST_TABLE = "<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" style=\"width:100%\">\n"
			+ "<tbody><tr>\n"
			+ "<td valign=\"top\" style=\"width:172px;height:140px;\">\n"
			+ "<a href=\"http://www.weddix.de/brautmode/emanuel-hendrik/individuelle-brautmode.html\" rel=\"nofollow\">\n"
			+ "<img src=\"/weddix-cms-media/w172_0/weddix-cms-media/images/media-base/1188336/emanuel-hendrik-teaser-neu.jpg\" width=\"172\" style=\"border:none;\" alt=\"emanuel hendrik / individuelle Brautmode\" title=\"emanuel hendrik / individuelle Brautmode\">\n"
			+ "</a>\n"
			+ "</td>\n"
			+ "<td style=\"width: 20px;\"><img src=\"/weddix2-img/d.gif\" alt=\"\"></td>\n"
			+ "<td class=\"commonText\" style=\"vertical-align:middle;padding-left:0;padding-right:0;width:236px;\">\n"
			+ "<h2><a class=\"pageNavLink\" style=\"color:black;\" href=\"http://www.weddix.de/brautmode/emanuel-hendrik/individuelle-brautmode.html\">emanuel hendrik / individuelle Brautmode</a></h2><br>\n"
			+ "<i>Jedes Design ein Unikat - Mach keine Kompromisse!<br></i><br>\n"
			+ "40479&nbsp;Düsseldorf&nbsp;\n"
			+ "</td>\n"
			+ "<td style=\"width: 20px;\"><img src=\"/weddix2-img/d.gif\" alt=\"\"></td>\n"
			+ "<td class=\"commonText\" style=\"width: 108px; text-align: right;vertical-align: middle;\">\n"
			+ "<a class=\"pageNavLink\" href=\"http://www.weddix.de/brautmode/emanuel-hendrik/individuelle-brautmode.html\" rel=\"nofollow\">\n"
			+ "<img src=\"/weddix2-img/more_info_branchenbuch.gif\" style=\"width: 81px; height: 19px;\" border=\"0\" alt=\"\">\n"
			+ "</a>\n"
			+ "</td>\n"
			+ "</tr>\n"
			+ "<tr>\n"
			+ "<td colspan=\"2\"><img src=\"/weddix2-img/d.gif\" style=\"width: 1px; height: 10px;\" alt=\"\"></td>\n"
			+ "</tr>\n" + "</tbody></table>";
	private static final String DETAILS = "<table><tr><td valign=\"top\" align=\"left\">\n"
			+ "<h2>emanuel hendrik / individuelle Brautmode</h2><br>\n" + "<div>Prinz-Georg-Straße 114\n" + "</div>\n"
			+ "<div>40479 Düsseldorf\n" + "</div>\n" + "<div>\n" + "Deutschland\n" + "</div><br>\n"
			+ "<div>Tel.: (0211) 36 77 78 44</div>\n" + "<div>\n"
			+ "<a class=\"pageNavLink\" target=\"_blank\" href=\"http://www.emanuelhendrik.com\">\n"
			+ "www.emanuelhendrik.com\n" + "</a>\n" + "</div>\n" + "<br>\n" + "</td></tr></table>";

	@Test
	public void itShouldFindCategories() throws Exception {
		Document document = Jsoup.parse(MAIN_NAV);
		Elements elementsByClass = document.getElementsByClass("leftNavContainer");
		List<UrlWithCategory> categories = findCategories("baseUrl", elementsByClass.first());
		UrlWithCategory first = categories.get(0);
		assertEquals("baseUrl", first.getBaseUrl());
		assertEquals("http://www.weddix.de/branchenbuch-brautfrisur-brautschmuck.html", first.getUrl());
		assertEquals("Brautfrisur & Beauty", first.getCategory());
		assertEquals(26, categories.size());
	}

	public static List<UrlWithCategory> findCategories(String baseUrl, Element element) {
		List<UrlWithCategory> result = new ArrayList<UrlWithCategory>();
		Elements elements = element.getElementsByClass("leftNavLink");
		for (Element ahref : elements) {
			String href = ahref.attr("href");
			String category = GrabUtils.trimAndUnescape(ahref.text());
			UrlWithCategory urlWithCategory = new UrlWithCategory(baseUrl, href, category);
			result.add(urlWithCategory);
		}
		return result;
	}

	@Test
	public void itShouldFindPages() throws Exception {
		Document document = Jsoup.parse(TOP_NAV);
		Elements elementsByClass = document.getElementsByClass("xnavigation");
		List<UrlWithCategory> categories = findPages(new UrlWithCategory("baseUrl", "", "category"),
				elementsByClass.first());
		UrlWithCategory first = categories.get(0);
		assertEquals("baseUrl", first.getBaseUrl());
		assertEquals("http://www.weddix.de/branchenbuch/brautmode-2.html", first.getUrl());
		assertEquals("category", first.getCategory());
		assertEquals(6, categories.size());
	}

	public static List<UrlWithCategory> findPages(UrlWithCategory url, Element element) {
		List<UrlWithCategory> result = new ArrayList<UrlWithCategory>();
		Elements elements = element.getElementsByClass("pageNavLink");
		for (Element ahref : elements) {
			String href = ahref.attr("href");
			UrlWithCategory urlWithCategory = new UrlWithCategory(url.getBaseUrl(), href, url.getCategory());
			result.add(urlWithCategory);
		}
		return result;
	}

	@Test
	public void itShouldPopulateData() throws Exception {
		Document document = Jsoup.parse(LIST_TABLE);
		Elements elementsByClass = document.getElementsByTag("table");
		ServiceProvider sp = new ServiceProvider();
		populateData(sp, elementsByClass.first());
		assertEquals("emanuel hendrik / individuelle Brautmode", sp.getName());
		assertEquals("http://www.weddix.de/brautmode/emanuel-hendrik/individuelle-brautmode.html", sp.getSource());
		assertEquals("Jedes Design ein Unikat - Mach keine Kompromisse!", sp.getDescription());
	}

	public static void populateData(ServiceProvider sp, Element element) {
		Elements elements = element.getElementsByClass("pageNavLink");
		Element first = elements.first();
		sp.setSource(first.attr("href"));
		GrabUtils.setValue(first.text(), "name", sp);
		Elements desc = element.getElementsByTag("i");
		Element descElement = desc.first();
		GrabUtils.setValue(descElement.text(), "description", sp);
	}

	@Test
	public void itShouldPopulateDetails() throws Exception {
		Document document = Jsoup.parse(DETAILS);
		Elements elementsByClass = document.getElementsByTag("td");
		ServiceProvider sp = new ServiceProvider();
		populateDetails(sp, elementsByClass.first());
		assertEquals("Prinz-Georg-Straße 114", sp.getStreet());
		assertEquals("40479", sp.getZip());
		assertEquals("Düsseldorf", sp.getCity());
		assertEquals("(0211) 36 77 78 44", sp.getPhone());
		assertEquals("http://www.emanuelhendrik.com", sp.getHomepage());
	}

	public static void populateDetails(ServiceProvider sp, Element element) {
		Elements divs = element.getElementsByTag("div");
		for (Element div : divs) {
			String value = div.text().trim();
			if (ZIP_PATTERN.matcher(value).matches()) {
				AddressParser.splitZipCity(value, sp);
			}
			else if (value.startsWith("Tel")) {
				int pos = value.indexOf(':');
				String phone = value.substring(pos + 1);
				GrabUtils.setValue(phone, "phone", sp);
			}
			else {
				GrabUtils.setValue(value, "street", sp);
			}
		}
		Elements ahref = element.getElementsByClass("pageNavLink");
		if (!ahref.isEmpty()) {
			GrabUtils.setValue(ahref.first().attr("href"), "homepage", sp);
		}
	}

	@Test
	public void itShouldFindSpTable() throws Exception {
		Document document = Jsoup.parse(readFully("/weddix-test.html"));
		Elements tables = findServiceProviderTables(document);
		assertNotNull(tables);
		assertEquals(20, tables.size());
	}

	public static Elements findServiceProviderTables(Document document) {
		Element worksheet = document.getElementById("worksheet");
		Elements listViewBoxes = worksheet.getElementsByClass("changeListViewBox");
		Element listViewBox = listViewBoxes.first();
		if (listViewBox != null) {
			Element parent = listViewBox.parent().parent().nextElementSibling();
			return parent.getElementsByTag("table");
		}
		return null;
	}

	@Test
	public void itShouldFindDetailsCell() throws Exception {
		Document document = Jsoup.parse(readFully("/weddix-details.html"));
		Element detailsCell = findDetailsCell(document);
		assertNotNull(detailsCell);
		assertEquals(
				"Krause & Sohn GmbH Kaufbacher Ring 2 01723 Kesselsdorf Deutschland Tel.: (035204) 794 040 Fax: (035204) 794 041 www.karneval-feuerwerk.de",
				detailsCell.text());
	}

	private String readFully(String filename) throws IOException {
		StringBuilder sb = new StringBuilder();
		List<String> lines = IOUtils.readLines(Weddix.class.getResourceAsStream(filename), "UTF-8");
		for (String string : lines) {
			sb.append(string).append("\n");
		}
		return sb.toString();
	}

	public static Element findDetailsCell(Document document) {
		Element map = document.getElementById("map_canvas");
		Element parentTr = map.parent().parent();
		Element myTr = parentTr.previousElementSibling().previousElementSibling();
		return myTr.getElementsByTag("td").first();
	}
}
