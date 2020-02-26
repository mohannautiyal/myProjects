package com.home;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinition1 {

	int sum;
	
	@Before
	public void beforeHook() {
		System.out.println("------------------------------------------");
		//System.out.println("This is to be run before each scenario");
	}
	
@After
public void runAfter() {
	System.out.println("------------------------------------------");
	
}

@Given("two numbers {int} and {int}")
public void inputNumbers(Integer s1, Integer s2) {
	 sum = s1 +s2;
	//System.out.println(s1+s2);
    
}

@Then("the {string} should be {int}")
public void the_sum_should_be(String str,Integer int1) {


   System.out.println("The sum of the numbers is " + sum);
}




}
