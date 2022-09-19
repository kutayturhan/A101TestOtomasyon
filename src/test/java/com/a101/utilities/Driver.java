package com.a101.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Driver {

    //Private constructor olusturulur. Boylelikle bu sinifin nesnesine sinif disindan erisim kapatilir.
    private Driver() {
    }

    //WebDriver private tanimlanir, cunku sinif disindan erisim saglanmasini istenmez.
    private static WebDriver driver;

    //Yeniden kullanilabilir bir method olusturulur.
    public static WebDriver getDriver() {

        /*
        Singleton design pattern
        if driver null --> yenisini olustur
        if driver doluysa --> devam et
         */
        if (driver == null) {

            //Tarayici tipini configuration.properties dosyasindan taniyarak okur.
            //Boylelikle, kodun disindan yani configuration.properties dosyasindan tarayici tipini kontrol edebiliriz.
            String browserType = ConfigurationReader.getProperty("browser");

            //configuration.properties dosyasindan okuncak olan tarayici tipine gore
            //switch ifadesi durumu belirleyecek ve eslesen tarayiciyi acacaktir.
            switch (browserType) {

                case "chrome":

                    //Tarayici surucusunu olusturan web driver managerin ayarlanmasi.
                    WebDriverManager.chromedriver().setup();


                    System.setProperty("webdriver.chrome.silentOutput", "true");

                    //Chrome bildirimlerini devre disi birakir.
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-notifications");
                    //Chrome surucusunu olusturur. Bos bir tarayici acan satir budur.
                    driver = new ChromeDriver(options);

                    //Bu satir tarayici boyutunu maksimize eder.
                    driver.manage().window().maximize();

                    //Implicit wait, bir web elementini bulurken belirlenen surede bekleyen bir bekleme komutudur.
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }
        }

        return driver;

    }

    //Yeniden kullanilabilir bir method olusturulur.
    //Bu method quit() methodu kullanildiktan sonra mevcut oturumu sonlandiracaktir.
    public static void closeDriver() {

        if (driver != null) {
            driver.quit(); //Oturumu sonlandiran satir bu satirdir.
            driver = null;

        }
    }
}
