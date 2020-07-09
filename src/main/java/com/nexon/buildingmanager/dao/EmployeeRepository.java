package com.nexon.buildingmanager.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nexon.buildingmanager.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>{
	@Override
	public List<Employee> findAll();
}
