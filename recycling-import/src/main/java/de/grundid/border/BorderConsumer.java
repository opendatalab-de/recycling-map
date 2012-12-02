package de.grundid.border;

import java.util.ArrayList;
import java.util.List;

import org.osmtools.dataimport.Consumer;

public class BorderConsumer extends Consumer<BorderData> {

	private List<BorderData> data = new ArrayList<BorderData>();

	@Override
	protected void consume(BorderData recyclingData) {
		System.out.println(recyclingData);
		data.add(recyclingData);
	}

	public List<BorderData> getData() {
		return data;
	}
}
