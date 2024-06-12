package com.rwi.auto.wire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rwi/auto/wire/config.xml");
        Student student1 =context.getBean("student", Student.class);
        
        System.out.print(student1.toString());
        context.close();
        
        
    }
}
