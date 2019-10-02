package com.home;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class application {

	public static void main(String[] args) {
		
		
		//calculator c = new calculator();
	//	System.out.println(" calculated value is " + c.add(2,5));
		
		

	}
	
	
	CalculatorService service = new mockCalcService();
	
	@Test
	public void testingcalculatorusingStub() {
		
		
		calculator calculator = new calculator(service);
				
		assertTrue("Incorrect calculation", calculator.add(12, 15)==27);
	}

}
