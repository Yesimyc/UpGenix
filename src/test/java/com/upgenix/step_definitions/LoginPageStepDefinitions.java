package com.upgenix.step_definitions;

import com.upgenix.pages.BasePage;
import com.upgenix.pages.DiscussPage;
import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginPageStepDefinitions {
    LoginPage loginPage=new LoginPage();
    BasePage basePage = new BasePage();
    DiscussPage discussPage = new DiscussPage();

    private WebDriver driver;


    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the landing page");
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user clicks login button")
    public void user_clicks_login_button() {
        BrowserUtils.wait(6);
  //  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        loginPage.loginModule.click();

    }

    @Then("user verifies that {string} link displayed")
    public void user_verifies_that_link_displayed(String string) {
      Assert.assertEquals("Best solution for startups",basePage.pageTitle.getText());
        System.out.println(basePage.pageTitle.getText());
        System.out.println("Best solution for startups");
    }

    @When("user logs in as eventscrmmanager")
    public void user_logs_in_as_eventscrmmanager() {

        String username = ConfigurationReader.getProperty("eventscrm.manager.username");
        String password = ConfigurationReader.getProperty("eventscrm.manager.password");
        loginPage.login(username,password);
        System.out.println("user logs in as eventscrmmanager");

    }

    @When("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        BrowserUtils.wait(3);
       // driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
      Assert.assertEquals("#Inbox",discussPage.inboxText.getText());
        System.out.println(discussPage.inboxText.getText());
        System.out.println("#Inbox");

    }
    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
      //  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        loginPage.login(string,string2);

    }

    @When("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println(loginPage.errorMessage.getText());
        System.out.println(string);
        Assert.assertEquals(string, loginPage.errorMessage.getText());

    }
    @When("user logs in as eventscrmmanager with following credentials")
    public void user_logs_in_as_eventscrmmanager_with_following_credentials(Map<String, String> dataTable) {
        System.out.println(dataTable);
        loginPage.login(dataTable.get("username"), dataTable.get("password"));


    }

    @When("user logs in as {string}")
    public void userLogsInAs(String role) {
        BrowserUtils.wait(6);
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        loginPage.login(role);
    }


}
//   public static void main(String[] args) {
////        ExcelUtil qa2 = new ExcelUtil("vytrack_testusers.xlsx", "QA2-short");
////        System.out.println("Row count: " + qa2.rowCount());
////        System.out.println(qa2.getColumnsNames());
////        //map is a data structure
////        //in map, every value is referenced by key
////        //when we retrieve data from map, we don't specify index, we specify key name
////        //keys must be unique
////        //keys are represented by column names
////        //like in properties file key=value
////        for (Map<String, String> map : qa2.getDataList()) {
////            System.out.println(map.get("username"));
////        }
////    }