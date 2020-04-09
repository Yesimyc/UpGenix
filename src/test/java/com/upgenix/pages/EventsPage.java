package com.upgenix.pages;

import com.upgenix.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.SortedSet;

public class EventsPage extends BasePage {


    @FindBy(className = "o_sub_menu_logo")
    public WebElement ERPLogoElement;

    @FindBy(css = "[data-action-id='120']")
    public WebElement eventsElement;

    @FindBy(css = "[data-menu-xmlid='event.menu_reporting_events']")
    public WebElement reportingElement;

    @FindBy(css = "[data-action-id='141']")
    public WebElement SecondEventsElement;

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


    public List<String> getDropdowns() {
        return BrowserUtils.getListOfString(Dropdowns);
    }

    public List<String> getFilterDropdownMenu() {
        return BrowserUtils.getListOfString(filterDropDownMenu);
    }

//    public String getDefaultSelectedOption() {
//        Select select = new Select(filtersButton);
//        return select.getFirstSelectedOption().getText();
//
//    }

}

