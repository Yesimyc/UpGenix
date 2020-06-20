package com.upgenix.step_definitions;

import com.upgenix.pages.manufacturing.CreateProductPage;

import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CreateProductStepDefinitions {

    CreateProductPage createProductPage = new CreateProductPage();

    @When("user clicks on {string} button on the product window")
    public void user_clicks_on_button_on_the_product_window(String string) {
        createProductPage.createButton.click();
    }



    @When("user enters following information into product window")
    public void user_enters_following_information_into_product_window(List<Map<String,String>> dataTable) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        for(Map<String,String> map:dataTable){
            createProductPage.productNameInputBox.sendKeys(map.get("Product Name"));
            System.out.println(map.get("Product Name"));

            createProductPage.salesPriceInputBox.click();
            createProductPage.salesPriceInputBox.clear();

            createProductPage.salesPriceInputBox.sendKeys(map.get("Sales Price"));

            createProductPage.costInputBox.click();
            createProductPage.costInputBox.clear();

            createProductPage.costInputBox.sendKeys(map.get("Cost"));

            createProductPage.saveButton.click();
            BrowserUtils.wait(2);
            createProductPage.secondCreateButton.click();
            BrowserUtils.wait(2);

           // Assert.assertTrue(createProductPage.productNameInTheTitle.getText().equals(map.get("Product Name")));
        }

    }


    @When("user verifies that products name has changed")
    public void user_verifies_that_products_name_has_changed() {
     String title = createProductPage.productNameInTheTitle.getText();
        System.out.println(title);
        Assert.assertTrue(title.equals("New"));
    }



}
