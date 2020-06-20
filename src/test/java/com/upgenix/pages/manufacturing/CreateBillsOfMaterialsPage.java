package com.upgenix.pages.manufacturing;

import com.upgenix.pages.BasePage;
import com.upgenix.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateBillsOfMaterialsPage extends BasePage {

    @FindBy(css = "[class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createBillsofMaterialButton;

    //@FindBy(xpath = "//div[@name='product_tmpl_id']//div//input")
    @FindBy(xpath = "(//div[@class='o_group'])[1]//table//tbody/tr[1]//td[2]//div//div//input")
    public WebElement productInputBox;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li[1]")
    public WebElement choosenProduct;

    @FindBy(css = "[name='product_qty']")
    public WebElement productQuantity;

    @FindBy(linkText = "Add an item")
    public WebElement addAnItem;

    @FindBy(xpath = "(//div[@name='product_id'])[2]//div/input")
    public WebElement addFirstMaterial;
    @FindBy(xpath = "(//ul[@id='ui-id-2300'] )//li[1]")
    public WebElement createMaterial;
    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr//td[2]//div//div//input")
    public WebElement addMaterialToProduct;
    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'][@type='button'] )[1]")
    public WebElement SaveAddFirstMaterialToProduct;
    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_required_modifier']//input")
    public WebElement quantityFirstMaterial;

    @FindBy(xpath = "(//tbody[@class='ui-sortable'])//tr[2]//td")
    public WebElement addSecondItem;
    @FindBy(xpath = "(//tbody[@class='ui-sortable'])//tr[2]//td[2]//div//div//input")
    public WebElement addSecondMaterial;
    @FindBy(xpath = "(//tbody[@class='ui-sortable'])//tr[2]//td[5]")
    public WebElement quantitySecondMaterial;

    @FindBy(xpath = "(//tbody[@class='ui-sortable'])//tr[3]//td[2]//div//div//input")
    public WebElement addThirdMaterial;

    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm o_form_button_save'])")
    public WebElement saveBillOfMaterial;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[@class='active']")
    public WebElement productNameOnTitle;

    @FindBy(css = "[class='btn btn-default btn-sm o_form_button_create']")
    public WebElement nextBillCreateButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li")
    public List<WebElement> listOfModule;



    public void clickCreateBillsOfMaterialsButton() {
        createBillsofMaterialButton.click();

    }
    public List<String> getListOfModule(){
        return BrowserUtils.getListOfString(listOfModule);

    }

}