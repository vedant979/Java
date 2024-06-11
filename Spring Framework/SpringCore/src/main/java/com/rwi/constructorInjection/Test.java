package com.rwi.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext();
		Student std = (Student)con.getBean("Student");
	}

}
