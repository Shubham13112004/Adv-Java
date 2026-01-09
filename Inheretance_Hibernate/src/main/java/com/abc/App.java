package com.abc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.cricketer;
import com.entity.footballer;
import com.entity.player;

public class App 
{
    public static void main( String[] args )
    
    {
    	
    	System.out.println(
    		    Persistence.class
    		        .getClassLoader()
    		        .getResource("META-INF/persistence.xml")
    		);

    	 EntityManagerFactory emf =
                 Persistence.createEntityManagerFactory("Cf");
    	 
    	 EntityManager em = emf.createEntityManager();
    	 
    	 EntityTransaction t = em.getTransaction();
    	 
    	  t.begin();
    	  
    	

    	    cricketer c = new cricketer(2, "Virat", 12000, "Batsman");
    	    em.persist(c);

    	    footballer f = new footballer(3, "Messi", 850, "Striker");
    	    em.persist(f);
    	   
    	   
    	   
    	   t.commit();

    }
}
