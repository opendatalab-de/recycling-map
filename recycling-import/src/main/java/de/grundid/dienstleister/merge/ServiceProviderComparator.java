package de.grundid.dienstleister.merge;

import static org.springframework.util.StringUtils.hasText;

import java.util.Comparator;

import de.grundid.dienstleister.ServiceProvider;

public class ServiceProviderComparator implements Comparator<ServiceProvider> {

	@Override
	public int compare(ServiceProvider sp, ServiceProvider other) {
		if (hasText(sp.getZip()) && hasText(sp.getCity()) && sp.getZip().equals(other.getZip())
				&& sp.getCity().equals(other.getCity())) {
			if (hasText(sp.getStreet()) && sp.getStreet().equals(other.getStreet())) {
				return 0;
			}
		}
		return sp.getName().compareTo(other.getName());
	}
}
