package com.upgenix.step_definitions;

import com.upgenix.pages.manufacturing.CreateManufacturingOrderPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class CreatemanufacturingOrderStepDefinitions {

    CreateManufacturingOrderPage createManufacturingOrderPage = new CreateManufacturingOrderPage();

    @When("user clicks on {string} button on the manufacturing orders page")
    public void user_clicks_on_button_on_the_manufacturing_orders_page(String string) {
        createManufacturingOrderPage.createManufacturingOrderButton.click();
        BrowserUtils.wait(3);

    }

    @Then("user enters following information into manufacturing order window")
    public void user_enters_following_information_into_manufacturing_order_window(List<Map<String,String>> dataTable) {
        for(Map<String, String> map:dataTable){
            BrowserUtils.wait(2);
            createManufacturingOrderPage.productInputBox.sendKeys(map.get("Product"));
            BrowserUtils.wait(2);
            createManufacturingOrderPage.productInputBox.sendKeys(Keys.ENTER);
            BrowserUtils.wait(2);
            //createManufacturingOrderPage.productQuantity.click();
            createManufacturingOrderPage.productQuantity.clear();
            createManufacturingOrderPage.productQuantity.sendKeys(map.get("Quantity To Produce"));
            BrowserUtils.wait(2);
            createManufacturingOrderPage.saveManufacturingOrderButton.click();
            BrowserUtils.wait(3);

   String orderCode=createManufacturingOrderPage.orderTitle.getText();
            System.out.println(orderCode);
            Assert.assertTrue(!createManufacturingOrderPage.orderTitle.getText().equals("New"));
            BrowserUtils.wait(3);
            createManufacturingOrderPage.secondCreateButton.click();


        }

    }
}
