package de.grundid.dienstleister.geocoding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCoderResult {

	private GeoCoderGeometry geometry;

	public GeoCoderGeometry getGeometry() {
		return geometry;
	}

	public void setGeometry(GeoCoderGeometry geometry) {
		this.geometry = geometry;
	}
}
