package de.grundid.schlemmerblock;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class DetailListGrabberTest {

	private List<String> links = Arrays.asList("http://www.schlemmerblock.de/Gutschein/Arsenal-Kino-Tuebingen_64009",
			"http://www.schlemmerblock.de/Gutschein/Atelier-Kino-Tuebingen_64010",
			"http://www.schlemmerblock.de/Gutschein/Atelier-Kino-Tuebingen_64010",
			"http://www.schlemmerblock.de/Gutschein/Zimmertheater-Tuebingen-Tuebingen_64011",
			"http://www.schlemmerblock.de/Gutschein/Zimmertheater-Tuebingen-Tuebingen_64011",
			"http://www.schlemmerblock.de/Gutschein/Kinder-und-Jugendtheater-am-LTT-Tuebingen_64007",
			"http://www.schlemmerblock.de/Gutschein/Landestheater-Wuerttemberg-Hohenzollern-Tuebingen_64006",
			"http://www.schlemmerblock.de/Gutschein/Landestheater-Wuerttemberg-Hohenzollern-Tuebingen_64006",
			"http://www.schlemmerblock.de/Gutschein/Mike-s-Stocherkahnfahrten-Tuebingen_64008",
			"http://www.schlemmerblock.de/Gutschein/Bowling-Sportcenter-Rottenburg-Rottenburg_63998",
			"http://www.schlemmerblock.de/Gutschein/Bowling-Sportcenter-Rottenburg-Rottenburg_63999");

	private DetailListGrabber grabber = new DetailListGrabber();

	@Test
	public void testGetUrls() throws Exception {
		String data = loadFile("Regionsuche.htm");
		Document document = Jsoup.parse(data);
		List<String> list = grabber.parsePage(document);
		assertEquals(125, list.size());

	}

	@Test
	public void testGetDetailUrls() throws Exception {
		String data = loadFile("Augsburg-2013_1119.htm");
		Document document = Jsoup.parse(data);
		List<String> list = grabber.parseRegionPage(document);
		assertEquals(81, list.size());
	}

	@Test
	public void testFilterDoubles() throws Exception {
		List<String> filteredList = grabber.filterDoubles(new ArrayList<String>(links));
		assertEquals(7, filteredList.size());
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
