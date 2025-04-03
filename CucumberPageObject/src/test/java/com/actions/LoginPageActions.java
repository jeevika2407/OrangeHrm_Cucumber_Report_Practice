package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilites.HelperClass;

public class LoginPageActions {
LoginPageLocators loginPageLocators=null;
String strUserName,strPassword;

public LoginPageActions() {
	this.loginPageLocators=new LoginPageLocators();
	PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
}
public void setUserName(String strUserName) {
	loginPageLocators.userName.sendKeys(strUserName);
}
public void setPassword(String strPassword) {
	loginPageLocators.password.sendKeys(strPassword);
}
public void clickLogin() {
	loginPageLocators.login.click();
}
public void login() {
	File file=new File("C:\\Users\\kirub\\git\\cucumberReportPractice\\CucumberPageObject\\src\\test\\resources\\testdata.properties");
	FileInputStream fileInput=null;
	try {
		fileInput=new FileInputStream(file);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop=new Properties();
	try {
		prop.load(fileInput);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	strUserName=prop.getProperty("username");
	strPassword=prop.getProperty("password");
	
	this.setUserName(strUserName);
	this.setPassword(strPassword);
	this.clickLogin();
}
}
