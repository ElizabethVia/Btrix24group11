package com.Btrix24.runners;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin= { "html:target/default-cucumber-reports",
                    "json:target/cucumber.json"},
            features= "src/test/resources/com/Btrix24/features/",
            glue="com/Btrix24/step_definitions",
            tags="@createTask",
            dryRun= false

    )
    public class CukesRunner {
}
