package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src//test//resources//practice//Features//LoginPage.feature",
	    glue = "com.definitions",
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html",
	        "json:target/cucumber.json",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/extent-report/"
	    }
	)

public class runnerTestNG extends AbstractTestNGCucumberTests {
    
}
