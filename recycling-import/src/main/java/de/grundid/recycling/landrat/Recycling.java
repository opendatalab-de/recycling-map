package de.grundid.recycling.landrat;

import org.springframework.util.StringUtils;

public class Recycling {

	private String name;
	private String zipCity;
	private String street;
	private String googleMapsLink;
	private String openingHours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipCity() {
		return zipCity;
	}

	public void setZipCity(String zipCity) {
		this.zipCity = zipCity;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getGoogleMapsLink() {
		return googleMapsLink;
	}

	public void setGoogleMapsLink(String googleMapsLink) {
		this.googleMapsLink = googleMapsLink;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	@Override
	public String toString() {
		return name + "|" + zipCity + "|" + street + "|" + googleMapsLink + "|" + openingHours;
	}

	public void appendAddress(String textContent) {
		if (StringUtils.hasText(textContent)) {

			if (StringUtils.hasText(zipCity)) {
				street = textContent;
			}
			else {
				zipCity = textContent;
			}
		}
	}
}
