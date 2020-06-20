package com.upgenix.step_definitions;

import com.upgenix.pages.manufacturing.CreateBillsOfMaterialsPage;
import com.upgenix.pages.manufacturing.CreateProductPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class CreateBillsOfMaterialsStepDefinitions {


    CreateProductPage createProductPage = new CreateProductPage();
    CreateBillsOfMaterialsPage createBillsOfMaterialsPage = new CreateBillsOfMaterialsPage();

    @When("user clicks on {string} submodule on the manifacturing page")
    public void user_clicks_on_submodule_on_the_manifacturing_page(String billsOfMaterials) {
     createProductPage.clickManufacturingSubmodule(billsOfMaterials);
        BrowserUtils.wait(2);
    }

    @When("user clicks on {string} button on the Bills of Materials page")
    public void user_clicks_on_button_on_the_Bills_of_Materials_page(String createButton) {
        createBillsOfMaterialsPage.clickCreateBillsOfMaterialsButton();
        BrowserUtils.wait(2);
    }

    @Then("user enters following information into Bills of Materials window")
    public void user_enters_following_information_into_Bills_of_Materials_window(List<Map<String, String>> dataTable) {

        for(Map<String,String> map:dataTable){
            createBillsOfMaterialsPage.productInputBox.sendKeys(map.get("Product"));
            BrowserUtils.wait(2);
            createBillsOfMaterialsPage.choosenProduct.click();
            BrowserUtils.wait(2);
//            createBillsOfMaterialsPage.productQuantity.click();
//            createBillsOfMaterialsPage.productQuantity.clear();
//            createBillsOfMaterialsPage.productQuantity.sendKeys(map.get("Quantity"));
//            BrowserUtils.wait(2);

            createBillsOfMaterialsPage.addAnItem.click();
            BrowserUtils.wait(2);
            createBillsOfMaterialsPage.addFirstMaterial.sendKeys(map.get("Item1"));
            BrowserUtils.wait(4);
            createBillsOfMaterialsPage.addFirstMaterial.sendKeys(Keys.ENTER);
            BrowserUtils.wait(2);
//
//            createBillsOfMaterialsPage.quantityFirstMaterial.click();
//            createBillsOfMaterialsPage.quantityFirstMaterial.sendKeys(map.get("Item1 Quantity"));
//            BrowserUtils.wait(4);
//            createBillsOfMaterialsPage.quantityFirstMaterial.sendKeys(Keys.ENTER);
//            BrowserUtils.wait(5);
          createBillsOfMaterialsPage.addAnItem.click();
          BrowserUtils.wait(4);

            createBillsOfMaterialsPage.addSecondMaterial.sendKeys(map.get("Item2"));
            createBillsOfMaterialsPage.addSecondMaterial.sendKeys(Keys.ENTER);
            BrowserUtils.wait(2);
            createBillsOfMaterialsPage.addSecondMaterial.sendKeys(Keys.ENTER);
            BrowserUtils.wait(4);


            // createBillsOfMaterialsPage.quantitySecondMaterial.click();
          //  createBillsOfMaterialsPage.quantityMaterial.clear();
           // createBillsOfMaterialsPage.quantitySecondMaterial.sendKeys(map.get("Item2 Quantity"));
           // BrowserUtils.wait(2);

            createBillsOfMaterialsPage.saveBillOfMaterial.click();
            BrowserUtils.wait(2);
            createBillsOfMaterialsPage.nextBillCreateButton.click();
            BrowserUtils.wait(2);

        }

    }

    @Then("user verifies that Product name displayed on the page title")
    public void user_verifies_that_Product_name_displayed_on_the_page_title() {

            System.out.println(createBillsOfMaterialsPage.productNameOnTitle.getText());

            Assert.assertTrue(createBillsOfMaterialsPage.productNameOnTitle.getText().equals("New"));

    }

    @Then("user verifies that {string} module didn't displayed")
    public void user_verifies_that_module_didn_t_displayed(String Manufacturing) {
        Assert.assertFalse(createBillsOfMaterialsPage.getListOfModule().contains("Manufacturing"));

    }

}
