package de.grundid.utils;

import static org.springframework.util.StringUtils.hasText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.SimpleType;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.ra.JsonOsmModule;
import de.grundid.recycling.ResourceUtils;

public class GrabUtils {

	public static final String BASE_DIR = "/Users/adrian/Documents/DevSystem/projects/hp24/Daten";

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

	public static void setValue(String value, String property, Object bean) {
		try {
			String currentValue = BeanUtils.getProperty(bean, property);
			if (!hasText(currentValue)) {
				String trimmed = trimAndUnescape(value);
				BeanUtils.setProperty(bean, property, trimmed);
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String trimAndUnescape(String value) {
		return StringUtils.trimWhitespace(StringEscapeUtils.unescapeHtml4(value));
	}

	public static String readFully(InputStream in) throws IOException {
		StringBuilder sb = new StringBuilder();
		List<String> lines = IOUtils.readLines(in, "UTF-8");
		for (String string : lines) {
			sb.append(string).append("\n");
		}
		return sb.toString();
	}

	public static List<ServiceProvider> loadData(String filename) {
		List<ServiceProvider> result = new ArrayList<ServiceProvider>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			ServiceProvider[] sp = objectMapper.readValue(ResourceUtils.getResourceAsString(filename, "UTF-8"),
					ServiceProvider[].class);
			for (ServiceProvider serviceProvider : sp) {
				result.add(serviceProvider);
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static List<ServiceProvider> loadFile(String filename) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.readValue(new FileInputStream(filename),
					CollectionType.construct(ArrayList.class, SimpleType.construct(ServiceProvider.class)));
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
