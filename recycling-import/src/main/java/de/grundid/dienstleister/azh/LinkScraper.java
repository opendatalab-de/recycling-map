package de.grundid.dienstleister.azh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import de.grundid.dienstleister.UrlWithCategory;
import de.grundid.utils.GrabUtils;

public class LinkScraper {

	private static final String[] URL = { "http://www.alles-zur-hochzeit.de/Hochzeitsmode_Braut__Br%C3%A4utigam",
			"http://www.alles-zur-hochzeit.de/Hochzeitsstyling__Beauty",
			"http://www.alles-zur-hochzeit.de/Hochzeitsschmuck__Ringe",
			"http://www.alles-zur-hochzeit.de/Hochzeit_Trauung",
			"http://www.alles-zur-hochzeit.de/Hochzeitsorte__Locations",
			"http://www.alles-zur-hochzeit.de/Hochzeitsfoto__Videograf",
			"http://www.alles-zur-hochzeit.de/Hochzeitscatering__Torte",
			"http://www.alles-zur-hochzeit.de/Hochzeitsfahrzeuge",
			"http://www.alles-zur-hochzeit.de/Hochzeitsfeier_Programm",
			"http://www.alles-zur-hochzeit.de/Hochzeitsplanung" };
	private static final String[] CATEGORIES = { "Mode", "Styling", "Schmuck", "Trauung", "Location", "Foto",
			"Catering", "Fahrzeug", "Programm", "Planung" };

	public static Document parse(String url) throws IOException {
		Connection con = HttpConnection.connect(url);
		con.timeout(10000);
		con.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36");
		con.header("host", "www.alles-zur-hochzeit.de");
		return con.get();
	}

	public static List<UrlWithCategory> findCityLinks(int depth, String category, String baseUrl, String url) {
		List<UrlWithCategory> result = new ArrayList<UrlWithCategory>();
		try {
			System.out.println("Get: " + url);
			Document document = parse(url);
			Elements table = document.getElementsByClass("table_v1");
			Element first = table.first();
			Elements links = first.getElementsByClass("txt_marked_big");
			for (Element element : links) {
				if (depth == 1) {
					result.addAll(findCityLinks(depth + 1, category, baseUrl, baseUrl + element.attr("href")));
				}
				else {
					result.add(new UrlWithCategory(baseUrl, baseUrl + element.attr("href"), category));
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	private void run() {
		List<UrlWithCategory> allLinks = new ArrayList<UrlWithCategory>();
		for (int x = 0; x < CATEGORIES.length; x++) {
			List<UrlWithCategory> links = findCityLinks(1, CATEGORIES[x], "http://www.alles-zur-hochzeit.de", URL[x]);
			allLinks.addAll(links);
		}
		System.out.println("Links: " + allLinks.size());
		GrabUtils.writeJsonObject(allLinks, "azh-links.json");
	}

	public static void main(String[] args) {
		if (CATEGORIES.length != URL.length) {
			System.out.println("Error");
			return;
		}
		else
			new LinkScraper().run();
	}
}
