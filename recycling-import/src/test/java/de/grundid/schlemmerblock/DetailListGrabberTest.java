package de.grundid.schlemmerblock;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.StringWebResponse;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class DetailListGrabberTest {

	@Test
	public void testGetUrls() throws Exception {
		DetailListGrabber grabber = new DetailListGrabber();

		WebClient webClient = new WebClient();

		String data = loadFile("Regionsuche.htm");
		URL url = new URL("http://localhost");
		StringWebResponse webResponse = new StringWebResponse(data, url);
		HtmlPage htmlPage = new HtmlPage(url, webResponse, webClient.getCurrentWindow());

		grabber.parsePage(htmlPage);

	}

	private String loadFile(String filename) {
		try {
			StringBuilder sb = new StringBuilder();
			InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

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
