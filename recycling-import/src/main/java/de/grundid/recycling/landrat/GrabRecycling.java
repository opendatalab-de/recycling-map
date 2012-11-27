package de.grundid.recycling.landrat;

import java.util.List;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;

public class GrabRecycling {

	private String baseUrl = "http://www.landkreis-heilbronn.de/sixcms/detail.php?id=10804&_nav=19947,19945";

	public void run() {
		try {
			WebClient webClient = new WebClient();
			HtmlPage page = webClient.getPage(baseUrl);
			List<HtmlForm> forms = page.getForms();
			for (HtmlForm htmlForm : forms) {
				if (htmlForm.getActionAttribute().equals("")) {
					processForm(htmlForm);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void processForm(HtmlForm htmlForm) throws Exception {
		HtmlSelect recyclingName = htmlForm.getSelectByName("sv[name]");

		List<HtmlOption> options = recyclingName.getOptions();
		for (HtmlOption htmlOption : options) {

			String value = htmlOption.getValueAttribute();
			if (value.contains("9"))
				continue;

			String requestUrl = baseUrl + "&sv[name]=" + htmlOption.getValueAttribute();
			//			System.out.println(requestUrl);

			WebClient webClient = new WebClient();
			HtmlPage page = webClient.getPage(requestUrl);

			DomNodeList<DomElement> pElements = page.getElementsByTagName("p");
			for (DomElement domElement : pElements) {
				String content = domElement.getTextContent();
				if (content.contains("Recyclinghof")) {
					DomNodeList<DomNode> childNodes = domElement.getChildNodes();

					Recycling recycling = new Recycling();

					for (DomNode domNode : childNodes) {
						if (domNode.getNodeName().equalsIgnoreCase("strong")) {
							recycling.setName(domNode.getTextContent());
						}
						if (domNode.getNodeName().equalsIgnoreCase("a")) {
							recycling.setGoogleMapsLink(domNode.getAttributes().getNamedItem("href").getNodeValue());
						}
						if (domNode.getNodeName().equalsIgnoreCase("small")) {
							String openingHours = domNode.getTextContent().replaceAll("\n", ";");
							recycling.setOpeningHours(openingHours);
						}
						if (domNode.getNodeName().equals("#text")) {
							recycling.appendAddress(domNode.getTextContent());
						}

					}

					System.out.println(recycling);

				}
			}
		}
	}

	public static void main(String[] args) {
		new GrabRecycling().run();
	}
}
