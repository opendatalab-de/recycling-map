package de.grundid.dienstleister.azh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.dienstleister.UrlWithCategory;
import de.grundid.utils.GrabUtils;

public class Azh {

	private void run() {
		List<ServiceProvider> spAll = new ArrayList<ServiceProvider>();
		Set<UrlWithCategory> uniqueUrls = getUniqueUrls();
		int counter = 0;
		long startTime = System.currentTimeMillis();
		for (UrlWithCategory urlWithCategory : uniqueUrls) {
			counter++;
			long time = System.currentTimeMillis() - startTime;
			System.out.println(counter + " / " + (time / 60000) + "min => " + urlWithCategory.getUrl());
			try {
				Document page = LinkScraper.parse(urlWithCategory.getUrl());
				ServiceProvider sp = new ServiceProvider();
				sp.setCategory(urlWithCategory.getCategory());
				sp.setSource(urlWithCategory.getUrl());
				Elements tables = page.getElementsByClass("table_v1");
				Element firstTable = tables.first();
				DetailScraper.populateData(sp, firstTable);
				DetailScraper.populatePhone(sp, firstTable.nextElementSibling());
				spAll.add(sp);
			}
			catch (Exception e) {
				System.out.println(urlWithCategory.getUrl() + " => " + e.getMessage());
			}
		}
		GrabUtils.writeJsonObject(spAll, "azh-service-provider.json");
	}

	private Set<UrlWithCategory> getUniqueUrls() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			UrlWithCategory[] urls = objectMapper.readValue(
					GrabUtils.readFully(Azh.class.getResourceAsStream("/azh-links.json")), UrlWithCategory[].class);
			System.out.println("Loaded: " + urls.length);
			Set<UrlWithCategory> uniqueUrls = new HashSet<UrlWithCategory>();
			for (UrlWithCategory urlWithCategory : urls) {
				uniqueUrls.add(urlWithCategory);
			}
			System.out.println("Processing: " + uniqueUrls.size());
			return uniqueUrls;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		new Azh().run();
	}
}
