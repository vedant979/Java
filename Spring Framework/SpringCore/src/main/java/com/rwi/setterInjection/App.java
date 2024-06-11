package com.rwi.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Address address1 = (Address) context.getBean("address1");
        Student student1 = (Student) context.getBean("student1");
//        
        
//        for(Student std : student1) {
//        	System.out.println(std.toString());
//        }
        System.out.print(student1);
        context.close();
        
        
    }
}
