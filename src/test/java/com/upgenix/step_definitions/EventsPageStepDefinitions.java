package com.upgenix.step_definitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.DiscussPage;
import com.upgenix.pages.events.EventsPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EventsPageStepDefinitions {

    EventsPage eventsPage = new EventsPage();
    DiscussPage discussPage = new DiscussPage();

   private WebDriver driver;
   private WebDriverWait wait;


    @Given("User is on the {string} page")
    public void user_is_on_the_page( String string) {


    }

    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String moduleName) {
        BasePage.navigateTo(moduleName);

    }
    @Given("user verifies that {string} element is displayed")
    public void user_verifies_that_element_is_displayed(String string) {
       eventsPage.elementIsDisplayed(string);
    }

    @Then("user verifies that {string} element is clickable")
    public void user_verifies_that_element_is_clickable(String string) {
        eventsPage.elementIsClickable(string);

    }
    @Given("user clicks on {string} button")
    public void user_clicks_on_button(String button) {
    eventsPage.clickButton(button);
}


        @Then("user verifies that {string} has following options")
        public void user_verifies_that_has_following_options(String string, List<String> dataTable) {
        System.out.println(dataTable);
        BrowserUtils.wait(9);
       System.out.println(eventsPage.getdropDownOptionsEventsPage(string));
       Assert.assertEquals(dataTable, eventsPage.getdropDownOptionsEventsPage(string));

    }

    @Then("user verifies that {string} option is selected")
    public void user_verifies_that_option_is_selected(String string) {
       eventsPage.defaultSelected(string);

    }


//    @When("user clicks on {string} button")
//    public void user_clicks_on_button(String string) {
//        BrowserUtils.wait(2);
//        eventsPage.filtersButton.click();
//        BrowserUtils.wait(2);
//
//    }
//
//    @When("verifies dropdown menu has following options")
//    public void verifies_dropdown_menu_has_following_options(List<String> dataTable) {
//        System.out.println(dataTable);
//        BrowserUtils.wait(10);
//        System.out.println(eventsPage.getFilterDropdownMenu());
//        BrowserUtils.wait(3);
//        Assert.assertEquals(dataTable, eventsPage.getFilterDropdownMenu());
//        BrowserUtils.wait(3);
//
//    }
//
//    @Given("User clicks on third icon")
//    public void user_clicks_on_third_icon() {
//        BrowserUtils.wait(3);
//       eventsPage.thirdIcon.click();
//        BrowserUtils.wait(2);
//    }
//
//    @Then("user verifies that {string} option is selected")
//    public void user_verifies_that_option_is_selected(String defaultSelection) {
//        BrowserUtils.wait(4);
//        eventsPage.upcomingOption.click();
//      Assert.assertFalse(eventsPage.upcomingOption.isSelected());
//
//
//    }
//
//    @Then("User verifies that {string} number")
//    public void user_verifies_that_number(String string) {
//       int numberOfEvents = eventsPage.upcomingEventsList.size();
//        System.out.println(numberOfEvents);
//        System.out.println(eventsPage.recordNumberOfPage.getText());
//
//    }
//    @Then("user verifies {string} number is equal number left top oin the page")
//    public void user_verifies_number_is_equal_number_left_top_oin_the_page(String string) {
//       int numberOfEvents = eventsPage.upcomingEventsList.size();
//        String numberOfRecords = eventsPage.recordNumberOfPage.getText();
//        Assert.assertTrue(numberOfRecords.contains(numberOfEvents+""));
//
//    }
//
//
//
//
//
//
//


}
