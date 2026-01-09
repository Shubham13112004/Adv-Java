package com.entity;

import javax.persistence.*;

@Entity

@NamedQuery(name = "Add", query = "UPDATE Users SET gender = :g WHERE name = :n\r\n"
		)

@Table(name = "Bulk_Operations")
public class Users {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String gender;

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
