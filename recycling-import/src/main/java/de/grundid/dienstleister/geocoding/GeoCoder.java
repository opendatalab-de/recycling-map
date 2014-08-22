package de.grundid.dienstleister.geocoding;

import static org.springframework.util.StringUtils.hasText;

import java.util.Iterator;
import java.util.List;

import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.utils.GrabUtils;

public class GeoCoder {

	private static final String GEOCODER_URL = "http://maps.googleapis.com/maps/api/geocode/json?address={0}&region=de&sensor=false";
	private RestOperations restOperations = new RestTemplate();

	public void run(String inputFileName, String outputFileName) {
		List<ServiceProvider> serviceProviders = GrabUtils.loadFile(inputFileName);
		int requestCounter = 0;
		for (Iterator<ServiceProvider> it = serviceProviders.iterator(); it.hasNext();) {
			ServiceProvider serviceProvider = it.next();
			if (hasText(serviceProvider.getStreet()) && hasText(serviceProvider.getZip())
					&& hasText(serviceProvider.getCity())) {
				if (serviceProvider.getLat() == null) {
					try {
						requestCounter++;
						String address = serviceProvider.getStreet() + ", " + serviceProvider.getZip() + " "
								+ serviceProvider.getCity();
						System.out.println("request " + requestCounter + ": " + address);
						GeoCoderResponse geoCoderResponse = restOperations.getForObject(GEOCODER_URL,
								GeoCoderResponse.class, address);
						if (geoCoderResponse.getStatus().equals("OK")) {
							serviceProvider.setLat(geoCoderResponse.getResults().get(0).getGeometry().getLocation()
									.getLat());
							serviceProvider.setLng(geoCoderResponse.getResults().get(0).getGeometry().getLocation()
									.getLng());
						}
						else {
							System.out.println("Not OK: " + geoCoderResponse.getStatus());
							if (geoCoderResponse.getStatus().equals("OVER_QUERY_LIMIT")) {
								break;
							}
						}
						Thread.sleep(500);
					}
					catch (Exception e) {
						e.printStackTrace();
						break;
					}
				}
			}
			else
				it.remove();
			if (requestCounter > 2500)
				break;
		}
		GrabUtils.writeJsonObject(serviceProviders, outputFileName);
	}

	public static void main(String[] args) {
		new GeoCoder().run(args[0], args[1]);
	}
}
