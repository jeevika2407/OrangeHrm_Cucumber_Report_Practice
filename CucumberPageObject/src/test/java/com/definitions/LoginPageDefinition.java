package com.definitions;

import org.testng.Assert;

import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.utilites.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinition{
	LoginPageActions objLogin =new LoginPageActions();
	HomePageActions objHomePage=new HomePageActions();

@Given("User is on HRMLogin page {string}")
	public void LoginTest(String url) {
		   HelperClass.openPage(url);
}

@When("User enters username and password")
	public void goToHomePage() {
		 objLogin.login();
		}

@Then("User should be able to login successfully and new page open")
public void verifyLogin() {
  Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
	}
}