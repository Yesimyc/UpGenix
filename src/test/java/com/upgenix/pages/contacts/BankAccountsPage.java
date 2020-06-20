package com.upgenix.pages.contacts;

import com.upgenix.pages.BasePage;
import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BankAccountsPage extends BasePage {

    @FindBy(xpath = "(//span[contains(text(), 'Bank Accounts')])[1]")
    public WebElement bankAccounts;

    @FindBy(xpath = "//span[contains(text(), 'Localization')]")
    public WebElement localization;

    @FindBy(xpath = "//span[contains(text(), 'Banks')]")
    public WebElement banksSubmodule;

    @FindBy(xpath = "(//span[contains(text(), 'Bank Accounts')])[2]")
    public WebElement bankAccountsSubModule;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(css="[accesskey='c']")
    public WebElement createBankButton;

    @FindBy(name = "[name='acc_number']")
    public WebElement accountNumberInputBox;

    @FindBy(name = "[name='bank_id']")
    public WebElement bankInputBox;

    @FindBy(xpath = "//a[text()='Search More...']")
    public WebElement searchMore;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchInputBox;

    @FindBy(css = "[class='o_searchview_more fa fa-search-minus']")
    public WebElement searchIcon;


    @FindBy(xpath = "(//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement firstRow;

    @FindBy(css = "[class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='modal-footer'] /button[1]")
    public WebElement searchCreateButton;

    //Search:Bank window
    @FindBy(css = "[style='o_td_label']")
    public WebElement searchBankNameInputBox;

    @FindBy(name = "street")
    public WebElement searchBankStreetInputBox;

    @FindBy(name = "city")
    public WebElement searchBankCityInputBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement searchStateInputBox;

    @FindBy(xpath = "//a[contains(text(),'Create and Edit...')]")
    public WebElement searchBankStateCreateAndEdit;

    @FindBy(css = "[class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement bankNameInputBox;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[2]")
    public WebElement createStateNameInputBox;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[3]")
    public WebElement createStateCodeInputBox;

    @FindBy(xpath = "(//input[@autocomplete='off'])[3]")
    public WebElement createStateCountryInputBox;

   @FindBy(xpath = "(//a[text()='Search More...'])[1]")
    public WebElement createStateCountrySearchMore;

   @FindBy(xpath = "(//input[@class='o_searchview_input'])[2]")
   public WebElement createStateCountrySearch;

   @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[1]//td[1]")
   public WebElement createStateCountryFirstRow;

   @FindBy(xpath = "(//span[contains(text(),'Save')])")
   public WebElement createStateCountrySaveButton;

   @FindBy(xpath = "(//span[contains(text(),'Create')])")
   public WebElement createStateCountryCreateButton;

    @FindBy(xpath = "(//a[contains(text(),'Create and Edit...')])[2]")
    public WebElement createStateCountryCreateAndEdit;

    //createState/createCountry
    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[4]")
    public WebElement createStateCountryCountryname;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
    public WebElement createStateCountrySave;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[3]")
    public WebElement createStateSaveButton;

    @FindBy(name = "zip")
    public WebElement searchBankZipInputBox;

    @FindBy(xpath = "(//button[@accesskey='s'])")
    public WebElement bankSaveButton;
//===============================================

    @FindBy(css = "[class='o_data_cell o_required_modifier']")
    public List<WebElement> bankAccountsList;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement banksEditAction;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]/following-sibling::ul/li[1]")
    public WebElement banksEditActionDelete;

    @FindBy(css = "[class='modal-body']")
    public WebElement deleteConfirmationMessage;

    @FindBy(css = "[class='btn btn-sm btn-primary']")
    public WebElement deleteOk;

    @FindBy(css = "[accesskey='a']")
    public WebElement Edit;

    @FindBy(css = "[name='phone']")
    public WebElement banksEditPhone;

    @FindBy(css = "[name='email']")
    public WebElement banksEditEmail;

    @FindBy(css = "[name='name']")
    public WebElement banksEditName;


    public void clickBankAccount(String Bank){

        for(WebElement banks: bankAccountsList){
            if(banks.getText().equals(Bank)){
               banks.click();
            }
        }


    }

    public void clickButtonOnBanksPage(String Button){

        if(Button.equals("Edit")){
            Edit.click();
        }else if(Button.equals("Action")){
            banksEditAction.click();
        }
    }


    public void clickModule(String module) {
        if (module.equals("Bank Accounts")) {
            bankAccounts.click();
        } else if (module.equals("Localization")) {
            localization.click();
        }
    }

    public void clickSubModule(String subModule) {
        if (subModule.equals("Banks")) {
            banksSubmodule.click();
        } else if (subModule.equals("Bank Accounts")) {
            bankAccountsSubModule.click();
        }
    }

    public void bankEditFromTo(String string1, String string2){
        if(string1.equals("Phone")){

            banksEditPhone.clear();
            banksEditPhone.sendKeys(string2);
        }else if(string1.equals("Email")){
            banksEditEmail.clear();
            banksEditEmail.sendKeys(string2);
        }
    }

    public void changeBankName(String bank,String newName){
        clickBankAccount(bank);
        banksEditName.clear();
        banksEditName.sendKeys(newName);
        bankSaveButton.click();
    }

    public void changeAllBankName(String bank,String newName){
        for(WebElement banks: bankAccountsList){
            if(banks.getText().equals(bank)){
                banks.click();
                Edit.click();
                banksEditName.clear();
                banksEditName.sendKeys(newName);
                bankSaveButton.click();
            }
        }
    }
}
