package com.emp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employees;
import com.emp.repo.repo;
import com.emp.service.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {	
	
	
	
	@Autowired
	repo repo;
	
	@Autowired
	daoimpl daoimpl;
	
	@GetMapping("/employees")
	public List<Employees> allData() {
		return repo.findAll() ;
	}
	
	@GetMapping("/update{id}")
	public Optional<Employees> getMethodName(@RequestParam Integer id) {
		return  daoimpl.updateGet(id);
	}
	
	@PutMapping("updatebyid/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody Employees employees) {
		Optional<Employees> employees2=  daoimpl.updatedata(employees);
		return "Successful";
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Employees entity) {
		System.out.println(entity);
		daoimpl.register(entity);
		return "success";
	}
	
	@DeleteMapping("/employees/{id}")
	public void  delete(@PathVariable Integer id)
	{
		System.out.println("h");
		daoimpl.delete(id);		
	}
	

}
