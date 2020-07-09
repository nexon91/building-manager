package com.nexon.buildingmanager.controller;

import java.time.LocalDate;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String displayHome(Model model) {
		
		model.addAttribute("localDate", LocalDate.now());
		
		
		return "index";
	}
	
	@GetMapping("/partners")
	public String displayPartners(Model model) {
		return "partners";
	}
	
	
	@GetMapping("/about")
	public String displayAbout(Model model) {
		return "about";
	}
	
	@GetMapping("/contact")
	public String displayContact(Model model) {
		return "contact";
	}
	
	


}
