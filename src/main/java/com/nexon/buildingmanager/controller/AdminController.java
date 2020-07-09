package com.nexon.buildingmanager.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nexon.buildingmanager.dao.EmployeeService;
import com.nexon.buildingmanager.entity.Employee;

@Controller
@RequestMapping(value="/admin",method= {RequestMethod.GET,RequestMethod.POST})
public class AdminController {
	
	
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("")
	public String displayAdmin() {
		return "admin/index";
	}
	
	@GetMapping("/employees")
	public String displayEmployees(Model model) {
	
		return listByPage(model,1,"id","asc");
	}
	
	@GetMapping("employees/{pageNumber}")
	public String listByPage(Model model,@PathVariable("pageNumber") int currentPage,
							@Param("sortField") String sortField ,@Param("sortDirection") String sortDirection) {
		Page<Employee> page = empService.getPageable(currentPage,sortField,sortDirection);
		long totalEmployees = page.getTotalElements();
		int totalPages = page.getTotalPages();
		
		List<Employee> employees = page.getContent();
		
		model.addAttribute("currentPage",currentPage);
		model.addAttribute("totalEmployees",totalEmployees);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("employees",employees);
		model.addAttribute("sortField",sortField);
		model.addAttribute("sortDirection",sortDirection);
		
		return "admin/employees";
	}
	
	
	
	
	
	@GetMapping("/employee/{id}")
	public String displayEmployee(@PathVariable("id") Integer id,Model model) {
		Employee employee = empService.findEmployeeById(id);
		model.addAttribute("employee",employee);
		
		return  "admin/employee";
	}
	
	@GetMapping("/employee/edit-employee/{id}")
	public String editEmployee(@PathVariable("id") Integer id, Model model) {
		Employee employee = empService.findEmployeeById(id);
		empService.addEmployee(employee);
		model.addAttribute("employee",employee);
		
		return "admin/employee/edit-employee";
	}
	
	/* NOT DONE YET
	@PostMapping(value="/employee/edit-employee/save")
	public String saveEmployee(@Valid Employee employee) {
		//System.out.println(employee);
		Employee emp = empService.findEmployeeById(employee.getId());
		empService.addEmployee(emp);
		return "redirect:/admin/employee/" + emp.getId();
		
	}
	*/
	
	@GetMapping("/employee/new")
	public String addEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee",employee);
		//List<Employee> employee = empRepo.findAll();
		
		
		return "admin/employee/new-employee";
		
	}
	
	
	@GetMapping("/employee/added")
	public String employeeAdd(@ModelAttribute("employee")Employee employee) {
		return "admin/employee/added";
	}
	
	

	@PostMapping("/employee/create")
	public String createEmployee(@ModelAttribute("employee")Employee employee) {
		//System.out.println(employee);
		
		if(Objects.isNull(employee.getDepartment()) || 
				Objects.isNull(employee.getBorn()) ||
				Objects.isNull(employee.getDateEmployed())) {
			return "redirect:/admin/employee/error";
		}
		empService.addEmployee(employee);
		return "redirect:/admin/employees";
		
	}
	
	@GetMapping("/employee/error")
	public String displayError() {
		return "/admin/employee/error";
	}
	

	
	
	

}
