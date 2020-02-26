package com.home;

public class runnerClass {

	public static void main(String[] args) {

		
		singleton s1= singleton.getInstance();
		singleton s2 = singleton.getInstance();
		
		System.out.println(s1==s2);
		
		shapeFactory.getShape("Circle").drawShape();
		shapeFactory.getShape("Rectangle").drawShape();

		
		
	}

}
