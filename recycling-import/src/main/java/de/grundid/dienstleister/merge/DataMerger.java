package de.grundid.dienstleister.merge;

import static org.springframework.util.StringUtils.hasText;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.recycling.ResourceUtils;

public class DataMerger {

	private static final String[] SOURCE_FILES = { "service-provider-complete.json", "weddix-service-provider.json" };

	private List<ServiceProvider> loadData() {
		List<ServiceProvider> result = new ArrayList<ServiceProvider>();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			for (String source : SOURCE_FILES) {
				ServiceProvider[] sp = objectMapper.readValue(ResourceUtils.getResourceAsString(source, "UTF-8"),
						ServiceProvider[].class);
				for (ServiceProvider serviceProvider : sp) {
					result.add(serviceProvider);
				}
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	private String convertPhone(String s) {
		if (s == null)
			return "";
		return s.replaceAll(" ", "");
	}

	public double compareServiceProvider(ServiceProvider sp, ServiceProvider other) {
		if (sp == other)
			return 0;
		double c = 0;
		if (hasText(sp.getZip()) && hasText(sp.getCity()) && sp.getZip().equals(other.getZip())
				&& sp.getCity().equals(other.getCity())) {
			c += 0.25;
		}
		if (hasText(sp.getStreet()) && sp.getStreet().equals(other.getStreet())) {
			c += 0.25;
		}
		if (hasText(sp.getName()) && sp.getName().equals(other.getName())) {
			c += 0.2;
		}
		String phone = sp.getPhone();
		String otherPhone = other.getPhone();
		if (hasText(phone) && phone.equals(otherPhone)) {
			c += 0.2;
		}
		if (hasText(sp.getHomepage()) && sp.getHomepage().equals(other.getHomepage())) {
			c += 0.1;
		}
		// zip + city => 0.25
		// street => 0.25
		// name => 0.2
		// phone => 0.2
		// url => 0.1
		return c;
	}

	private void analyseData(List<ServiceProvider> allSp) {
		int above = 0;
		for (Iterator<ServiceProvider> it = allSp.iterator(); it.hasNext();) {
			ServiceProvider serviceProvider = it.next();
			for (ServiceProvider serviceProvider2 : allSp) {
				double rank = compareServiceProvider(serviceProvider, serviceProvider2);
				if (rank >= 0.9) {
					above++;
					it.remove();
					break;
				}
			}
		}
		System.out.println("Above: " + above);
	}

	private void exportCsv(Iterable<ServiceProvider> allSp) {
		ICsvBeanWriter beanWriter = null;
		try {
			beanWriter = new CsvBeanWriter(new FileWriter("serviceprovider.csv"), CsvPreference.STANDARD_PREFERENCE);
			final String[] header = new String[] { "name", "street", "zip", "city", "phone", "mail", "homepage",
					"description", "category", "source" };
			beanWriter.writeHeader(header);
			for (ServiceProvider customer : allSp) {
				beanWriter.write(customer, header);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (beanWriter != null) {
				try {
					beanWriter.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void checkUrls(Collection<ServiceProvider> allSp) {
		for (Iterator<ServiceProvider> it = allSp.iterator(); it.hasNext();) {
			ServiceProvider serviceProvider = it.next();
			if (hasText(serviceProvider.getHomepage())) {
				try {
					System.out.print(serviceProvider.getHomepage() + " ... ");
					Document document = Jsoup.parse(new URL(serviceProvider.getHomepage()), 10000);
					System.out.println("OK");
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
					it.remove();
				}
			}
		}
	}

	private void run() {
		List<ServiceProvider> allSp = loadData();
		System.out.println("All: " + allSp.size());
		preprocessData(allSp);
		Set<ServiceProvider> unique = new TreeSet<ServiceProvider>(new ServiceProviderComparator());
		unique.addAll(allSp);
		System.out.println("Unique: " + unique.size());
		checkUrls(unique);
		System.out.println("With homepage: " + unique.size());
		exportCsv(unique);
	}

	private void preprocessData(List<ServiceProvider> allSp) {
		for (ServiceProvider serviceProvider : allSp) {
			serviceProvider.setPhone(convertPhone(serviceProvider.getPhone()));
		}
	}

	public static void main(String[] args) {
		try {
			new DataMerger().run();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
