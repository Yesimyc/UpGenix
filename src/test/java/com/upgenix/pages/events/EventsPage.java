package com.upgenix.pages.events;

import com.upgenix.pages.BasePage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import org.apache.http.impl.EnglishReasonPhraseCatalog;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;

public class EventsPage extends BasePage {



    @FindBy(className = "o_sub_menu_logo")
    public WebElement ERPLogoElement;

    @FindBy(css = "[data-action-id='120']")
    public WebElement eventsElement;

    @FindBy(css = "[data-menu-xmlid='event.menu_reporting_events']")
    public WebElement reportingElement;

    @FindBy(css = "[data-action-id='141']")
    public WebElement secondEventsElement;

    @FindBy(css = "[data-menu-xmlid='event.menu_event_configuration']")
    public WebElement configurationElement;

    @FindBy(css = "[data-action-id='139']")
    public WebElement eventCategoriesElement;

    @FindBy(css = "[title='Advanced Search...']")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@class='btn-group o_search_options']/div")
    public List<WebElement> Dropdowns;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement filtersButton;

    @FindBy(xpath = "//li[@data-index='0']")
    public List<WebElement> filterDropDownMenu;

    @FindBy(css = "[title='My Events']")
    public WebElement myEventsOption;

    @FindBy(css = "[title='Upcoming events from today']")
    public WebElement upcomingOption;

    @FindBy(css = "[accesskey='l']")
    public WebElement thirdIcon; // there 4 icon left bottom of the page

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> upcomingEventsList;

    @FindBy(css = "[class='o_pager_limit']")
    public WebElement recordNumberOfPage;

    public void elementIsDisplayed(String element){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(element.equalsIgnoreCase("ERP LOGO")) {
            Assert.assertTrue(ERPLogoElement.isDisplayed());
            System.out.println(element+" is displayed.");
        }else if(element.equalsIgnoreCase("Events")){
            Assert.assertTrue(eventsElement.isDisplayed());
            System.out.println(element+" is displayed.");
        }else if(element.equalsIgnoreCase("Reporting")){
            Assert.assertTrue(reportingElement.isDisplayed());
            System.out.println(element+" is displayed.");
        }else if(element.equalsIgnoreCase(" 2. Events")){
            Assert.assertTrue(secondEventsElement.isDisplayed());
            System.out.println(element+" is displayed.");
        }else if(element.equalsIgnoreCase("Configuration")){
            Assert.assertTrue(configurationElement.isDisplayed());
            System.out.println(element+" is displayed.");;
        }else if(element.equalsIgnoreCase("Event Categories")){
            Assert.assertTrue(eventCategoriesElement.isDisplayed());
            System.out.println(element+" is displayed.");
        }

        }
    public void elementIsClickable(String element) {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if (element.equalsIgnoreCase("Events")){
            Assert.assertTrue(eventsElement.isEnabled());
            if (eventsElement.isEnabled()) {

                System.out.println(element + " is clikable.");
            }
         else if (element.equalsIgnoreCase("2. Events")) {
                Assert.assertTrue(secondEventsElement.isEnabled());
            }
            if (secondEventsElement.isEnabled()) {
                System.out.println(element + " is clikable.");
            }

        } else if (element.equalsIgnoreCase("Event Categories")) {
            Assert.assertTrue(eventCategoriesElement.isEnabled());
            if (eventCategoriesElement.isEnabled())
                System.out.println(element + " is clikable.");
            }



    }

    public void clickButton(String button){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if(button.equalsIgnoreCase("Search")){
            searchIcon.click();
        }else if(button.equalsIgnoreCase("Filters")){
            filtersButton.click();
        }


    }

 public  List<String> getdropDownOptionsEventsPage(String string){
    List<String> empty = new ArrayList<>();
        if(string.equals("Events")){

         return BrowserUtils.getListOfString(Dropdowns);
        }
        else if(string.equals("dropdown menu")){

         return BrowserUtils.getListOfString(filterDropDownMenu);
     }

return empty;
 }


    public List<String> getDropdowns() {
        return BrowserUtils.getListOfString(Dropdowns);
    }

    public List<String> getFilterDropdownMenu() {
        return BrowserUtils.getListOfString(filterDropDownMenu);
    }

    public void defaultSelected(String string){

        if(Driver.get().findElement(By.cssSelector("[class='selected']")).equals(string)){
            System.out.println(Driver.get().findElement(By.cssSelector("[class='selected']")).getText());
            Assert.assertEquals(string, Driver.get().findElement(By.cssSelector("[class='selected']")).getText());
        }

    }

}

