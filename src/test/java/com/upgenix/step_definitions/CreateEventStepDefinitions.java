package com.upgenix.step_definitions;

import com.upgenix.pages.events.CreateEventPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CreateEventStepDefinitions {

  CreateEventPage createEventPage=new CreateEventPage();

//  private WebDriver driver;
  private WebDriverWait wait;


    @Given("user enters following information")
    public void user_enters_following_information(List<Map<String, String>> dataTable) {

        createEventPage.createButton.click();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        for(Map<String,String> map:dataTable){
        createEventPage.eventNameInputBox.sendKeys(map.get("Event Name"));
        BrowserUtils.wait(2);
        createEventPage.organizerDropdown.click();
        createEventPage.organizerCreateAndEditOption.click();
            BrowserUtils.wait(2);
        createEventPage.organizerNameInputBox.sendKeys(map.get("Organizer"));
        createEventPage.organizerNameSaveButton.click();
            BrowserUtils.wait(2);

        createEventPage.locationDropdown.click();
        createEventPage.locationCreateAndEditOption.click();
            BrowserUtils.wait(2);
        createEventPage.locationNameInputBox.sendKeys(map.get("Location"));
            BrowserUtils.wait(2);
        createEventPage.locationNameSaveButton.click();
            BrowserUtils.wait(2);

        //createEventPage.startDateInputBox.click();
//            WebDriverWait wait= new WebDriverWait(Driver.get(), 14);
//            wait.until(ExpectedConditions.elementToBeClickable(createEventPage.startDateInputBox));
//
//            Driver.get().manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);

        createEventPage.startDateInputBox.sendKeys(map.get("Start Date"));
            BrowserUtils.wait(2);
        createEventPage.endDateInputBox.click();
        createEventPage.endDateInputBox.sendKeys(map.get("End Date"));
            BrowserUtils.wait(2);

        createEventPage.comfirmEventButton.click();
            BrowserUtils.wait(2);
        createEventPage.saveButton.click();
            BrowserUtils.wait(2);

        createEventPage.secondCreateButton.click();
            BrowserUtils.wait(2);




    }

//    @Given("user clicks on Create button")
//    public void user_clicks_on_Create_button() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      createEventPage.createButton.click();
//    }
//
//    @Then("user clicks on Event Name button")
//    public void user_clicks_on_Event_Name_button() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.eventNameInputBox.click();
//    }
//    @Then("user writes Hello Summer Party")
//    public void user_writes_Hello_Summer_Party() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.eventNameInputBox.sendKeys("Welcome Summer Party for Kids");
//    }
//
//    @Then("user clicks on Organizer button")
//    public void user_clicks_on_Organizer_button() {
//        BrowserUtils.wait(6);
//        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.organizerDropdown.click();
//    }
//
//    @Then("user clicks on Create and Edit button")
//    public void user_clicks_on_Create_and_Edit_button() {
//        BrowserUtils.wait(8);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//       createEventPage.organizerCreateAndEditOption.click();
//    }
//
//    @When("user clicks on Name button")
//    public void user_clicks_on_Name_button() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.organizerNameInputBox.click();
//    }
//
//    @When("user writes Ziba")
//    public void user_writes_Ziba() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.organizerNameInputBox.sendKeys("Ziba");
//    }
//
//    @When("user clicks on Save button")
//    public void user_clicks_on_Save_button() {
//        BrowserUtils.wait(6);
//      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//       createEventPage.organizerNameSaveButton.click();
//    }
//
//    @Then("user clicks on Location button")
//    public void user_clicks_on_Location_button() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      createEventPage.locationDropdown.click();
//    }
//
//    @When("user writes Grand Lakes Area")
//    public void user_writes_Grand_Lakes_Area() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//       createEventPage.locationCreateAndEditOption.click();
//        BrowserUtils.wait(6);
//        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//       createEventPage.locationNameInputBox.sendKeys("Grand Lakes Park");
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        BrowserUtils.wait(6);
//       createEventPage.locationNameSaveButton.click();
//        BrowserUtils.wait(6);
//        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//
//    @When("user clicks on start date")
//    public void user_clicks_on_start_date() {
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.startDateInputBox.click();
//
//    }
//
//    @Then("user writes {double}{double}")
//    public void user_writes(Double double1, Double double2) {
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        BrowserUtils.wait(6);
//        createEventPage.startDateInputBox.sendKeys("04.23.2020");
//    }
//
//    @Then("user clicks on end date")
//    public void user_clicks_on_end_date() {
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        BrowserUtils.wait(6);
//       createEventPage.endDateInputBox.click();
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//       createEventPage.endDateInputBox.sendKeys("04.25.2020");
//        BrowserUtils.wait(6);
//       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        createEventPage.saveButton.click();
//        BrowserUtils.wait(6);
//    }


}}



