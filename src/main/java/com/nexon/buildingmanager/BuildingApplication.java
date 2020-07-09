package com.nexon.buildingmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BuildingApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(BuildingApplication.class, args);
		
		
	}
	
//	TemplateEngine templateEngine = new TemplateEngine();
//	templateEngine.addDialect(new Java8TimeDialect());
//	
	
//	@Bean
//	public CommandLineRunner createUser(EmployeeRepository empRepo) {
//		
//		return (args) -> {
//			empRepo.save(new Employee("Emily","Rut",LocalDate.of(1976, 12 ,11),
//					LocalDate.of(2008, 2, 14),"emy","emy","emy@emy.com","Manager",
//					false,false));
//			
//			empRepo.save(new Employee("Emma","Brooklyn",LocalDate.of(1972, 12 ,11),
//					LocalDate.of(2008, 1, 10),"emy","emy","emy@emy.com","Manager",
//					false,false));
//		};
//	}
	
	

}
