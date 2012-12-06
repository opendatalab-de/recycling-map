package de.grundid.schlemmerblock;

import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DetailGrabber {

	public SbAmenity getSbAmenity(HtmlPage htmlPage) {

		DomNodeList<DomElement> elementsByTagName = htmlPage.getElementsByTagName("div");
		System.out.println(elementsByTagName.size());
		return null;
	}
}
