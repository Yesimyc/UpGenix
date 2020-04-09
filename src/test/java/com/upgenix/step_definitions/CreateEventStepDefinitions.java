package com.upgenix.step_definitions;

import com.upgenix.pages.CreateEventPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateEventStepDefinitions {

  CreateEventPage createEventPage=new CreateEventPage();

  private WebDriver driver;
  private WebDriverWait wait;

    @Given("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      createEventPage.createButton.click();
    }

    @Then("user clicks on Event Name button")
    public void user_clicks_on_Event_Name_button() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.eventNameInputBox.click();
    }
    @Then("user writes Hello Summer Party")
    public void user_writes_Hello_Summer_Party() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.eventNameInputBox.sendKeys("Welcome Summer Party for Kids");
    }

    @Then("user clicks on Organizer button")
    public void user_clicks_on_Organizer_button() {
        BrowserUtils.wait(6);
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.organizerDropdown.click();
    }

    @Then("user clicks on Create and Edit button")
    public void user_clicks_on_Create_and_Edit_button() {
        BrowserUtils.wait(8);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       createEventPage.organizerCreateAndEditOption.click();
    }

    @When("user clicks on Name button")
    public void user_clicks_on_Name_button() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.organizerNameInputBox.click();
    }

    @When("user writes Ziba")
    public void user_writes_Ziba() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.organizerNameInputBox.sendKeys("Ziba");
    }

    @When("user clicks on Save button")
    public void user_clicks_on_Save_button() {
        BrowserUtils.wait(6);
      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       createEventPage.organizerNameSaveButton.click();
    }

    @Then("user clicks on Location button")
    public void user_clicks_on_Location_button() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      createEventPage.locationDropdown.click();
    }

    @When("user writes Grand Lakes Area")
    public void user_writes_Grand_Lakes_Area() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       createEventPage.locationCreateAndEditOption.click();
        BrowserUtils.wait(6);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       createEventPage.locationNameInputBox.sendKeys("Grand Lakes Park");
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BrowserUtils.wait(6);
       createEventPage.locationNameSaveButton.click();
        BrowserUtils.wait(6);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user clicks on start date")
    public void user_clicks_on_start_date() {
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.startDateInputBox.click();

    }

    @Then("user writes {double}{double}")
    public void user_writes(Double double1, Double double2) {
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BrowserUtils.wait(6);
        createEventPage.startDateInputBox.sendKeys("04.23.2020");
    }

    @Then("user clicks on end date")
    public void user_clicks_on_end_date() {
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BrowserUtils.wait(6);
       createEventPage.endDateInputBox.click();
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       createEventPage.endDateInputBox.sendKeys("04.25.2020");
        BrowserUtils.wait(6);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        createEventPage.saveButton.click();
        BrowserUtils.wait(6);
    }


}



