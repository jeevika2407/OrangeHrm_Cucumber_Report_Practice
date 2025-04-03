package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
@FindBy(name="username")
public WebElement userName;

@FindBy(name="password")
public WebElement password;

@FindBy(xpath="//button[@type='submit']")
public WebElement login;
}
