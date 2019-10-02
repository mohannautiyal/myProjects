package com.home;

public class calculator {

	private int a;
	private int b;

	CalculatorService service;
	

	  public calculator(CalculatorService service)
	  
	  { 
		  this.service = service;
	  }
	 

	
	
	public int add(int a, int b) {
		//service = new CalculatorService(a,b);
		return service.calculate(a,b);
	}

}
