package de.grundid.ra;

import org.osmtools.ra.data.Node;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonOsmModule extends SimpleModule {

	public JsonOsmModule() {
		addSerializer(new JsonNodeSerializer(Node.class));
	}
}
