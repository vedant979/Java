package com.rwi.setterInjection.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rwi.setterInjection.Student;

public class Test {

	public static void main(String[] args) {

		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rwi/setterInjection/collections/CollectionType.xml");

        Student1 student1 = (Student1) context.getBean("student1");

        System.out.print(student1);
        context.close();
	}

}
