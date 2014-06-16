package de.grundid.standesamt;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.grundid.recycling.ResourceUtils;
import de.grundid.utils.GrabUtils;

public class ListGrabber {

	public static void main(String[] args) {
		DetailListGrabber detailListGrabber = new DetailListGrabber();
		//		List<String> urls = detailListGrabber.getUrls();
		//		for (String url : urls) {
		//			System.out.println(url);
		//		}
		//		GrabUtils.writeJsonObject(urls, "standesamt-detail-urls.json");
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			String[] detailUrls = objectMapper.readValue(
					ResourceUtils.getResourceAsString("standesamt-detail-urls.json", "UTF-8"), String[].class);
			Map<String, String> standesaemter = new HashMap<String, String>();
			for (String urlExtension : detailUrls) {
				String url = "http://www.hochzeit-premium.de" + urlExtension;
				String contentPage = detailListGrabber.parseItemContentPage(url);
				standesaemter.put(url, contentPage);
			}
			GrabUtils.writeJsonObject(standesaemter, "standesamt-detail-map.json");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
