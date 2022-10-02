package com.a101.webBrowser.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
        },

        features = "src/test/resources/features/a101_Modul_Fonksiyon_Test.WebBrowser.feature",
        glue = "com/a101/webBrowser/step_definitions",
        dryRun = false,
        tags = ""

)
public class CukesRunner {
}