package com.a101.mobileApp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
        },

        features = "src/test/resources/features/a101_Modul_Fonksiyon_Test.Mobile.feature",
        glue = "com/a101/mobileApp/step_definitions",
        dryRun = false,
        tags = ""

)
public class CukesRunner {
}