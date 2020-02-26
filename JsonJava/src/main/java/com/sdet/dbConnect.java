package com.sdet;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class dbConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		 ArrayList<emp> emplist = new ArrayList<emp>();
		
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","madan123");
         Statement st = con.createStatement();
         ResultSet rs=  st.executeQuery("select * from emp");
         
         while(rs.next()) {
             emp emp = new emp();
        	 emp.setEmpId(rs.getString(1));
        	 emp.setEmpName(rs.getString(2));
        	 emp.setDesignation(rs.getString(3));
        	
        	 // System.out.println(rs.getString(1)+" " +rs.getString(2)+" " +rs.getString(3));
        	 
             emplist.add(emp);

        	 
         }
         con.close();
         
         ObjectMapper obj = new ObjectMapper();
         
         int i=0;
         for(emp emp:emplist) {
        	 i++;
        	// obj.
        	 obj.writeValue(new File("E:\\SDET Proj\\JsonJava\\target\\emp"+i+".json"), emp);
        	 
         }
         
		

	}

}
