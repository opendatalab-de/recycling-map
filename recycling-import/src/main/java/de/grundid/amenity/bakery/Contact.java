package de.grundid.amenity.bakery;

public class Contact {

	public String address;
	public String zip;
	public String city;
	public String phone;
	public String zusatz;

	public Contact(String address, String zip, String city, String phone, String zusatz) {
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.phone = phone;
		this.zusatz = zusatz;
	}
}
