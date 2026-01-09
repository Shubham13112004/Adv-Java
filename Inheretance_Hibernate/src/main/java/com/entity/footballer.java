package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name ="Footballer")
public class footballer extends player {
	
	private int goal;
	private String ftype;

	
	public footballer(int id, String name, int goal, String ftype) {
		super(id, name);
		this.goal = goal;
		this.ftype = ftype;
	}
	
	

	
	public footballer() {
		
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

}
