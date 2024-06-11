package com.rwi.beanLifeCycle;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void init() {
		System.out.println("init");
	}
	public void dest() {
		System.out.println("destroyed");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
