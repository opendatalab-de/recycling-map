package de.grundid.amenity.bakery;

public class Address {

	public int uid;
	public double lat;
	public double lon;
	public Contact contact;
	public OpeningHours openingHours;
	public AboutShop about;

	public Address(int uid, double lat, double lon, Contact contact, OpeningHours openingHours, AboutShop about) {
		this.uid = uid;
		this.lat = lat;
		this.lon = lon;
		this.contact = contact;
		this.openingHours = openingHours;
		this.about = about;
	}

}
