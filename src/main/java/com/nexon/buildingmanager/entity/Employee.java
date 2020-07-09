package com.nexon.buildingmanager.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", insertable = false, updatable = false, nullable = false)
	private Integer id;
    private String firstName;
    private String lastName;

    private String username;
    private String password;
    private String email;
    private String department;
    
    private Boolean onHoliday;
    //private Salary salary;
    private Boolean role;
//  @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name="born",columnDefinition = "DATE")
    private LocalDate born;
//  @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name="date_employed",columnDefinition = "DATE")
    private LocalDate dateEmployed;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String username, String password,
                    String email, String department, Boolean role) {
        this.firstName = firstName;
        this.lastName = lastName;
  //      this.born = born;
 //       this.dateEmployed = dateEmployed;
        this.username = username;
        this.password = password;
        this.email = email;
        this.department = department;
        //this.onHoliday = onHoliday;
        this.role = role;
    }
    

    public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBorn() {
        return born;
    }

//    public void setBorn(String born) {
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALY);
//        this.born = LocalDate.parse(born,formatter);
//    }

    public LocalDate getDateEmployed() {
        return dateEmployed;
    }

//    public void setDateEmployed(String dateEmployed) {
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.ITALY);
//        this.dateEmployed = LocalDate.parse(dateEmployed, formatter);
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static String generatePassword(String password) {
    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    	String encodedPassword = encoder.encode(password);
    	return encodedPassword;
    }

	public void setPassword(String password) {
		this.password = generatePassword(password);
	}
	public String getPassword() {
		return this.password;
	}

	public String getDepartment() {
        return department;
    }
	

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean isOnHoliday() {
        return onHoliday;
    }
    

    public void setOnHoliday(Boolean onHoliday) {
        this.onHoliday = onHoliday;
    }

//    public Salary getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Salary salary) {
//        this.salary = salary;
//    }

	public Boolean getRole() {
		return role;
	}

	public void setRole(Boolean role) {
		this.role = role;
	}
	
	public static Boolean isEmpty(Employee employee) {
		return employee == null ? true : false;  
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", email=" + email + ", department=" + department
				+ ", onHoliday=" + onHoliday + "]";
	}

}
