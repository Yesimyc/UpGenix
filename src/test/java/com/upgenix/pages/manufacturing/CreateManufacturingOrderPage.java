package com.upgenix.pages.manufacturing;

import com.upgenix.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateManufacturingOrderPage extends BasePage {

        @FindBy(css = "[accesskey='c']")
    public WebElement createManufacturingOrderButton;

    @FindBy(xpath = "//div[@name='product_id']//div//input")
    public WebElement productInputBox;

    @FindBy(xpath = "(//a[contains(text(),'Search More...')])")
    public WebElement searchMoreProduct;

    @FindBy(xpath = "(//input[@class='o_searchview_input'])[2]")
    public WebElement productSearch;

    @FindBy(xpath = "(//tbody[@class='ui-sortable'])[3]//tr[1]//td[2]")
    public WebElement productName;

    @FindBy(css = "[name='product_qty']")
    public WebElement productQuantity;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm o_form_button_save'])")
  public WebElement saveManufacturingOrderButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[2]")
    public WebElement orderTitle;

    @FindBy(css="[class='btn btn-default btn-sm o_form_button_create']")
    public WebElement secondCreateButton;
}
