package com.a101.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Private constructor olusturulur. Boylelikle bu sinifin nesnesine sinif disindan erisimi kapatilir.
    //Create a private Constructor. In this way, close access to the object of this class from outside the class.
    private Driver(){}

    //WebDriver'i private yapilir, cunku sinif disindan erisim saglanmasini istenmez.
    //Make WebDriver private, because access from outside the class is not wanted.
    private static WebDriver driver;

    //Yeniden kullanilabilir bir method olusturulur.
    //Create a re-usable utility method.
    public static WebDriver getDriver(){

        if (driver == null){

            //Tarayici tipini configuration.properties dosyasindan taniyarak okur.
            //Boylelikle, kodun disindan yani configuration.properties dosyasindan tarayici tipini kontrol edebiliriz.
            //Reads the browser type by identifying it from the configuration.properties file.
            //This way, we can control the browser type from outside our code, from configuration.properties file.
            String browserType = ConfigurationReader.getProperty("browser");

            //configuration.properties dosyasindan okuncak olan tarayici tipine gore
            //switch ifadesi durumu belirleyecek ve eslesen tarayiciyi acacaktir.
            //According to the browser type to be read from the configuration.properties file,
            //the switch statement will determine the state and open the matching browser.
            switch(browserType){
                case "chrome":

                    //Tarayici surucusunu olusturan web driver managerin ayarlanmasi.
                    //Setting up the web driver manager which means creating browser driver.
                    WebDriverManager.chromedriver().setup();

                    //Chrome surucusunu olusturur. Bos bir tarayici acan satir budur.
                    //Create chrome driver. This is the line opening an empty browser.
                    WebDriver driver = new ChromeDriver();

                    //Bu satir tarayici boyutunu maksimize eder.
                    //This line will maximize the broswer size
                    driver.manage().window().maximize();

                    //Implicit wait, bir web elementini bulurken belirlenen surede bekleyen bir bekleme komutudur.
                    //Implicit wait is a wait command that waits for a specified time while finding a web element.
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driver;

    }
    //Yeniden kullanilabilir bir method olusturulur.
    //Bu method quit() methodu kullanildiktan sonra mevcut oturumu sonlandiracaktir.
    //Create a re-usable utility method.
    //This method will will terminate the existing session.
    public static void closeDriver(){
        if (driver != null){
            driver.quit(); //Oturumu sonlandiran satir bu satirdir. / This is the line will terminate the session.
            driver = null;
        }
    }

}
