package de.grundid.recycling;

import java.util.Map;
import java.util.TreeMap;

public class RecyclingData {

	private long nodeId;
	private double lon;
	private double lat;
	//	private List<WeeklyTimeIntervalViewModel> openingHours;
	private Map<String, String> keyValues = new TreeMap<String, String>();

	public RecyclingData() {
	}

	public RecyclingData(long nodeId, double lon, double lat) {
		this.nodeId = nodeId;
		this.lon = lon;
		this.lat = lat;
	}

	public long getNodeId() {
		return nodeId;
	}

	public double getLon() {
		return lon;
	}

	public double getLat() {
		return lat;
	}

	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public Map<String, String> getKeyValues() {
		return keyValues;
	}

	public void addKeyValue(String key, String value) {
		keyValues.put(key, value);
	}

	//	public List<WeeklyTimeIntervalViewModel> getOpeningHours() {
	//		return openingHours;
	//	}
	//
	//	public void setOpeningHours(List<WeeklyTimeIntervalViewModel> openingHours) {
	//		this.openingHours = openingHours;
	//	}

	@Override
	public String toString() {
		return "Name: " + keyValues.get("name") + " A: " + keyValues.get("amenity") + " T: "
				+ keyValues.get("recycling_type") + " City: " + keyValues.get("addr:city") + " OH: "
				+ keyValues.get("opening_hours");
	}
}
