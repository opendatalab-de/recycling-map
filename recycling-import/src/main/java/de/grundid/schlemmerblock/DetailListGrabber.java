package de.grundid.schlemmerblock;

import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DetailListGrabber {

	public List<String> getUrls() {
		try {
			WebClient webClient = new WebClient();
			HtmlPage page = webClient.getPage("");
			return parsePage(page);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected List<String> parsePage(HtmlPage page) {
		List<String> urls = new ArrayList<String>();
		return urls;
	}
}
