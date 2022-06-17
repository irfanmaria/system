package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alian;
import com.example.demo.service.AlianService;

@RestController
@RequestMapping(path="api/getAlian")
public class AlianController {
	
	@Autowired
	AlianService aService;
	
	
	@PostMapping
	public void home(@RequestBody Alian alian)
	{
//		System.out.println(alian);
         aService.insert(alian);
	}
	
	
	
}
