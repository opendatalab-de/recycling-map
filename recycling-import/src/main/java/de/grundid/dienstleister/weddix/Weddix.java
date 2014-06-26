package de.grundid.dienstleister.weddix;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.dienstleister.UrlWithCategory;
import de.grundid.recycling.ResourceUtils;
import de.grundid.utils.GrabUtils;

public class Weddix {

	private List<ServiceProvider> processPages(UrlWithCategory url) {
		List<ServiceProvider> spList = new ArrayList<ServiceProvider>();
		try {
			Document document = Jsoup.parse(new URL(url.getUrl()), 10000);
			Elements serviceProviderTables = WeddixScraper.findServiceProviderTables(document);
			for (Element table : serviceProviderTables) {
				ServiceProvider sp = new ServiceProvider();
				sp.setCategory(url.getCategory());
				WeddixScraper.populateData(sp, table);
				System.out.println("Loading: " + sp.getSource());
				Document details = Jsoup.parse(new URL(sp.getSource()), 10000);
				Element detailsCell = WeddixScraper.findDetailsCell(details);
				WeddixScraper.populateDetails(sp, detailsCell);
				spList.add(sp);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return spList;
	}

	private void run() {
		//		collectUrls();
		processUrls();
	}

	private void processUrls() {
		List<ServiceProvider> spList = new ArrayList<ServiceProvider>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			UrlWithCategory[] urls = objectMapper.readValue(
					ResourceUtils.getResourceAsString("weddix-links.json", "UTF-8"), UrlWithCategory[].class);
			System.out.println("Loaded: " + urls.length);
			Set<UrlWithCategory> uniqueUrls = new HashSet<UrlWithCategory>();
			for (UrlWithCategory urlWithCategory : urls) {
				uniqueUrls.add(urlWithCategory);
			}
			System.out.println("Processing: " + uniqueUrls.size());
			for (UrlWithCategory urlWithCategory : uniqueUrls) {
				List<ServiceProvider> pages = processPages(urlWithCategory);
				System.out.println("Found: " + urlWithCategory.getUrl() + " => " + pages.size());
				spList.addAll(pages);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Found total: " + spList.size());
		GrabUtils.writeJsonObject(spList, "weddix-service-provider.json");
	}

	private void collectUrls() {
		try {
			Document document = Jsoup.parse(new URL(
					"http://www.weddix.de/branchenbuch-dienstleistung-fuer-hochzeit.html"), 10000);
			Elements elementsByClass = document.getElementsByClass("leftNavContainer");
			List<UrlWithCategory> categoryPages = new ArrayList<UrlWithCategory>();
			Set<UrlWithCategory> categories = new HashSet<UrlWithCategory>(WeddixScraper.findCategories(
					"http://www.weddix.de/", elementsByClass.first()));
			System.out.println("Categories: " + categories.size());
			for (UrlWithCategory urlWithCategory : categories) {
				Document page = Jsoup.parse(new URL(urlWithCategory.getUrl()), 10000);
				Elements pagesNav = page.getElementsByClass("xnavigation");
				if (!pagesNav.isEmpty()) {
					List<UrlWithCategory> pages = WeddixScraper.findPages(urlWithCategory, pagesNav.first());
					System.out.println("Category Pages for " + urlWithCategory.getCategory() + " => " + pages.size());
					categoryPages.addAll(pages);
				}
			}
			categories.addAll(categoryPages);
			GrabUtils.writeJsonObject(categories, "weddix-links.json");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Weddix().run();
	}
}
