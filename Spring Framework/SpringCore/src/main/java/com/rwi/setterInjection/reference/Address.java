package com.rwi.setterInjection.reference;

import java.util.ArrayList;

public class Address {
	private ArrayList<String> city;
	private ArrayList<String> town;
	public ArrayList<String> getCity() {
		return city;
	}
	public void setCity(ArrayList<String> city) {
		this.city = city;
	}
	public ArrayList<String> getTown() {
		return town;
	}
	public void setTown(ArrayList<String> town) {
		this.town = town;
	}
	@Override
	public String toString() {
		return "city=" + city + ", town=" + town;
	}
	
	
}
