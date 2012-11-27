package de.grundid.recycling;

import java.util.ArrayList;
import java.util.List;

import org.osmtools.dataimport.Consumer;

public class RecyclingConsumer extends Consumer<RecyclingData> {

	private List<RecyclingData> data = new ArrayList<RecyclingData>();

	@Override
	protected void consume(RecyclingData recyclingData) {
		System.out.println(recyclingData);
		data.add(recyclingData);
	}

	public List<RecyclingData> getData() {
		return data;
	}

}
