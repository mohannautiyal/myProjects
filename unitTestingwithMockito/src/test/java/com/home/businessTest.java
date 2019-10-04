package com.home;

import static org.junit.Assert.*;

import org.junit.Test;

import com.home.business.BusinessImp;
import com.home.business.DataService;

public class businessTest {

	class DataServiceImp implements DataService {

		public int[] getData() {
			return new int [] {1,2,4};
		}
		
		
	}
	
	
	
	@Test
	public void testBusinessImp() {
		
		BusinessImp businessImp = new BusinessImp();
		DataService dataService = new DataServiceImp();
	//	businessImp.setDataService(dataService);
		int sum =businessImp.calcSum(dataService);		
		assertTrue(sum == 7);
		
	}
	
	

}
