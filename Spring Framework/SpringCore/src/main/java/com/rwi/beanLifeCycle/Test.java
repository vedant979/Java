package com.rwi.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/rwi/beanLifeCycle/Config.xml");
//		 con.refresh();
		 Student std1 = (Student)con.getBean("s");
		 System.out.println(std1.toString());
		 con.registerShutdownHook();
	}

}
