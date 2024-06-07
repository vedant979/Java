package com.rwi.setterInjection;

public class Address {
	private String city;
	private String town;
	private String hno;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String town, String hno) {
		super();
		this.city = city;
		this.town = town;
		this.hno = hno;
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
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	@Override
	public String toString() {
		return "city=" + city + ", town=" + town + ", hno=" + hno;
	}
	
	
}
