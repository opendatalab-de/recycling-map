package de.grundid.amenity;

import java.util.Date;

public class AmenityData extends OsmObject {

	private float lat;
	private float lon;

	private Date lastModified;

	public AmenityData(long id, float lat, float lon) {
		this.id = id;
		this.lat = lat;
		this.lon = lon;
	}

	public float getLat() {
		return lat;
	}

	public float getLon() {
		return lon;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Name: " + tags.get("name") + " A: " + tags.get("amenity") + " City: " + tags.get("addr:city") + " OH: "
				+ tags.get("opening_hours");
	}

}
