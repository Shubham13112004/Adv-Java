package com.shubham;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Users;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Crud Operations" );
        
        //Users user = new Users();
        //user.getId(1);
       //user.setName("Tanishka");
     //  user.setGender("Female");
        
         
        Configuration cfg = new Configuration();
        cfg.configure("/Config/Hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t=session.beginTransaction();
        
        //session.save(user);
        
       // t.commit();
        
        //Users user = session.get(Users.class, 2);
       // System.out.println(user.getId());
       // System.out.println(user.getName());
       // System.out.println( user.getGender());
        
        Users user = session.get(Users.class, 1);
        
        user.setName("Ganesh");
        session.saveOrUpdate(user);
        t.commit();
        
       
       
       
        
    }
}
