package com.a101.hehehe;

import com.a101.pages_yeni.Anasayfa;
import com.a101.pages_yeni.Kadin_Ic_Giyim_Sayfasi;
import com.a101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Modul_Fonksiyon_Test_Step_Definitions {

    Anasayfa anasayfa = new Anasayfa();
    Kadin_Ic_Giyim_Sayfasi kadin_ic_giyim_sayfasi = new Kadin_Ic_Giyim_Sayfasi();

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

    }

    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {

        String gecerliURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(gecerliURL, "https://www.a101.com.tr/");

    }

    @When("Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir")
    public void kullanici_mouse_imlecini_giyim_ve_aksesuar_modulu_uzerinde_bekletir() {

        System.out.println(anasayfa.kadinIcGiyim_Kategorisi.isDisplayed());

        try {
            actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
        } catch (ElementNotInteractableException exception) {
            try {
                if (anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe.isDisplayed()) {
                    actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
                    actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
                }
            } catch (NoSuchElementException exception_2) {
                exception_2.printStackTrace();
            //    actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).
            //            click(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
            //    actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();

            }


        }

    }

    @When("Kullanici Kadin Ic Giyim kategorisine tiklar")
    public void kullanici_kadin_ic_giyim_kategorisine_tiklar() {


//CATCH BLOK EKLEDİM CÜNKÜ BAZEN GİYİM VE AKSESUAR ŞEYSİNİ AÇMIYORDU YAU
        try {
            anasayfa.kadinIcGiyim_Kategorisi.click();
        } catch (ElementNotInteractableException exception) {
            try {
                if (anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe.isDisplayed()) {
                    anasayfa.alternatifArayuz_KadinIcGiyim_Kategorisi.click();
                }
            } catch (NoSuchElementException exception_2) {
                exception_2.printStackTrace();
            }

        }


    }

    @When("Kullanici Dizalti Corap kategorisine tiklar")
    public void kullanici_dizalti_corap_kategorisine_tiklar() {


        try {
            kadin_ic_giyim_sayfasi.dizaltiCorap_AltKategorisi.click();
        } catch (ElementNotInteractableException exception) {
            try {
                if (kadin_ic_giyim_sayfasi.alternatifArayuz_DizaltiCorap_AltKategorisi.isDisplayed()) {
                    kadin_ic_giyim_sayfasi.alternatifArayuz_DizaltiCorap_AltKategorisi.click();
                }
            } catch (NoSuchElementException exception_2) {
                exception_2.printStackTrace();
            }
        }

    }

    @Then("Kullanici Dizalti Corap modellerini goruntuler")
    public void kullanici_dizalti_corap_modellerini_goruntuler() {

        //BASITCE URL CONTAINS YAZIP GEÇEBİLİRDİM AMA YAPMADIM ONU AÇIKLA İŞTE

        try {
            //Dizalti Corap kategorisi secildikten sonraki URL'nin icerigini dogrular
            String gecerliURL = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(gecerliURL.contains("dizalti-corap"));
            Assert.assertTrue(kadin_ic_giyim_sayfasi.sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed());
        } catch (ElementNotInteractableException exception) {
            try {
                if (kadin_ic_giyim_sayfasi.alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed()) {
                    String gecerliURL = Driver.getDriver().getCurrentUrl();
                    Assert.assertTrue(gecerliURL.contains("dizalti-corap"));
                    Assert.assertTrue(kadin_ic_giyim_sayfasi.alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed());
                }
            } catch (NoSuchElementException exception_2) {
                exception_2.printStackTrace();
            }
        }

    }

    @When("Kullanici siyah renk isaret kutucuguna tiklar")
    public void kullanici_siyah_renk_isaret_kutucuguna_tiklar() {
        //bir sonraki adimda assertion error a neden oluyordu ondan sectigimden kesinlikle emin olmak istedim sonraki adim calissin diye


        try {
            kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.click();
        } catch (ElementClickInterceptedException exception) {
            try {
                if (!kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected()) {
                    javascriptExecutor.executeScript("arguments[0].click()", kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu);
                }
            } catch (ElementClickInterceptedException exception_2) {
                try {
                    if (!kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected()) {
                        actions.moveToElement(kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu).click().perform();
                    }
                } catch (ElementClickInterceptedException exception_3) {
                    exception_3.printStackTrace();
                }
            }
        }

    }

    @Then("Acilan urunun siyah renk oldugu dogrulanir")
    public void acilan_urunun_siyah_renk_oldugu_dogrulanir() {


        // Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected());
        Assert.assertTrue(kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected());
        //   } catch (AssertionError e){
        //       try {
        //           kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu.click();
        //       } catch (ElementClickInterceptedException exception) {
        //         javascriptExecutor.executeScript("arguments[0].click();", kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu);
        //       if (!(kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected())) {
        //         actions.moveToElement(kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu).click(kadinIcGiyimSayfasi.siyahRenk_Checkbox_IsaretKutucugu).perform();
        //   }
        //  }
        //  }


    }


}
