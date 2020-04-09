package com.upgenix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/upgenix/step_definitions",
        dryRun = false,

        tags = "@create_event"

)


public class CukesRunner {
}