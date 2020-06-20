package com.upgenix.pages;

import com.upgenix.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DiscussPage extends BasePage {

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[@class='active']")
    public WebElement inboxText;

    @FindBy(linkText = "Events")
    public WebElement eventsModule;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']/li")
    public List<WebElement> listOfModule;


    public List<String> getListOfModule(){
        return BrowserUtils.getListOfString(listOfModule);
    }
}
