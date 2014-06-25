package de.grundid.utils;

import static org.springframework.util.StringUtils.hasText;

import java.util.List;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class AddressParser {

	private Set<String> containsSet;
	private Set<String> startsWithSet;

	public AddressParser() {
	}

	public AddressParser(Set<String> containsSet, Set<String> startsWithSet) {
		this.containsSet = containsSet;
		this.startsWithSet = startsWithSet;
	}

	public boolean processStreetAddress(Object bean, Element element) {
		Node possibleAddress = element;
		List<Node> nodes = possibleAddress.childNodes();
		if (nodes.size() == 1 && nodes.get(0).nodeName().equalsIgnoreCase("span")) {
			possibleAddress = nodes.get(0);
		}
		boolean result = false;
		try {
			boolean street = !hasText(BeanUtils.getProperty(bean, "street"));
			for (Node addressNode : possibleAddress.childNodes()) {
				if (addressNode.nodeName().equalsIgnoreCase("br")) {
					street = false;
				}
				else if (street) {
					String possibleStreet = addressNode.toString();
					if (isStreetOk(possibleStreet)) {
						GrabUtils.setValue(possibleStreet, "street", bean);
					}
				}
				else {
					String zipCity = addressNode.toString().trim();
					int pos = zipCity.indexOf(' ');
					if (pos != -1) {
						String zip = zipCity.substring(0, pos);
						String city = zipCity.substring(pos);
						GrabUtils.setValue(zip, "zip", bean);
						GrabUtils.setValue(city, "city", bean);
					}
					else {
						GrabUtils.setValue(zipCity, "city", bean);
					}
					result = true;
				}
			}
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	private boolean isStreetOk(String possibleStreet) {
		if (containsSet != null) {
			for (String avoidContains : containsSet) {
				if (possibleStreet.contains(avoidContains))
					return false;
			}
		}
		if (startsWithSet != null) {
			for (String avoidStartsWith : startsWithSet) {
				if (possibleStreet.startsWith(avoidStartsWith))
					return false;
			}
		}
		return true;
		//		return !possibleStreet.contains("Standesamt") && !possibleStreet.contains("Bezirk")
		//				&& !possibleStreet.startsWith("B ") && !possibleStreet.startsWith("BA ");
	}
}
