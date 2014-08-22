package de.grundid.dienstleister;

import java.util.List;

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
	}

	public static void main(String[] args) {
		new PostGeoCoder().run();
	}
}
