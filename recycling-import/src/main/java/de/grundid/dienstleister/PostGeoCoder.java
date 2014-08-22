package de.grundid.dienstleister;

import java.util.Collection;
import java.util.List;

import org.geojson.Feature;
import org.geojson.FeatureCollection;
import org.geojson.Point;

import de.grundid.utils.GrabUtils;

public class PostGeoCoder {

	public void run() {
		List<ServiceProvider> serviceProviders = GrabUtils.loadFile(GrabUtils.BASE_DIR
				+ "/all-service-provider-1408707756563.json");
		int counter = 0;
		for (ServiceProvider serviceProvider : serviceProviders) {
			if (serviceProvider.getLat() != null)
				counter++;
		}
		System.out.println("Total: " + serviceProviders.size() + " /  with GeoLocation: " + counter);
		convertToGeoJson(serviceProviders);
	}

	public void convertToGeoJson(Collection<ServiceProvider> serviceProviders) {
		FeatureCollection fc = new FeatureCollection();
		for (ServiceProvider serviceProvider : serviceProviders) {
			if (serviceProvider.getLat() != null) {
				Feature feature = new Feature();
				Point point = new Point(serviceProvider.getLng(), serviceProvider.getLat());
				feature.setGeometry(point);
				feature.setProperty("name", serviceProvider.getName());
				fc.add(feature);
			}
		}
		GrabUtils.writeJsonObject(fc, "service-providers.geojson");
	}

	public static void main(String[] args) {
		new PostGeoCoder().run();
	}
}
