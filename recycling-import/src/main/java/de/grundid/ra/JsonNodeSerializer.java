package de.grundid.ra;

import java.io.IOException;

import org.osmtools.ra.data.Node;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class JsonNodeSerializer extends StdSerializer<Node> {

	public JsonNodeSerializer(Class<Node> clazz) {
		super(clazz);
	}

	@Override
	public void serialize(Node value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonGenerationException {
		jgen.writeStartArray();
		jgen.writeNumber(value.getLat());
		jgen.writeNumber(value.getLon());
		jgen.writeEndArray();
	}
}
