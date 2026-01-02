package com.g;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.e.Entity12;

public class Base {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("shubh");

        EntityManager em = emf.createEntityManager();

        System.out.println("EntityManager created: " + em);
        
        
        //insert(em);
        //update(em);
        //read(em);
        delete(em);

        em.close();
        emf.close();
    }
    
    
    private static void update(EntityManager em) { 
        Entity12 employee = em.find(Entity12.class, 11);

        if(employee != null) { 
            EntityTransaction transaction = em.getTransaction(); 
            transaction.begin();

            employee.setEname("Shubham");
            employee.setEsalary(8000); 
            em.merge(employee);  

            transaction.commit(); 
            System.out.println("DATA UPDATED SUCCESSFULLY"); 
        } else { 
            System.out.println("DATA NOT FOUND"); 
        }
    }

    
    private static void insert(EntityManager em) { 
    	EntityTransaction transaction = em.getTransaction(); 
    	  transaction.begin();
    	  
    	  
    	  for(int i=0;i<10;i++) {
    		  int startid=11;
    		  Entity12 employee = new Entity12(startid+i, "kaju", "kkr", 2000+i); 
        	  em.persist(employee); 
    		  
    	  }
    	 
    	  
    	  transaction.commit(); 
    	  System.out.println("DATA INSERTED SUCCESSFULLY"); 
    	   
    	 }
    
    
    private static void read(EntityManager em) { 
    	   
    	  Entity12 employee = em.find(Entity12.class, 11); 
    	  System.out.println(employee);  
    	   
    	 } 
    
    private static void delete(EntityManager em) { 
    	   
    	  Entity12 employee = em.find(Entity12.class, 10); 
    	  if(employee!=null) { 
    	    
    	   EntityTransaction transaction = em.getTransaction(); 
    	   transaction.begin(); 
    	    
    	   em.remove(employee); 
    	    
    	   transaction.commit(); 
    	   System.out.println("DATA DELETED SUCCESSFULLY"); 
    	    
    	  }else { 
    	   System.out.println("DATA NOT FOUND"); 
    	  } 
    	   
    	 } 
    }
