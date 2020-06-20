package com.upgenix.pages.events;

import com.upgenix.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEventPage extends BasePage {

    @FindBy(css = "[accesskey='c']")
    public WebElement createButton;

    @FindBy(css = "[placeholder='Event Name']")
    public WebElement eventNameInputBox;

    @FindBy(css= "[name='organizer_id']")
    public WebElement organizerDropdown;

    @FindBy(xpath = "(//a[text()='Create \"'])[1]")
    public WebElement organizerCreate;


    @FindBy(xpath= "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'] //a[text()='Create and Edit...'])[1]")
    public WebElement organizerCreateAndEditOption;

    @FindBy(css= "[placeholder='Name']")
    public WebElement organizerNameInputBox;

    @FindBy(css= "[class='btn btn-sm btn-primary']")
    public WebElement organizerNameSaveButton;

    @FindBy(css= "[name='address_id']")
    public WebElement locationDropdown;

    @FindBy(xpath= "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'] //a[text()='Create and Edit...'])[2]")
    public WebElement locationCreateAndEditOption;

    @FindBy(css= "[placeholder='Name']")
    public WebElement locationNameInputBox;

    @FindBy(xpath = "(//a[text()='Create \"'])[2]")
    public WebElement locationCreate;

    @FindBy(xpath= "//span[text()='Save']")
    public WebElement locationNameSaveButton;


    @FindBy(xpath = "(//input[@class='o_datepicker_input o_input'])[1]")
    public WebElement startDateInputBox;

    @FindBy(xpath = "(//input[@class='o_datepicker_input o_input'])[2]")
    public WebElement endDateInputBox;


    @FindBy(xpath = "//button[text()='Confirm Event']")
    public WebElement comfirmEventButton;

    @FindBy(css = "[accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']/li[1]")
    public WebElement eventText;

    @FindBy(css = "[class='btn btn-default btn-sm o_form_button_create']")
    public WebElement secondCreateButton;
}
