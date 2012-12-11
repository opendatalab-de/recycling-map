package de.grundid.schlemmerblock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.grundid.ra.JsonOsmModule;
import de.grundid.recycling.ResourceUtils;
import de.grundid.utils.GrabUtils;

public class Grabber
{

	private static final Logger log = Logger.getLogger(Grabber.class.getName());

	public static void main(String[] args) throws IOException
	{
		DetailListGrabber detailListGrabber = new DetailListGrabber();
		//		List<String> detailUrls = detailListGrabber.getUrls();
		//		detailListGrabber.filterDoubles(detailUrls);
		//		GrabUtils.writeJsonObject(detailUrls, "import-schlemmerblock-details-links.json");
		//		System.out.println(detailUrls.size());

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new JsonOsmModule());
		String[] detailUrls = objectMapper.readValue(
				ResourceUtils.getResourceAsString("import-schlemmerblock-details-links.json", "UTF-8"), String[].class);
		List<String> detailUrlsList = new ArrayList<String>(Arrays.asList(detailUrls));
		detailListGrabber.filterDoubles(detailUrlsList);

		log.info("grabbing " + detailUrlsList.size() + " amenities");
		List<SbAmenity> amenities = new ArrayList<SbAmenity>();
		for (String detailUrl : detailUrlsList)
		{
			log.info("parsing " + detailUrl);
			try
			{
				SbAmenity amenity = new SbAmenity(Jsoup.connect(detailUrl).get(), detailUrl);
				amenities.add(amenity);
				log.info(amenity.toString());
			}
			catch (Exception e)
			{
				log.error("error parsing " + detailUrl);
			}
		}
		log.info(amenities.size());
		GrabUtils.writeJsonObject(amenities, "import-schlemmerblock-details.json");
	}
}
