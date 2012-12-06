package de.grundid.schlemmerblock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.jsoup.Jsoup;
import org.junit.Test;

import de.grundid.recycling.ResourceUtils;

public class SbAmenityTest {

	private static final String TEST_RESOURCE_1 = ResourceUtils.getResourceAsString("schlemmerblock-details.htm",
			"ISO-8859-1");
	private static final String TEST_RESOURCE_2 = ResourceUtils.getResourceAsString("schlemmerblock-details2.htm",
			"ISO-8859-1");

	@Test
	public void testGetSbAmenity() {
		SbAmenity amenity = new SbAmenity(Jsoup.parse(TEST_RESOURCE_1), "");

		assertEquals("China Restaurant Hong-Kong Inn", amenity.getName());
		assertEquals("Olgastraße 55", amenity.getStreet());
		assertEquals("74072", amenity.getZip());
		assertEquals("Heilbronn", amenity.getCity());
		assertEquals("07131-86738", amenity.getTel());
		assertEquals("Mo. + Mi. - So. von 11.30 - 14.30 Uhr und von 17.00 - 23.00 Uhr Di. von 11.30 - 14.30 Uhr",
				amenity.getOpeningHours());
		assertNull(amenity.getWebsite());
		assertNotNull(amenity.getDescription());
	}

	@Test
	public void testGetSbAmenity2() {
		SbAmenity amenity = new SbAmenity(Jsoup.parse(TEST_RESOURCE_2), "");

		assertEquals("Ristorante La Toscana", amenity.getName());
		assertEquals("Südstraße 88", amenity.getStreet());
		assertEquals("74072", amenity.getZip());
		assertEquals("Heilbronn", amenity.getCity());
		assertEquals("07131-627410", amenity.getTel());
		assertEquals(
				"Mo. - Fr. von 11.00 - 14.30 Uhr und von 17.00 - 24.00 Uhr Sa., So. + Feiertage von 11.00 - 24.00 Uhr Warme Küche bis 23.00 Uhr",
				amenity.getOpeningHours());
		assertEquals("http://www.la-toscana.de", amenity.getWebsite());
		assertEquals(
				"Im La Toscana erwarten Sie eine große Auswahl italienischer Spezialitäten, eine gemütliche Atmosphäre und ein Team, das es versteht, seine Gäste zu verwöhnen.",
				amenity.getDescription());
		assertEquals("http://www.la-toscana.de/speisekarte/speisekarte.pdf", amenity.getMenuUrl());
		assertEquals("49.1343", amenity.getLat());
		assertEquals("9.21925", amenity.getLon());
	}
}
