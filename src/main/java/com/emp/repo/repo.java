package com.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Employees;

public interface repo extends JpaRepository<Employees, Integer> {

}
