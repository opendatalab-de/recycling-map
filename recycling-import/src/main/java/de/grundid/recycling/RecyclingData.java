package de.grundid.recycling;

import java.util.Map;
import java.util.TreeMap;

public class RecyclingData {

	private long nodeId;
	private double lon;
	private double lat;
	private Map<String, String> keyValues = new TreeMap<String, String>();

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

	public Map<String, String> getKeyValues() {
		return keyValues;
	}

	public void addKeyValue(String key, String value) {
		keyValues.put(key, value);
	}

	@Override
	public String toString() {
		return "Name: " + keyValues.get("name") + " A: " + keyValues.get("amenity") + " T: "
				+ keyValues.get("recycling_type") + " City: " + keyValues.get("addr:city");
	}
}
