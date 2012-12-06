package de.grundid.schlemmerblock;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DetailListGrabber {

	public List<String> getUrls() {
		try {
			WebClient webClient = new WebClient();
			HtmlPage page = webClient.getPage("");
			return parsePage(page);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected List<String> parsePage(HtmlPage page) {
		List<String> urls = new ArrayList<String>();
		DomNodeList<DomElement> selectElement = page.getElementsByTagName("*");

		for (DomElement domElement : selectElement) {
			String attribute = domElement.getAttribute("class");
			if (attribute.equals("oswselect")) {
				DomNodeList<DomNode> childNodes = domElement.getChildNodes();
				for (DomNode domNode : childNodes) {
					Node namedItem = domNode.getAttributes().getNamedItem("value");
					String nodeValue = namedItem.getNodeValue();
					System.out.println(nodeValue);
				}
			}
		}

		return urls;
	}
}
