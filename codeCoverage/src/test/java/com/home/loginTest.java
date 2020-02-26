package com.home;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class loginTest {
	
	
	@Test
	public void LoginTestPass( ){
		login login = new login();
		
		boolean status =login.login("admin", "admin");
		
		assertTrue(status);

		
		
	}   
	
	
	
	@Test
	public void LoginTestFail( ){
		login login = new login();
		
		boolean status =login.login("admin", "admn");
		
		assertFalse(status);

		
		
	}   
	
	

	@Test
	public void LoginTestFail1( ){
		login login = new login();
		
		boolean status =login.login("admn", "admn");
		
		
		assertFalse(status);

		
		
	} 
	
	
	
	
	

}
