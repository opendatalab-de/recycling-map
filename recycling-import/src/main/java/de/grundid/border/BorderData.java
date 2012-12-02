package de.grundid.border;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osmtools.ra.data.Node;

public class BorderData {

	private long id;
	private Map<String, String> tags = new HashMap<String, String>();

	private List<List<Node>> polygons = new ArrayList<List<Node>>();

	public BorderData(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public Map<String, String> getTags() {
		return tags;
	}

	public void setTags(Map<String, String> tags) {
		this.tags = tags;
	}

	public List<List<Node>> getPolygons() {
		return polygons;
	}

	public void setPolygons(List<List<Node>> polygons) {
		this.polygons = polygons;
	}

	@Override
	public String toString() {
		return "http://www.openstreetmap.org/api/0.6/relation/" + id + "/full";
	}
}
