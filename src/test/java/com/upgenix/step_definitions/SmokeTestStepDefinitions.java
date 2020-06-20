package com.upgenix.step_definitions;

import com.upgenix.pages.DiscussPage;
import com.upgenix.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmokeTestStepDefinitions {

    DiscussPage discussPage = new DiscussPage();

    @Then("user verifies that {string} has following  options")
    public void user_verifies_that_has_following_options(String Module) {


        BrowserUtils.wait(2);
        Assert.assertEquals(Module,discussPage.getListOfModule().toString().replace("[","").replace("]",""));
        System.out.println(Module);
        System.out.println(discussPage.getListOfModule());
    }


}
