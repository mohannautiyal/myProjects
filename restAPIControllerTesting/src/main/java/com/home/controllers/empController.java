package com.home.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.entities.employee;

@RestController
@RequestMapping("/employee")
public class empController {
	public List<employee> employees;
	
	
	public empController() {
		employees = new ArrayList<employee>();

		employees.add(new employee("Madan Nautiyal", 123, "Technology"));
		employees.add(new employee("Shaili Nautiyal", 124, "Technology"));
		employees.add(new employee("Rishita Nautiyal ", 125, "Human Resources"));
		employees.add(new employee("Kavya Nautiyal", 126, "Human Resources"));	
	}

	
	@GetMapping("/")
	public List<employee> getEmployees() {
	

		return employees;

	}
	
	@PostMapping(value = "/addEmployee",consumes = "application/json")
	public String addEmployee(@RequestBody employee emp) {
		employees.add(emp);
		return "Successfully added";

	}

}
