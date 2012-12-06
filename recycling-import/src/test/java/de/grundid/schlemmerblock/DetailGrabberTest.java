package de.grundid.schlemmerblock;

import org.junit.Test;

import de.grundid.HtmlTestUtils;

public class DetailGrabberTest {

	@Test
	public void testGetSbAmenity() {
		DetailGrabber detailGrabber = new DetailGrabber();
		detailGrabber.getSbAmenity(HtmlTestUtils.htmlPageOf("schlemmerblock-details.htm"));
	}
}
