package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Alian {
	
	@Id
	private int id;
	private String name,language;
	
	public Alian()
	{
		
	}

	public Alian(int id, String name, String language) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
	}
	
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
