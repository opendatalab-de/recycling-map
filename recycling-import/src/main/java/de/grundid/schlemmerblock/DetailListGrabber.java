package de.grundid.schlemmerblock;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
			Document document = Jsoup.parse(new URL("http://www.schlemmerblock.de/Regionsuche"), 10000);

			List<String> regions = parsePage(document);

			for (String regionUrl : regions) {
				log.info("Getting region: " + regionUrl);

				Document detailPage = Jsoup.parse(new URL(regionUrl), 10000);
				List<String> detailLinks = parseRegionPage(detailPage);
				detailUrls.addAll(detailLinks);
			}

		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return detailUrls;
	}

	protected List<String> parsePage(Document document) {
		List<String> urls = new ArrayList<String>();
		Elements elements = document.getElementsByAttributeValue("class", "oswselect");

		for (Element element : elements) {
			Elements options = element.getElementsByTag("option");
			for (Element option : options) {
				String value = option.attr("value");
				if (value.startsWith("http")) {
					urls.add(value);
				}
			}
		}

		return urls;
	}

	protected List<String> parseRegionPage(Document document) {
		List<String> urls = new ArrayList<String>();
		Elements aLinks = document.getElementsByTag("a");

		for (Element link : aLinks) {
			String attr = link.attr("class");
			if (attr.startsWith("farbe_")) {
				String value = link.attr("href");
				if (value.startsWith("http")) {
					urls.add(value);
				}
			}
		}
		return urls;
	}

	public List<String> filterDoubles(List<String> list) {
		Set<String> urlSet = new HashSet<String>();

		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String url = it.next();
			String baseUrl = url.substring(0, url.lastIndexOf('_'));

			if (!urlSet.contains(baseUrl)) {
				urlSet.add(baseUrl);
			}
			else {
				it.remove();
			}
		}
		return list;
	}
}
