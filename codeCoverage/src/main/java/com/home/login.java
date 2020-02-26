package com.home;

public class login {
	
	
	public boolean login(String user,String pass) {
		
		boolean loginstatus = false;
		if(user.equals("admin"))
		{
			if(pass.equals("admin"))				
			loginstatus = true;
		}
	  	
		
		return loginstatus;
	}

}
