package com.upgenix.step_definitions;

import com.upgenix.pages.DiscussPage;
import com.upgenix.pages.EventsPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class EventsPageStepDefinitions {

    EventsPage eventsPage = new EventsPage();
    DiscussPage discussPage = new DiscussPage();

   private WebDriver driver;
   private WebDriverWait wait;


    @Given("User is on the {string} page")
    public void user_is_on_the_page( String string) {


    }

    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        discussPage.eventsModule.click();
        System.out.println(discussPage.eventsModule.getText());
        Assert.assertEquals("Events", discussPage.eventsModule.getText());

    }

    @Then("user verifies ERP logo displayed")
    public void user_verifies_ERP_logo_displayed() {
        BrowserUtils.wait(10);
        Assert.assertTrue(eventsPage.ERPLogoElement.isDisplayed());

    }
    @Given("user verifies that {string} element is displayed")
    public void user_verifies_that_element_is_displayed(String string) {
        Assert.assertTrue(eventsPage.eventsElement.isDisplayed());
        Assert.assertTrue(eventsPage.reportingElement.isDisplayed());
        Assert.assertTrue(eventsPage.configurationElement.isDisplayed());
        Assert.assertTrue(eventsPage.eventCategoriesElement.isDisplayed());

    }

    @Given("user verifies that {string} element is clickable")
    public void user_verifies_that_element_is_clickable(String string) {
        BrowserUtils.wait(2);
        Assert.assertTrue(eventsPage.eventsElement.isEnabled());
        Assert.assertTrue(eventsPage.eventCategoriesElement.isEnabled());


    }


    @Given("user verifies that {string} subelement is displayed")
    public void user_verifies_that_subelement_is_displayed(String string) {
        BrowserUtils.wait(2);
        Assert.assertTrue(eventsPage.SecondEventsElement.isDisplayed());

    }

    @Given("user verifies that {string} subelement is clickable")
    public void user_verifies_that_subelement_is_clickable(String string) {
        BrowserUtils.wait(2);
        Assert.assertTrue(eventsPage.SecondEventsElement.isEnabled());

    }

@Given("user clicks on {string}")
public void user_clicks_on(String string) {
    BrowserUtils.wait(2);
    eventsPage.searchIcon.click();
    BrowserUtils.wait(2);
}

    @Given("user verifies that Events pages has following button")
    public void user_verifies_that_Events_pages_has_following_button(List<String> dataTable) {

        System.out.println(dataTable);
        BrowserUtils.wait(9);
       System.out.println(eventsPage.getDropdowns());
       Assert.assertEquals(dataTable, eventsPage.getDropdowns());

    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        BrowserUtils.wait(2);
        eventsPage.filtersButton.click();
        BrowserUtils.wait(2);

    }

    @When("verifies dropdown menu has following options")
    public void verifies_dropdown_menu_has_following_options(List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(10);
        System.out.println(eventsPage.getFilterDropdownMenu());
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable, eventsPage.getFilterDropdownMenu());
        BrowserUtils.wait(3);

    }

    @Given("User clicks on third icon")
    public void user_clicks_on_third_icon() {
        BrowserUtils.wait(3);
       eventsPage.thirdIcon.click();
        BrowserUtils.wait(2);
    }

    @Then("user verifies that {string} option is selected")
    public void user_verifies_that_option_is_selected(String defaultSelection) {
        BrowserUtils.wait(4);
        eventsPage.upcomingOption.click();
      Assert.assertFalse(eventsPage.upcomingOption.isSelected());


    }

    @Then("User verifies that {string} number")
    public void user_verifies_that_number(String string) {
       int numberOfEvents = eventsPage.upcomingEventsList.size();
        System.out.println(numberOfEvents);
        System.out.println(eventsPage.recordNumberOfPage.getText());

    }
    @Then("user verifies {string} number is equal number left top oin the page")
    public void user_verifies_number_is_equal_number_left_top_oin_the_page(String string) {
       int numberOfEvents = eventsPage.upcomingEventsList.size();
        String numberOfRecords = eventsPage.recordNumberOfPage.getText();
        Assert.assertTrue(numberOfRecords.contains(numberOfEvents+""));

    }









}
