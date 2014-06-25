package de.grundid.dienstleister;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkGrabber {

	private String baseUrl;

	public LinkGrabber(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public List<UrlWithCategory> getUrls() {
		List<UrlWithCategory> result = new ArrayList<UrlWithCategory>();
		try {
			Document document = Jsoup.parse(new URL(baseUrl), 10000);
			Elements elements = document.getElementsByAttributeValue("id", "navi_left");
			Element naviLeft = elements.get(0);
			Elements links = naviLeft.getElementsByTag("a");
			for (Element element : links) {
				String url = baseUrl + element.attr("href");
				String category = element.attr("title");
				result.add(new UrlWithCategory(baseUrl, url, category));
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}
}
