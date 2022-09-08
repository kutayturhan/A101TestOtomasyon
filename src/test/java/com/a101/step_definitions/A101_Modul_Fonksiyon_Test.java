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
    Pop_up_Banner_Alert_Page popUpBannerAlertPage = new Pop_up_Banner_Alert_Page();

    //Selenium kutuphanesinden gelen WebDriverWait classi ile degisken tanimlamasi yaparak nesne olusturur.
    //Web Surucusune belirli kosullari beklemesini soylemek icin kullanilir.
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("Kullanici {string} alan adindaki web sitesine giris yapar")
    public void kullanici_alan_adindaki_web_sitesine_giris_yapar(String domain) {

        //Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
        Driver.getDriver().get(domain);

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir.
        //Web surucusune cerez bannerindaki kabul et butonu tiklanabilir olana kadar beklemesini soyler.
        wait.until(ExpectedConditions.elementToBeClickable(popUpBannerAlertPage.cerezBannerKabulEtButonu));

    }

    @When("Kullanici cerez kullanimini kabul eder")
    public void kullanici_cerez_kullanimini_kabul_eder() {

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir. Tespit ettigimiz web ogesine tiklar.
        popUpBannerAlertPage.cerezBannerKabulEtButonu.click();

    }
    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {

        //Cerez kabul edildikten sonra gorulmesi beklenen url ile mevcut olarak bulunulan url'i karsilastirir.
        //Karsilastirma sonucu birbirine esit olursa, test dogrulanmis olur.
        String gorunmesiBeklenenURL = "https://www.a101.com.tr/";
        Assert.assertEquals(gorunmesiBeklenenURL, Driver.getDriver().getCurrentUrl());

        //Daha da emin olmak icin cerez bannerini kabul ettikten sonra anasayfaya basarili bir sekilde
        //ulasabilip ulasamadigini gormek icin cerez bannerini kabul ettikten sonra anasayfada
        //tiklanabilir olan bir web ogesini tespit edip tiklanabilirligini kontrol ettim.
        Assert.assertTrue(popUpBannerAlertPage.aramaButonu.isEnabled());

    }
}