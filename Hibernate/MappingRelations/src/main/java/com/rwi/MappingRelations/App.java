package com.rwi.MappingRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        laptop laptop = new laptop();
        laptop.setId(1);
        laptop.setName("hcl");

        student stud= new student();
        stud.setId(101);
        stud.setName("xyz");
        stud.getLaptop().add(laptop);

        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(laptop.class).addAnnotatedClass(student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(laptop);

        session.persist(stud);
        tx.commit();

    }
}
