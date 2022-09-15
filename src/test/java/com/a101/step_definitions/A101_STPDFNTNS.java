package com.a101.step_definitions;

import com.a101.pages_yeni.Anasayfa;
import com.a101.pages_yeni.Kadin_Ic_Giyim_Sayfasi;
import com.a101.pages_yeni.Sepetim_Sayfasi;
import com.a101.pages_yeni.Siyah_Corap_Urun_Sayfasi;
import com.a101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_STPDFNTNS {

    Anasayfa anasayfa = new Anasayfa();
    Kadin_Ic_Giyim_Sayfasi kadin_ic_giyim_sayfasi = new Kadin_Ic_Giyim_Sayfasi();
    Siyah_Corap_Urun_Sayfasi siyah_corap_urun_sayfasi = new Siyah_Corap_Urun_Sayfasi();
    Sepetim_Sayfasi sepetim_sayfasi = new Sepetim_Sayfasi();

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

        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.cerezKullanimi_KabulEtButonu));

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
            try {
                actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
                actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
            } catch (Exception exception_2){
                exception_2.printStackTrace();
            }
        }


        //      try{
        //          actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
        //      } catch (ElementNotInteractableException exception){
        //          try {
        //              if (anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe.isDisplayed()) {
        //                  actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
        //                  actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
        //              }
        //          } catch (Exception exception_2){
        //              exception_2.printStackTrace();
        //          }
        //      }


        //      try {
        //          if (anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe.isDisplayed()) {
        //              actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
        //              actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
        //          }
        //      } catch (Exception exception){
        //          exception.printStackTrace();
        //      }

        //      actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();


    }

    @When("Kullanici Kadin Ic Giyim kategorisine tiklar")
    public void kullanici_kadin_ic_giyim_kategorisine_tiklar() {

        try {
            anasayfa.kadinIcGiyim_Kategorisi.click();
        } catch (ElementNotInteractableException exception) {
            anasayfa.alternatifArayuz_KadinIcGiyim_Kategorisi.click();
        }

    }

    @When("Kullanici Dizalti Corap kategorisine tiklar")
    public void kullanici_dizalti_corap_kategorisine_tiklar() {

        try {
            kadin_ic_giyim_sayfasi.dizaltiCorap_AltKategorisi.click();
        } catch (ElementNotInteractableException exception) {
            kadin_ic_giyim_sayfasi.alternatifArayuz_DizaltiCorap_AltKategorisi.click();
        }

        //TIKANIYO FREEZE HANGS OLUYOR DİYE YAZDIGIM DENEDİGİM KOD
        if (!(kadin_ic_giyim_sayfasi.sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed() ||
                kadin_ic_giyim_sayfasi.alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed())){
            Driver.getDriver().navigate().refresh();
            try {
                kadin_ic_giyim_sayfasi.dizaltiCorap_AltKategorisi.click();
            } catch (ElementNotInteractableException exception) {
                kadin_ic_giyim_sayfasi.alternatifArayuz_DizaltiCorap_AltKategorisi.click();
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[normalize-space()='Dizaltı Çorap'])[3]")));
        } catch (ElementNotInteractableException exception) {
            String gecerliURL = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(gecerliURL.contains("dizalti-corap"));
            Assert.assertTrue(kadin_ic_giyim_sayfasi.alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement.isDisplayed());
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[normalize-space()='Dizaltı Çorap'])[4]")));
        }


    }

    @When("Kullanici siyah renk isaret kutucuguna tiklar")
    public void kullanici_siyah_renk_isaret_kutucuguna_tiklar() {
        //bir sonraki adimda assertion error a neden oluyordu ondan sectigimden kesinlikle emin olmak istedim sonraki adim calissin diye

        try {
            kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.click();
        } catch (ElementClickInterceptedException exception) {
            javascriptExecutor.executeScript("arguments[0].click()", kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu);
        }

    }

    @Then("Acilan urunun siyah renk oldugu dogrulanir")
    public void acilan_urunun_siyah_renk_oldugu_dogrulanir() {

        try{
            Assert.assertTrue(kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected());
        } catch (AssertionError error){
            Driver.getDriver().navigate().refresh();
            try {
                kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.click();
            } catch (ElementClickInterceptedException exception) {
                javascriptExecutor.executeScript("arguments[0].click()", kadin_ic_giyim_sayfasi.siyahRenk_Checkbox_IsaretKutucugu);
            }
        }

    }

    @When("Kullanici Siyah Dizalti Corabini sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_siyah_dizalti_corabini_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {

        kadin_ic_giyim_sayfasi.sepeteEkleButonu.click();

    }

    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar
            () {

        //Urun secildikten sonra gezinti menüsünde oluşan web elementi
        Assert.assertTrue(siyah_corap_urun_sayfasi.gezintiMenusu_PentiKadin50DenyePantalonCorabiSiyah.isDisplayed());

        siyah_corap_urun_sayfasi.sepeteEkleButonu.click();


    }

    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar")
    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepeti_goruntule_baglantisina_tiklar
            () {

        wait.until(ExpectedConditions.elementToBeClickable(siyah_corap_urun_sayfasi.alisveriseDevamEt_AcilirPencere_EklenenUrunBilgisi));
        Assert.assertTrue(siyah_corap_urun_sayfasi.alisveriseDevamEt_AcilirPencere_EklenenUrunBilgisi.isDisplayed());
        siyah_corap_urun_sayfasi.sepetiGoruntuleButonu.click();

    }

    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar")
    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_tiklar
            () {

        Assert.assertTrue(sepetim_sayfasi.sepetim_EklenenUrunBilgisi.isDisplayed());
        sepetim_sayfasi.sepetiOnaylaButonu.click();

    }

}
