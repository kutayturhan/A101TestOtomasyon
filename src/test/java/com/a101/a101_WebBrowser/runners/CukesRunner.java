package com.a101.a101_WebBrowser.runners;

//Runner sinifimiza istedigimiz ismi verebiliriz.
//CukesRunner ismi orijinal cucumber dokumantasyonundan gelmektedir. Bu yuzden CukesRunner ismini tercih edebiliriz.

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //HTML raporu olusturur. Yeterli buluyorum. Cucumber rapor falan da var ama bu ok ya.
                "html:target/cucumber-report.html",
        },
        //Features dosyasinin yerini tanitir.
        features = "src/test/resources/features/a101_Modul_Fonksiyon_Test.WebBrowser.feature",

        //Step Definitions dosyasinin yerini tanitir.
        glue = "com/a101/a101_WebBrowser/step_definitions",

        //True degeri verilirse, kodumuzun gercek uygulamasini calistirmayacaktir.
        //Sadece ozellik dosyasi adimlarini step definitions tanimlarina gore kontrol edecektir.
        //False degeri verilirse kodumuzu calistiracaktir.
        dryRun = false,

        //Features dosyamizda spesifik olarak etiketledigimiz senaryoyu calistirmamizi saglar.
        tags = ""

)
public class CukesRunner {
}
