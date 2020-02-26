package com.home;

public class shapeFactory {
	
	public static shape shape;
	
	public static shape getShape(String shape) {
		
		if (shape.equals("Circle"))
			return new circle();
		else
			return new square();
		
		
	}

}
