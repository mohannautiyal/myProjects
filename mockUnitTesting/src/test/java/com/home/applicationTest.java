package com.home;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class applicationTest {

		
	CalculatorService service = new mockCalcService();
	
	@Test
	public void testingcalculatorusingStub() {
		
		
		calculator calculator = new calculator(service);
				
		assertTrue("Incorrect calculation", calculator.add(12, 15)==27);
	}

	
	
	@Test
	public void testingcalculatorusingMock() {
		
		service =  mock(CalculatorService.class);
		when(service.calculate(12, 15)).thenReturn(27);
		calculator calculator = new calculator(service);
				
		assertTrue("Incorrect calculation", calculator.add(12, 15)==27);
	}

	
	
	
	
}
