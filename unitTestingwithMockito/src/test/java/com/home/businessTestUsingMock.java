package com.home;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.home.business.BusinessImp;
import com.home.business.DataService;

@RunWith(MockitoJUnitRunner.class)
public class businessTestUsingMock {
	
	@Mock
	DataService dataService;
	
	@InjectMocks
	BusinessImp businessImp;

	
	@Test
	public void testBusinessImp() {
		
		when(dataService.getData()).thenReturn(new int [] {1,2,3,1});
		int sum =businessImp.calcSum(dataService);		
		assertTrue(sum == 7);
			}

	
	@Test
	public void testBusinessImpWithEmpyData() {
		
		when(dataService.getData()).thenReturn(new int [] {});
		int sum =businessImp.calcSum(dataService);		
		assertTrue(sum == 0);
		
	}
	
}
