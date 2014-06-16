package de.grundid.standesamt;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DetailListGrabber {

	private Logger log = LoggerFactory.getLogger(getClass());

	public List<String> getUrls() {
		List<String> detailUrls = new ArrayList<String>();
		try {
			for (int startIndex = 0; startIndex < 700; startIndex += 50) {
				String url = "http://www.hochzeit-premium.de/ratgeberplanung/standesaemter.html?limitstart="
						+ startIndex;
				log.info("Get: " + url);
				Document document = Jsoup.parse(new URL(url), 10000);
				detailUrls.addAll(parseLinksToDetails(document));
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return detailUrls;
	}

	protected List<String> parseLinksToDetails(Document document) {
		List<String> urls = new ArrayList<String>();
		Elements elements = document.getElementsByAttributeValue("class", "cat-list-row");
		for (Element element : elements) {
			Elements aHref = element.getElementsByTag("a");
			for (Element option : aHref) {
				String value = option.attr("href");
				if (value.contains("standesaemter")) {
					urls.add(value);
				}
			}
		}
		return urls;
	}

	public String parseItemContentPage(String url) throws MalformedURLException, IOException {
		log.info("Parse: " + url);
		Document document = Jsoup.parse(new URL(url), 10000);
		StringBuilder sb = new StringBuilder();
		Elements itemPageElements = document.getElementsByClass("item-page");
		for (Element element : itemPageElements) {
			Elements ignoreElements = element.getElementsByAttributeValue("id", "social_bookmarks");
			ignoreElements.remove();
			sb.append(element.html());
		}
		return sb.toString();
	}
}
