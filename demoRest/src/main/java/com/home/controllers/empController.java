package com.home.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.entity.emp;
import com.home.repository.empDao;

@RestController
@RequestMapping("/employees")
public class empController {

	@Autowired
	empDao empDao;

	@GetMapping(value = "/", produces = "application/json")
	public Iterable<emp> getEmployees() {
		return empDao.findAll();

	}

	@GetMapping(value = "byId/{id}/", produces = "application/json")
	public emp getEmployeeById(@PathVariable int id) {
		Optional<emp> fetched = empDao.findById(id);
		if (fetched.isPresent())
			return fetched.get();
		else
			return null;

	}
	
	
	@GetMapping(value = "ReById/{id}/", produces = "application/json")
	public ResponseEntity getEmployeById(@PathVariable int id) {
		Optional<emp> fetched = empDao.findById(id);
		if (fetched.isPresent())
			return new ResponseEntity(fetched.get(),HttpStatus.OK);
		else
			return new ResponseEntity("Employee with id provided does not exist",HttpStatus.BAD_REQUEST);

	}
	
	

	
	@GetMapping(value = "RevById/{id}/", produces = "application/json")
	public ResponseEntity getEmpById(@PathVariable int id) {
		Optional<emp> fetched = empDao.findById(id);
		if (fetched.isPresent())
			return new ResponseEntity(fetched.get(),HttpStatus.OK);
		else
			return new ResponseEntity("Employee with id provided does not exist",HttpStatus.BAD_REQUEST);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping(value="byJob/{job}",produces="application/json")
	public Iterable<emp> getEmployeeByJob(@PathVariable String job){
		return empDao.findByJob(job);		
		
	}
	
	@PostMapping(value="/",consumes="application/json",produces="text/plain")
	public String saveEmployee(@RequestBody emp emp) {		
		empDao.save(emp);
		return "Employee saved successfully";
		
	}
	
	@DeleteMapping(value="/{id}",produces="text/plain")
	public String deleteEmployee(@PathVariable int id) {
		empDao.deleteById(id);
		return "Employee deleted successfully";
		
	}
	
	
	@PutMapping(value="/",consumes="application/json", produces="text/plain")
	public String updateEmployee(@RequestBody emp e) {
		empDao.save(e);
		return "Employee updated successfully";
		
	}
	

}
