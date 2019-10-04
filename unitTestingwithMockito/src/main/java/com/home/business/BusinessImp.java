package com.home.business;

public class BusinessImp {
	private DataService dataService;
		
	/*
	 * public void setDataService(DataService dataService) { this.dataService =
	 * dataService; }
	 */

	public int calcSum(DataService dataService) {
		
		System.out.println("Entering CalcSum Method of Business Imp");
		int sum = 0;
		int data [] = dataService.getData();
		for (int value : data) {
			sum = sum + value;
		}
		return sum;
	}

	
	
	
}
