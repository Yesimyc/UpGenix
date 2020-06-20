package com.upgenix.pages.manufacturing;

import com.upgenix.pages.BasePage;
import com.upgenix.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CreateProductPage extends BasePage {

    @FindBy(linkText = "Products")
    public WebElement productsLink;

    @FindBy(linkText = "Manufacturing Orders")
    public WebElement manufacturingOrdersLink;

    @FindBy(linkText = "Bills of Materials")
    public WebElement billsOfMaterialLink;


    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(css = "[placeholder='Product Name']")
    public WebElement productNameInputBox;

    @FindBy(xpath = "(//input[@class='o_input'])[1]")
    public WebElement salesPriceInputBox;

    @FindBy(xpath = "(//input[@class='o_input'])[2]")
    public WebElement costInputBox;

    @FindBy(xpath = "(//button[@accesskey='s'])")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement secondCreateButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[2]")
    public WebElement productNameInTheTitle;

    @FindBy(css = "[class='btn btn-default btn-sm o_form_button_create']")
    public WebElement SecondCreateButton;




    public void clickManufacturingSubmodule(String submodule){

        switch (submodule){
            case "Products":
                productsLink.click();
                break;
            case "Manufacturing Orders":
               manufacturingOrdersLink.click();
                break;
            case "Bills of Materials":
                billsOfMaterialLink.click();
                break;

        }

    }

    public void clickCreateProduct(){
        createButton.click();
        BrowserUtils.wait(2);
    }


}
