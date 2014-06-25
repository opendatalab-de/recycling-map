package de.grundid.dienstleister;

import java.util.ArrayList;
import java.util.List;

import de.grundid.utils.GrabUtils;

public class ServiceProviderCategoryLinkGrabber {

	private String[] TEST_URLS = { "http://www.hochzeitsportal-augsburg.de/" };
	private String[] URLS = { "http://www.hochzeitsportal-augsburg.de/", "http://www.hochzeitsportal-bodensee.de/",
			"http://www.hochzeitsportal-dortmund.de/", "http://www.hochzeitsportal-duesseldorf.de/",
			"http://www.hochzeitsportal-essen.de/", "http://www.heiraten-in-frankfurt-am-main.de/",
			"http://www.hochzeitsportal-freiburg.de/", "http://www.hochzeitsportal-hannover.de/",
			"http://www.heiraten-in-heidelberg-mannheim.de/", "http://www.heiraten-in-heilbronn.de/",
			"http://www.hochzeitsportal-karlsruhe.de/", "http://www.hochzeitsportal-koeln.de/",
			"http://www.heiraten-in-ludwigsburg.de/", "http://www.heiraten-in-mainz-wiesbaden.de/",
			"http://www.hochzeitsportal-muenchen.de/", "http://www.hochzeitsportal-nuernberg.de/",
			"http://www.hochzeitsportal-schwarzwald.de/", "http://www.hochzeitsportal-stuttgart.de/",
			"http://www.heiraten-in-tuebingen-reutlingen.de/", "http://www.heiraten-in-ulm.de/",
			"http://www.hochzeitsportal-wuerzburg.de/", };

	private void run() {
		List<UrlWithCategory> urls = new ArrayList<UrlWithCategory>();
		List<ServiceProvider> spList = new ArrayList<ServiceProvider>();
		for (String baseUrl : URLS) {
			LinkGrabber linkGrabber = new LinkGrabber(baseUrl);
			List<UrlWithCategory> categoryLinks = linkGrabber.getUrls();
			System.out.println("Category links for " + baseUrl + " => " + categoryLinks.size());
			urls.addAll(categoryLinks);
			for (UrlWithCategory urlWithCategory : categoryLinks) {
				try {
					List<ServiceProvider> providers = ProviderGrabber.processUrl(urlWithCategory);
					spList.addAll(providers);
					System.out.println("Providers: " + providers.size());
				}
				catch (Exception e) {
					System.out.println(urlWithCategory.getUrl());
					e.printStackTrace();
				}
			}
		}
		System.out.println("All service providers: " + spList.size());
		GrabUtils.writeJsonObject(urls, "service-provider-source-links.json");
		GrabUtils.writeJsonObject(spList, "service-provider-complete.json");
	}

	public static void main(String[] args) {
		new ServiceProviderCategoryLinkGrabber().run();
	}
}
