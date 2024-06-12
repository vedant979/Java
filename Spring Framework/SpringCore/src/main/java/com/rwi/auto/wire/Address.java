package com.rwi.auto.wire;


public class Address {
	private String city;
	private String town;
	public Address(String city, String town) {
		super();
		this.city = city;
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", town=" + town + "]";
	}

	
	

	
}
