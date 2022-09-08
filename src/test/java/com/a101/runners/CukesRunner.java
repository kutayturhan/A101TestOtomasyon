package com.a101.runners;

//Runner sinifimiza istedigimiz ismi verebiliriz.
//CukesRunner ismi orijinal cucumber sunumundan gelmektedir. Bu yuzden CukesRunner ismini tercih edebiliriz.
//We can give any name we want to our runner class.
//CukesRunner name comes from the original cucumber introduction. That's why we might prefer the name CukesRunner.

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //HTML raporu olusturur. / Creates HTML report.
                "html:target/cucumber-report.html",

                //Cucumber raporu olusturur. / Creates Cucumber report.
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        //Features dosyasinin yerini tanitir. // Identifies the location of the Features file.
        features = "src/test/resources/features",

        //Step Definitions dosyasinin yerini tanitir. // Identifies the location of the Step Definitions file.
        glue = "com/a101/step_definitions",

        //False olarak ayarlanirsa,kodumuzun gercek implementasyonunu calistirmayacaktir.
        //Sadece features dosyasi adımlarini step definitions'a gore kontrol edecektir.
        //If it set to false, will not run the actual implementation of our code.
        //It will just check the feature file steps against step definitions.
        dryRun = false,

        //Features dosyamizda spesifik olarak etiketledigimiz senaryoyu calistirmamizi saglar.
        //It allows us to run the scenario we have specifically labelled in our Features file.
        tags = ""

)
public class CukesRunner {
}
