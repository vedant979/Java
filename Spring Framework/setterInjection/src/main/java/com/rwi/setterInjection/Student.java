package com.rwi.setterInjection;

import java.util.ArrayList;

public class Student {
	private ArrayList<Integer> id;
	private ArrayList<String> name;
	private ArrayList<String> address;
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
	public ArrayList<String> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
