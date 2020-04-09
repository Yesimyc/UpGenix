package com.upgenix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscussPage extends BasePage {

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[@class='active']")
    public WebElement inboxText;

    @FindBy(linkText = "Events")
    public WebElement eventsModule;
}
