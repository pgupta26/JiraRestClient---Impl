package com.adidas.stepDefinitions;

import com.adidas.serenity.steps.Hooks;

import cucumber.api.java.en.Given;

public class AccountPageSteps {
	
	@Given("Test page title")
	public void Test_page_title() {
		Hooks obj = new Hooks();
		
		System.out.println("**************TEST*******************");
	}

}
