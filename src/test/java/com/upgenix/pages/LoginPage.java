package com.upgenix.pages;

import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "login")
    public WebElement userNameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(css = "[class='alert alert-danger']")
    public WebElement errorMessage;

    public void login(String userName, String password) {
        userNameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        BrowserUtils.wait(4);
        loginButton.click();
    }

    public void login() {
            login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        }

    public void login(String role) {
        String userName = "";
        String password = "";

        switch (role) {
            case "posmanager":
                userName = ConfigurationReader.getProperty("pos.manager.username");
                password = ConfigurationReader.getProperty("pos.manager.password");
                break;
            case "inventorymanager":
                userName = ConfigurationReader.getProperty("inventory.manager.username");
                password = ConfigurationReader.getProperty("inventory.manager.password");
                break;
            case "expensesmanager":
                userName = ConfigurationReader.getProperty("expenses.manager.username");
                password = ConfigurationReader.getProperty("expenses.manager.password");

                break;
            case "eventscrmmanager":
                userName = ConfigurationReader.getProperty("eventscrm.manager.username");
                password = ConfigurationReader.getProperty("eventscrm.manager.password");

                break;
            case "salesmanager":
                userName = ConfigurationReader.getProperty("sales.manager.username");
                password = ConfigurationReader.getProperty("sales.manager.password");
                break;

            default:
                throw new RuntimeException("Invalid role!");
        }
        login(userName, password);
    }


    }

