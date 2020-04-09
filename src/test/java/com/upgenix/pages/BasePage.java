package com.upgenix.pages;

import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.spi.LoginModule;

public class BasePage {

@FindBy(id= "menu-item-334")
public WebElement loginModule;

@FindBy(linkText = "Best solution for startups")
public WebElement pageTitle;

public BasePage(){
    PageFactory.initElements(Driver.get(), this);
}



}
