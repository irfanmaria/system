package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.DAO;
import com.example.demo.model.Alian;

@Service
public class AlianService implements AlianInterface {
	
	@Autowired
	DAO dao;

	@Override
	public Alian insert(Alian alian) {
  
		 return dao.save(alian);
	}

	@Override
	public Alian update(Alian alian) {
	
		return dao.save(alian);
	}

	@Override
	public void delete(Alian alian)
	{
		
		
		dao.delete(alian);
	}

	@Override
	public List<Alian> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
