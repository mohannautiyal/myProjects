package com.home;

public class singleton {

	public static singleton instance;

	private singleton() {
      System.out.println("Created new singleton");
	}

	public static singleton getInstance() {

		if (instance == null) {
			instance = new singleton();
		}

		return instance;

	}

}
