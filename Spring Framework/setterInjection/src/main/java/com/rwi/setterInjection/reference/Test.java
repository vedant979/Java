package com.rwi.setterInjection.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/rwi/setterInjection/reference/ReferenceType.xml");
		Address address1 = (Address) con.getBean("address1");
		Student student1 = (Student) con.getBean("student1");
		System.out.println(student1);
		con.close();
	}

}
