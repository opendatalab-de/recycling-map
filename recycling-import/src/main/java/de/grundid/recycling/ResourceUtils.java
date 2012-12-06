package de.grundid.recycling;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ClassUtils;

public class ResourceUtils {

	public static String getResourceAsString(String filename, String encoding) {
		URL url = ClassUtils.getDefaultClassLoader().getResource(filename);
		try {
			return FileUtils.readFileToString(new File(url.toURI()), encoding);
		}
		catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}
