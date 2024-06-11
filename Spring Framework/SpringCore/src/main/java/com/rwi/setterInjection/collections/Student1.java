package com.rwi.setterInjection.collections;

import java.util.*;

public class Student1 {
	private Set<Integer> id;
	private ArrayList<String> name;
	private ArrayList<String> phone;
	private Map<String, String> course;
	
	
	public Set<Integer> getId() {
		return id;
	}


	public void setId(Set<Integer> id) {
		this.id = id;
	}


	public ArrayList<String> getName() {
		return name;
	}


	public void setName(ArrayList<String> name) {
		this.name = name;
	}


	public ArrayList<String> getPhone() {
		return phone;
	}


	public void setPhone(ArrayList<String> phone) {
		this.phone = phone;
	}


	public Map<String, String> getCourse() {
		return course;
	}


	public void setCourse(Map<String, String> course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", course=" + course + "]";
	}

	
	
	
}
