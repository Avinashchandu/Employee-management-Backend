package com.emp.service;

import java.util.Optional;

import com.emp.model.Employees;

public interface dao {
	
	Optional<Employees> updateGet(Integer id);
	Optional<Employees> updatedata(Employees employees);
	Optional<Employees>  register(Employees employees);
	void delete(Integer id);

}
