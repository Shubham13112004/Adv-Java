package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name ="Cricketer")
public class cricketer extends player {
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int run;

	private String type;
	public cricketer(int id, String name, int run, String type) {
		super(id, name);
		this.run = run;
		this.type = type;
	}
	
	public cricketer() {
		
	}


}
