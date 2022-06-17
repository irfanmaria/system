package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Alian;

public interface AlianInterface {

	
	public Alian insert(Alian alian);
	
	public Alian update(Alian alian);
	
	public void delete(Alian alian);
	
	public List<Alian> getAll();
	

	
	
	
}


