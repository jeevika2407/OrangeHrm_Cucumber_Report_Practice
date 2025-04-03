package com.actions;

import org.openqa.selenium.support.PageFactory;
import com.pages.HomePageLocators;
import com.utilites.HelperClass;

public class HomePageActions {
    HomePageLocators homePageLocators;

    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }

    public String getHomePageText() {  
        return homePageLocators.homePageUserName.getText();
    }
}
