package de.grundid.schlemmerblock;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.StringWebResponse;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HTMLParser;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DetailListGrabberTest {

	@Test
	public void testGetUrls() throws Exception {
		DetailListGrabber grabber = new DetailListGrabber();

		WebClient webClient = new WebClient();
		webClient.setJavaScriptEnabled(false);

		String data = loadFile("Regionsuche.htm");
		URL url = new URL("http://www.schlemmerblock.de/Regionsuche");
		StringWebResponse webResponse = new StringWebResponse(data, url);
		//		HtmlPage htmlPage = webClient.getPage(url);

		HtmlPage htmlPage = HTMLParser.parseHtml(webResponse, webClient.getCurrentWindow());
		//		HtmlPage htmlPage = new HtmlPage(url, webResponse, webClient.getCurrentWindow());

		HtmlElement body = htmlPage.getBody();
		System.out.println(body);

		List<String> list = grabber.parsePage(htmlPage);

		assertEquals(20, list.size());

	}

	private String loadFile(String filename) {
		try {
			StringBuilder sb = new StringBuilder();
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF8")));

			while (br.ready()) {
				String line = br.readLine();
				if (line != null) {
					sb.append(line).append("\n");
				}
				else
					break;

			}

			return sb.toString();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
