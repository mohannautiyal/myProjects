package com.home.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatorController {

		
	@GetMapping(value="/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		//System.out.println("Inside Add Contorller" + (a+b));
		return a + b;
		}
	
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World";
		}
	
}
