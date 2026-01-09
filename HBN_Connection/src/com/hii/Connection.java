package com.hii;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("config");

        EntityManager em = emf.createEntityManager();

        System.out.println("EntityManager created: " + em);
    }
}
