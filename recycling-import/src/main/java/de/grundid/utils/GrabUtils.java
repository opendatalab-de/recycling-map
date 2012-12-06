package de.grundid.utils;

import java.io.File;
import java.io.FileWriter;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import de.grundid.ra.JsonOsmModule;

public class GrabUtils {

	public static void writeJsonObject(Object object, String filename) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.registerModule(new JsonOsmModule());
			FileWriter writer = new FileWriter(new File(filename));
			ObjectWriter prettyWriter = objectMapper.writer(new DefaultPrettyPrinter());
			writer.write(prettyWriter.writeValueAsString(object));
			writer.flush();
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
