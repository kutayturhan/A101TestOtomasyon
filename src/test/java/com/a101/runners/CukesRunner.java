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
                //HTML raporu olusturur.
                "html:target/cucumber-report.html",

                //Cucumber raporu olusturur.
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        //Features dosyasinin yerini tanitir.
        features = "src/test/resources/features",

        //Step Definitions dosyasinin yerini tanitir.
        glue = "com/a101/step_definitions",

        //True degeri verilirse, kodumuzun gercek uygulamasini calistirmayacaktir.
        //Sadece ozellik dosyasi adimlarini step definitions tanimlarina gore kontrol edecektir.
        //False degeri verilirse kodumuzu calistiracaktir.
        dryRun = false,

        //Features dosyamizda spesifik olarak etiketledigimiz senaryoyu calistirmamizi saglar.
        tags = ""

)
public class CukesRunner {
}
