package de.grundid.schlemmerblock;

import java.util.List;

import de.grundid.utils.GrabUtils;

public class Grabber {

	public static void main(String[] args) {
		DetailListGrabber detailListGrabber = new DetailListGrabber();
		List<String> detailUrls = detailListGrabber.getUrls();
		GrabUtils.writeJsonObject(detailUrls, "import-schlemmerblock-details-links.json");
		System.out.println(detailUrls.size());
	}
}
