package com.a101.step_definitions;

import com.a101.pages.Pop_up_Banner_Alert_Page;
import com.a101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Modul_Fonksiyon_Test {

    //Olusturulan "Pop_up_Banner_Alert_Page" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "popUpBannerAlertPage" ismini vererek nesne olusturur.
    //Defines a variable from the created "Pop_up_Banner_Alert_Page" java class.
    //Creates an object by naming this variable "popUpBannerAlertPage".
    Pop_up_Banner_Alert_Page popUpBannerAlertPage = new Pop_up_Banner_Alert_Page();

    //Selenium kutuphanesinden gelen WebDriverWait classi ile degisken tanimlamasi yaparak nesne olusturur.
    //Web Surucusune belirli kosullari beklemesini soylemek icin kullanilir.
    //Creates an object by defining a variable with the WebDriverWait class from the Selenium library.
    //Used to tell the web driver to wait for certain conditions.
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar")
    public void kullanici_www_a101_com_tr_adresindeki_web_sayfasina_giris_yapar() {

        //Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
        //The user logs in to the web page at www.a101.com.tr
        Driver.getDriver().get("https://www.a101.com.tr/");

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir.
        //Web surucusune cerez bannerindaki kabul et butonu tiklanabilir olana kadar beklemesini soyler.
        //It calls the object created at class level with the variable name.
        //It tells the web driver to wait until the accept button on the cookie banner is clickable.
        wait.until(ExpectedConditions.elementToBeClickable(popUpBannerAlertPage.cerezBannerKabulEtButonu));

    }

    @When("Kullanici cerez kullanimini kabul eder")
    public void kullanici_cerez_kullanimini_kabul_eder() {

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir. Tespit ettigimiz web ogesine tiklar.
        //It calls the object created at class level with the variable name. Clicks on the web element we have located.
        popUpBannerAlertPage.cerezBannerKabulEtButonu.click();

    }

    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {

        //Cerez kabul edildikten sonra gorulmesi beklenen url ile mevcut olarak bulunulan url'i karsilastirir.
        //Karsilastirma sonucu birbirine esit olursa, test dogrulanmis olur.
        String gorunmesiBeklenenURL = "https://www.a101.com.tr/";
        Assert.assertEquals(gorunmesiBeklenenURL, Driver.getDriver().getCurrentUrl());

        //Daha da emin olmak icin
        //Cerez bannerini kabul ettikten sonra anasayfaya basarili bir sekilde ulasabilip ulasamadigini gormek icin
        //cerez bannerini kabul ettikten sonra anasayfada tiklanabilir olan bir web ogesini tespit edip
        //tiklanabilirligini kontrol ettim.
        //To be even more sure
        //To see if I did successfully reach the homepage after accepting the cookie banner,
        //I identified a web element that was clickable on the homepage after accepting the cookie banner
        //and checked its clickability.
        Assert.assertTrue(popUpBannerAlertPage.aramaButonu.isEnabled());

    }
}