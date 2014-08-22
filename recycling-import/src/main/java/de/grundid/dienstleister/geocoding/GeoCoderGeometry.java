package de.grundid.dienstleister.geocoding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCoderGeometry {

	private GeoCoderLocation location;

	public GeoCoderLocation getLocation() {
		return location;
	}

	public void setLocation(GeoCoderLocation location) {
		this.location = location;
	}
}
