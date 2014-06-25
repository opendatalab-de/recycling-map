package de.grundid.utils;

import static org.springframework.util.StringUtils.hasText;

import java.io.File;
import java.io.FileWriter;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.util.StringUtils;

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

	public static void setValue(String value, String property, Object bean) {
		try {
			String currentValue = BeanUtils.getProperty(bean, property);
			if (!hasText(currentValue)) {
				String trimmed = StringUtils.trimWhitespace(StringEscapeUtils.unescapeHtml4(value));
				BeanUtils.setProperty(bean, property, trimmed);
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
