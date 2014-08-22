package de.grundid.dienstleister.merge;

import static org.springframework.util.StringUtils.hasText;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.recycling.ResourceUtils;
import de.grundid.utils.GrabUtils;

public class DataMerger {

	private static final String[] SOURCE_FILES = { "service-provider-complete.json", "weddix-service-provider.json",
			"azh-service-provider-decoded.json" };
	private Set<String> categories = new TreeSet<String>();
	private Map<String, String> categoryMap;

	public DataMerger() {
		initCategoryMap();
	}

	private List<ServiceProvider> loadData() {
		List<ServiceProvider> result = new ArrayList<ServiceProvider>();
		for (String source : SOURCE_FILES) {
			result.addAll(GrabUtils.loadData(source));
		}
		return result;
	}

	private void initCategoryMap() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			categoryMap = objectMapper.readValue(
					ResourceUtils.getResourceAsString("categories-mapping.json", "UTF-8"),
					MapType.construct(HashMap.class, SimpleType.construct(String.class),
							SimpleType.construct(String.class)));
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
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

	private List<ServiceProvider> mergeCategories(List<ServiceProvider> allSp) {
		List<ServiceProvider> myCopy = new ArrayList<ServiceProvider>(allSp);
		List<ServiceProvider> result = new ArrayList<ServiceProvider>();
		ServiceProviderComparator comparator = new ServiceProviderComparator();
		for (Iterator<ServiceProvider> it = myCopy.iterator(); it.hasNext();) {
			ServiceProvider serviceProvider = it.next();
			Set<String> categorySet = serviceProvider.getCategorySet();
			if (categorySet == null) {
				categorySet = new HashSet<String>();
				serviceProvider.setCategorySet(categorySet);
			}
			categorySet.add(serviceProvider.getCategory());
			it.remove();
			result.add(serviceProvider);
			for (ServiceProvider serviceProvider2 : myCopy) {
				if (comparator.compare(serviceProvider, serviceProvider2) == 0) {
					categorySet.add(serviceProvider.getCategory());
					categorySet.add(serviceProvider2.getCategory());
				}
			}
		}
		return result;
	}

	public static void exportCsv(Iterable<ServiceProvider> allSp) {
		ICsvBeanWriter beanWriter = null;
		try {
			beanWriter = new CsvBeanWriter(new FileWriter("serviceprovider-azh.csv"), CsvPreference.STANDARD_PREFERENCE);
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

	private void collectCategories(Iterable<ServiceProvider> serviceProviders) {
		for (ServiceProvider serviceProvider : serviceProviders) {
			if (serviceProvider.getCategorySet() != null)
				categories.addAll(serviceProvider.getCategorySet());
		}
		for (String category : categories) {
			System.out.println(category);
		}
		System.out.println("Kategorien: " + categories.size());
	}

	private void mapCategories(Iterable<ServiceProvider> serviceProviders) {
		for (ServiceProvider serviceProvider : serviceProviders) {
			serviceProvider.setCategory(null);
			if (serviceProvider.getCategorySet() != null) {
				Set<String> mappedCategories = new HashSet<String>();
				for (String category : serviceProvider.getCategorySet()) {
					String mappedCategory = categoryMap.get(category);
					if (hasText(mappedCategory))
						mappedCategories.add(mappedCategory);
					else
						System.out.println("Unknown category: [" + category + "]");
				}
				serviceProvider.setCategorySet(mappedCategories);
				//				if (mappedCategories.size() > 2) {
				//					System.out.print("Categories: " + mappedCategories.size() + " " + serviceProvider.getName() + " ");
				//					System.out.println(StringUtils.collectionToCommaDelimitedString(mappedCategories));
				//				}
				//				if (mappedCategories.isEmpty()) {
				//					System.out.println("NO Categories: " + serviceProvider.getName());
				//				}
			}
		}
	}

	private void countFeatures(Collection<ServiceProvider> serviceProviders) {
		int counter = 0;
		for (ServiceProvider serviceProvider : serviceProviders) {
			if (!hasText(serviceProvider.getHomepage())) {
				counter++;
			}
		}
		System.out.println("Features: No ZIP " + counter);
	}

	private void run() {
		List<ServiceProvider> allSp = loadData();
		System.out.println("All: " + allSp.size());
		//		preprocessData(allSp);
		List<ServiceProvider> merged = mergeCategories(allSp);
		System.out.println("Merged: " + merged.size());
		Set<ServiceProvider> unique = new TreeSet<ServiceProvider>(new ServiceProviderComparator());
		unique.addAll(allSp);
		System.out.println("Unique: " + unique.size());
		//		collectCategories(unique);
		mapCategories(unique);
		//		checkUrls(unique);
		//	System.out.println("With homepage: " + unique.size());
		//		exportCsv(unique);
		countFeatures(unique);
		GrabUtils.writeJsonObject(unique, "all-service-provider.json");
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
