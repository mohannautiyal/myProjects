package com.home;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class applicationTest {

		
	CalculatorService service = new mockCalcService();
	CalculatorService mockService;
	
	@Test
	public void testingcalculatorusingStub() {
		
		
		calculator calculator = new calculator(service);
				
		assertTrue("Incorrect calculation", calculator.add(12, 15)==27);
	}

	
	
	@Test
	public void testingcalculatorusingMock() {
		
		mockService =  mock(CalculatorService.class);
		when(mockService.calculate(12, 15)).thenReturn(27);
		calculator calculator = new calculator(mockService);
				
		assertTrue("Incorrect calculation", calculator.add(12, 15)==27);
	}

	
	
	
	
}
