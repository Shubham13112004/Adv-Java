package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
@Inheritance(strategy = InheritanceType.JOINED)
public class player {
	@Id
	private int id;
	
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


	@Column
	private String name;
	
	
	public player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public player() {
		
	}



}
