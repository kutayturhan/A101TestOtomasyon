package com.a101.step_definitions;

import com.a101.pages_yeni.Anasayfa;
import com.a101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_STPDFNTNS {

    Anasayfa anasayfa = new Anasayfa();

    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("Kullanici {string} alan adindaki web sitesine giris yapar")
    public void kullanici_alan_adindaki_web_sitesine_giris_yapar(String domain) {

        //Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
        Driver.getDriver().get(domain);


    }

    @When("Kullanici cerez kullanimini kabul eder")
    public void kullanici_cerez_kullanimini_kabul_eder() {

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir. Tespit ettigimiz web ogesine tiklar.
        anasayfa.cerezKullanimi_KabulEtButonu.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@style='display: none; opacity: 0;']")));

    }

    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {


        String gecerliURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(gecerliURL, "https://www.a101.com.tr/");

    }

    @When("Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir")
    public void kullanici_mouse_imlecini_giyim_ve_aksesuar_modulu_uzerinde_bekletir() {

        try {
            actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
        } catch (ElementNotInteractableException exception) {
            actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe)
                    .click(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
            actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
        }

//        try {
//            actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
//        } catch (ElementNotInteractableException exception) {
//            try {
//                if (anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe.isDisplayed()) {
//                    actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
//                    actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
//                }
//            } catch (Exception generalException) {
//                generalException.printStackTrace();
//            }
//        }
//
//
//    }

    }

}
