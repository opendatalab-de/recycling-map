package de.grundid.recycling;

import static org.springframework.util.StringUtils.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.osmtools.dataimport.BlockingQueueDefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class RecyclingReader extends BlockingQueueDefaultHandler<RecyclingData> {

	private Set<String> ignoreKeys = new HashSet<String>();
	private RecyclingData data;
	private long objectCount;

	public RecyclingReader() {
		ignoreKeys.add("created_by");
		ignoreKeys.add("source");
	}

	private long parseLongSafe(String s) {
		try {
			return Long.parseLong(s);
		}
		catch (Exception e) {
			return 0;
		}
	}

	private double parseDoubleSafe(String s) {
		try {
			return Double.parseDouble(s);
		}
		catch (Exception e) {
			return 0;
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		char c = qName.charAt(0);
		if (c == 't') // tag
		{
			if (data != null) {
				String k = attributes.getValue("k");
				String v = attributes.getValue("v");
				if (!ignoreKeys.contains(k))
					data.getKeyValues().put(k, v);
			}
		}
		else if (c == 'n' && !qName.equals("nd")) // node
		{
			data = new RecyclingData(parseLongSafe(attributes.getValue("id")),
					parseDoubleSafe(attributes.getValue("lon")), parseDoubleSafe(attributes.getValue("lat")));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (data == null)
			return;

		char c = qName.charAt(0);
		if (c == 'n') {
			if (data != null) {
				Map<String, String> keyValues = data.getKeyValues();
				String amenity = keyValues.get("amenity");
				String openingHours = keyValues.get("opening_hours");
				String recyclingType = keyValues.get("recycling_type");
				if (isRecyclingCenter(recyclingType)
						|| isRecyclingAndNotContainerWithOpeningHours(amenity, recyclingType, openingHours)) {
					try {
						queue.put(data);
						objectCount++;
					}
					catch (InterruptedException e) {
					}
				}
				data = null;
			}
			else
				throw new RuntimeException("unexpected node end tag");
		}
	}

	private boolean isRecyclingAndNotContainerWithOpeningHours(String amenity, String recyclingType, String openingHours) {
		return "recycling".equals(amenity) && !"container".equals(recyclingType) && hasText(openingHours);
	}

	private boolean isRecyclingCenter(String recyclingType) {
		return "centre".equals(recyclingType) || "center".equals(recyclingType);
	}

	public long getObjectCount() {
		return objectCount;
	}
}
