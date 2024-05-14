package com.emp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employees;
import com.emp.repo.repo;

@Service

public class daoimpl implements dao {
	
	@Autowired
	repo repo;

	@Override
	public Optional<Employees> updateGet(Integer id) {
		
		return Optional.of(repo.findById(id).orElse(new Employees())); 
	}

	@Override
	public Optional<Employees> updatedata(Employees employees) {
	   Employees employees2 = repo.save(employees);
		return Optional.of(employees2);
	}

	@Override
	public Optional<Employees> register(Employees employees) {
		repo.save(employees);
		return Optional.empty();
	}

	@Override
	public void delete(Integer id) {
		
		repo.deleteById(id);
		
	
	}

}
