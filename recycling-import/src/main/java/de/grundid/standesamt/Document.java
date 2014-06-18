package de.grundid.standesamt;

import org.apache.commons.lang3.StringEscapeUtils;

public class Document {

	private StringBuilder content = new StringBuilder();

	public void reset() {
		content.setLength(0);
	}

	public String getContent() {
		return content.toString();
	}

	public void write(String s) {
		content.append(StringEscapeUtils.unescapeHtml4(s));
	}
}
