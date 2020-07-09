package com.nexon.buildingmanager.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nexon.buildingmanager.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		empRepo.findAll().forEach(employees::add);
		return employees;
	}
	
	public Page<Employee> getPageable(int pageNumber,String sortField,String sortDirection){
		Sort sort = Sort.by("id");
		sort = sortDirection.equals("asc") ? sort.ascending() : sort.descending();
		Pageable pageable = PageRequest.of(pageNumber - 1, 10,sort);
		return empRepo.findAll(pageable);
		 
	}
	
	public Employee findEmployeeById(Integer id) {
		return empRepo.findById(id).orElse(null);
	}
	
	public void addEmployee(Employee employee) {
		empRepo.save(employee);
	}
	
	
	
	public void deleteEmployee(Integer id) {
		empRepo.deleteById(id);
	}
	
	
	
}
