package com.upgenix.pages;

import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.spi.LoginModule;
import java.util.concurrent.TimeUnit;

public class BasePage {

@FindBy(id= "menu-item-334")
public WebElement loginModule;

@FindBy(linkText = "Best solution for startups")
public WebElement pageTitle;

public BasePage()
{
    PageFactory.initElements(Driver.get(), this);
}

public static void navigateTo(String moduleName){

   // Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    BrowserUtils.wait(6);

   // String moduleLocater = "//*[normalize-space()='" + moduleName + " ' and @class='oe_menu_toggler']";
  //  String moduleLocator = "//*[normalize-space()='" + moduleName + " ' and @class='title title-level-1']"
    WebElement Element=Driver.get().findElement(By.linkText(moduleName));
    Element.click();
    BrowserUtils.wait(10);




}



}
