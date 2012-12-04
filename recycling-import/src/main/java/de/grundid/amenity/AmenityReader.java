package de.grundid.amenity;

import java.util.HashSet;
import java.util.Set;

public class AmenityReader extends OsmObjectReader<AmenityData> {

	private Set<String> ignoreKeys = new HashSet<String>();
	private AmenityData data;
	private long objectCount;

	public AmenityReader() {
		ignoreKeys.add("created_by");
		ignoreKeys.add("source");
	}

	@Override
	protected void onTagStart(AttributesReader reader) {
		if (data != null) {
			String k = reader.getValue("k");
			String v = reader.getValue("v");
			if (!ignoreKeys.contains(k))
				data.getTags().put(k, v);
		}
	}

	@Override
	protected void onNodeStart(AttributesReader reader) {
		Long nodeId = reader.getLongSafe("id");
		data = new AmenityData(nodeId.longValue(), reader.getFloatSafe("lat"), reader.getFloatSafe("lon"));
	}

	@Override
	protected void onNodeEnd() {
		if (data != null) {
			String shop = data.getTagValue("shop");
			if ("bakery".equals(shop) || "backery".equals(shop)) {
				try {
					System.out.println(data);
					queue.put(data);
					objectCount++;
				}
				catch (InterruptedException e) {
				}
			}
		}
		data = null;
	}

	public long getObjectCount() {
		return objectCount;
	}
}
