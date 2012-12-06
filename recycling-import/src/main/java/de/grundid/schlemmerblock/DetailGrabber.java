package de.grundid.schlemmerblock;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DetailGrabber {

	public SbAmenity getSbAmenity(Document document) {
		Elements elementsByTagName = document.getElementsByTag("title");
		System.out.println(elementsByTagName.size());
		return null;
	}
}
