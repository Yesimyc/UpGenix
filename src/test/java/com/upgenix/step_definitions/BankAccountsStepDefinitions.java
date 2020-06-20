package com.upgenix.step_definitions;

import com.upgenix.pages.contacts.BankAccountsPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BankAccountsStepDefinitions {
    BankAccountsPage bankAccountsPage= new BankAccountsPage();

    @Then("user clicks on {string} module")
    public void user_clicks_on_module(String module) {
       bankAccountsPage.clickModule(module);
    }

    @Then("user clicks on {string} submodule")
    public void user_clicks_on_submodule(String subModule) {
        bankAccountsPage.clickSubModule(subModule);
        BrowserUtils.wait(3);

    }

    @Then("user create a bank account with following informations")
    public void user_create_a_bank_account_with_following_informations(List<Map<String, String>> dataTable) {
        bankAccountsPage.createBankButton.click();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        for (Map<String, String> map : dataTable) {
            bankAccountsPage.bankNameInputBox.sendKeys(map.get("Bank Name"));
            BrowserUtils.wait(2);
            bankAccountsPage.searchBankStreetInputBox.sendKeys(map.get("Street"));
            BrowserUtils.wait(2);
            bankAccountsPage.searchBankCityInputBox.sendKeys(map.get("City"));
            BrowserUtils.wait(2);
            bankAccountsPage.searchStateInputBox.click();
            bankAccountsPage.searchBankStateCreateAndEdit.click();
            BrowserUtils.wait(2);
            bankAccountsPage.createStateNameInputBox.sendKeys(map.get("State Name"));
            BrowserUtils.wait(2);
            bankAccountsPage.createStateCodeInputBox.sendKeys(map.get("State Code"));
            BrowserUtils.wait(2);
            bankAccountsPage.createStateCountryInputBox.click();
            bankAccountsPage.createStateCountrySearchMore.click();
            bankAccountsPage.createStateCountrySearch.sendKeys(map.get("Country"));
            bankAccountsPage.createStateCountrySearch.sendKeys(Keys.ENTER);
            BrowserUtils.wait(2);

            if (bankAccountsPage.createStateCountryFirstRow.getText().equals(map.get("Country"))) {
                BrowserUtils.wait(2);
                bankAccountsPage.createStateCountryFirstRow.click();
                bankAccountsPage.createStateCountrySaveButton.click();
                BrowserUtils.wait(2);
            } else {
                bankAccountsPage.createStateCountryCreateButton.click();
                bankAccountsPage.createStateCountryCountryname.sendKeys(map.get("Country"));
                bankAccountsPage.createStateCountrySave.click();
                BrowserUtils.wait(2);
            }


            bankAccountsPage.searchBankCityInputBox.sendKeys(map.get("Zipcode"));
            BrowserUtils.wait(2);
            bankAccountsPage.bankSaveButton.click();

        }
    }
  //====================================
         @Then("user clicks on {string} bank's select box")
         public void user_clicks_on_bank_s_select_box(String bank) {
             BrowserUtils.wait(2);
        bankAccountsPage.clickBankAccount(bank);
             BrowserUtils.wait(2);


         }

         @When("user clicks on {string} button select {string} option")
         public void user_clicks_on_button_select_option(String string, String string2) {
        bankAccountsPage.banksEditAction.click();
        bankAccountsPage.banksEditActionDelete.click();
             BrowserUtils.wait(2);


         }

         @When("user verifies that {string} confirmation message is displayed")
         public void user_verifies_that_confirmation_message_is_displayed(String string) {
             Assert.assertEquals(string, bankAccountsPage.deleteConfirmationMessage.getText());
             System.out.println(string);
             System.out.println(bankAccountsPage.deleteConfirmationMessage.getText());

         }

         @Then("user clicks on {string} button on confirmation window")
         public void user_clicks_on_button_on_confirmation_window(String string) {
        bankAccountsPage.deleteOk.click();

         }

    @When("user clicks on {string} button on the Banks Page")
    public void user_clicks_on_button_on_the_Banks_Page(String string) {
        bankAccountsPage.clickButtonOnBanksPage(string);

    }

    @When("user change {string} to {string}")
    public void user_change_to(String string, String string2) {
        bankAccountsPage.bankEditFromTo(string,string2);


    }

    @Then("user change all {string} name to {string}")
    public void user_change_all_name_to(String string, String string2) {
        bankAccountsPage.changeAllBankName(string,string2);

    }










}
