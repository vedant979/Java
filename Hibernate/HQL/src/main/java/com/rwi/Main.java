package com.rwi;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.processing.SQL;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;

//import javax.management.Query;
import java.util.List;
import java.util.Random;

public class Main {
    static Random ran = new Random();

    public static String generateStr(int n){
        return String.valueOf(ran.nextInt(n));
    }
    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(students.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session1 = sf.openSession();

        Transaction tx = session1.beginTransaction();
        Query q = session1.createQuery(" from students where id=99");
//        SQLQueryParser query = session1.cre
        students stud = (students) q.uniqueResult();
        System.out.println(stud.toString());
//        for(students s: stud){
//            System.out.println(s.toString());
//        }
        tx.commit();

        session1.close();
    }
}