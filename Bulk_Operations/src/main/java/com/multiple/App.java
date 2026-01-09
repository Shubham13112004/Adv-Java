package com.multiple;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.entity.Users;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("/Config/hibernate.cfg.xml");
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	 Transaction t = session.beginTransaction();
    	 
    	 
    	 String sql = "INSERT INTO Bulk_Operations( name, gender) VALUES (:n, :g)";
    	 String Updt = "update Bulk_Operations set name='Ragita' where name='Siddhesh'";
    	 String Del = "Delete from Bulk_Operations where name='Hardik'";
    	 String Sel = "Select * from Bulk_Operations";
    	 
    	 
    	 Query<Users> query = session.createNamedQuery("Add");
    	 query.setParameter("g", "Female");
    	 query.setParameter("n", "Ragita");
    	 
    	 
    //	 NativeQuery query = session.createNativeQuery(Sel);
    	 
    	 //NativeQuery<Users> query1 = session.createNativeQuery(Sel, Users.class);
    	 
    	 //List<Users>list = query1.getResultList();
    	 
    	// for(Users u : list) {
    	//	 System.out.println(u.getId()+" "+u.getName());
    	// }
    	 
    	
    	// query.setParameter("n", "Tanishka");
    	// query.setParameter("g", "Female");
    	 
    	 
    	 query.executeUpdate();
    	 t.commit();
    	 
    	
    	
    	
    	
    	
    }
}
