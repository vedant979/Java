package com.rwi.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	EmpDetails emp1 = new EmpDetails();
   
    	emp1.setId(1);
    	emp1.setName("vedant");
    	emp1.setBranch("raipur");    	
    	emp1.setId(2);
    	emp1.setName("vedant");
    	emp1.setBranch("raipur");
   
    	
    	Configuration con = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(EmpDetails.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	
//    	emp1 = session.get(EmpDetails.class, 1);
    	session.save(emp1);
    	
    	tx.commit();
//    	System.out.println(emp1);
    }
}
