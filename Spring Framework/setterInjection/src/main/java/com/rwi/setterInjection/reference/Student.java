package com.rwi.setterInjection.reference;

import java.util.ArrayList;

public class Student {
	private ArrayList<Integer> id;
	private ArrayList<String> name;
	private Address address;
	public ArrayList<Integer> getId() {
		return id;
	}
	public void setId(ArrayList<Integer> id) {
		this.id = id;
	}
	public ArrayList<String> getName() {
		return name;
	}
	public void setName(ArrayList<String> name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}

	
	
	
}
