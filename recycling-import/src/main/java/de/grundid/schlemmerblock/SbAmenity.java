package de.grundid.schlemmerblock;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class SbAmenity {

	private static final String LAT_LNG_FUNCTION = "new GLatLng(";
	private String name;
	private String street;
	private String zip;
	private String city;
	private String tel;
	private String description;
	private String url;
	private String openingHours;
	private String website;
	private String menuUrl;
	private String lat;
	private String lon;

	public SbAmenity(Document document, String url) {
		this.url = url;
		Element addressContainer = document.getElementById("gutscheinbon_container_content").child(0);
		this.name = addressContainer.getElementsByClass("gutscheinbon_title").text().trim();

		List<TextNode> addressTextNodes = addressContainer.textNodes();
		this.street = addressTextNodes.get(1).text().trim();
		this.tel = addressTextNodes.get(3).text().trim().replace("Tel.: ", "");

		String zipCity = addressTextNodes.get(2).text().trim();
		this.zip = zipCity.substring(0, 5);
		this.city = zipCity.substring(6);

		if (document.getElementById("container_oeffnungszeiten") != null) {
			this.openingHours = document.getElementById("container_oeffnungszeiten").child(1).text();
		}
		if (document.getElementById("container_beschreibung") != null) {
			this.description = document.getElementById("container_beschreibung").child(1).text().trim();
		}

		for (Element element : document.getElementsByTag("a")) {
			if ("Webseite besuchen".equals(element.text().trim())) {
				this.website = element.attr("href");
			}
			if ("Speisekarte".equals(element.text().trim())) {
				this.menuUrl = element.attr("href");
			}
		}

		Elements scriptTags = document.getElementsByTag("script");
		int begin = scriptTags.html().indexOf(LAT_LNG_FUNCTION);
		if (begin > -1) {
			int end = scriptTags.html().indexOf(")", begin);
			String[] latLon = scriptTags.html().substring(begin + LAT_LNG_FUNCTION.length(), end).split(",");
			this.lat = latLon[0].replace("\"", "").trim();
			this.lon = latLon[1].replace("\"", "").trim();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "SbAmenity [name=" + name + ", street=" + street + ", zip=" + zip + ", city=" + city + ", tel=" + tel
				+ ", url=" + url + ", website=" + website + ", menuUrl=" + menuUrl + ", lat=" + lat + ", lon=" + lon
				+ "]";
	}
}
