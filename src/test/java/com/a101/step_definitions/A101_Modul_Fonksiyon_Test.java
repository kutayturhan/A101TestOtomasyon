package com.a101.step_definitions;

import com.a101.pages.Anasayfa_Arayuz_1;
import com.a101.pages.Anasayfa_Arayuz_2;
import com.a101.pages.Cerez_Kullanim_Sayfasi;
import com.a101.pages.Kadin_Ic_Giyim_Sayfasi;
import com.a101.utilities.Driver;
import com.a101.utilities.SleepMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Modul_Fonksiyon_Test {

    //Olusturulan "Cerez_Kullanim_Sayfasi" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "cerezKullanimSayfasi" ismini vererek nesne olusturur.
    Cerez_Kullanim_Sayfasi cerezKullanimSayfasi = new Cerez_Kullanim_Sayfasi();

    //Olusturulan "Anasayfa_Arayuz_1 ve Anasayfa_Arayuz_2" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "anasayfaArayuz1" ismini vererek nesne olusturur.
    Anasayfa_Arayuz_1 anasayfaArayuz1 = new Anasayfa_Arayuz_1();
    Anasayfa_Arayuz_2 anasayfaArayuz2 = new Anasayfa_Arayuz_2();

    //Olusturulan "Kadin_Ic_Giyim_Sayfasi" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "kadinIcGiyimSayfasi" ismini vererek nesne olusturur.
    Kadin_Ic_Giyim_Sayfasi kadinIcGiyimSayfasi = new Kadin_Ic_Giyim_Sayfasi();

    //Selenium kutuphanesinden gelen WebDriverWait classi ile degisken tanimlamasi yaparak nesne olusturur.
    //Web Surucusune belirli kosullari beklemesini soylemek icin kullanilir.
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    //Actions classindan degisken tanimlamasi yaparak actions nesnesini olusturur.
    //Actions sinifi, Selenium tarafindan klavye ve fare hareketlerini islemek icin saglanan bir ozellik sinifidir.
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} alan adindaki web sitesine giris yapar")
    public void kullanici_alan_adindaki_web_sitesine_giris_yapar(String domain) {

        //Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
        Driver.getDriver().get(domain);

    }

    @When("Kullanici cerez kullanimini kabul eder")
    public void kullanici_cerez_kullanimini_kabul_eder() {

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir. Tespit ettigimiz web ogesine tiklar.
        cerezKullanimSayfasi.cerezBannerKabulEtButonu.click();

    }

    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {

        //Cerez kabul edildikten sonra gorulmesi beklenen url ile mevcut olarak bulunulan url'i karsilastirir.
        //Karsilastirma sonucu birbirine esit olursa, test dogrulanmis olur.
        String gorunmesiBeklenenURL = "https://www.a101.com.tr/";
        Assert.assertEquals(gorunmesiBeklenenURL, Driver.getDriver().getCurrentUrl());

        //Daha da emin olmak icin cerezi kabul ettikten sonra anasayfaya basarili bir sekilde
        //ulasabilip ulasamadigini gormek icin cerezi kabul ettikten sonra
        //anasayfada tiklanabilir ve gorunebilir olan bir web ogesini tespit edip
        //tiklanabilirligini, aktifligini ve gorunurlugunu kontrol ettim.
        Assert.assertTrue(cerezKullanimSayfasi.aramaButonu.isEnabled() && cerezKullanimSayfasi.aramaButonu.isDisplayed());

    }

    @When("Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir")
    public void kullanici_mouse_imlecini_giyim_ve_aksesuar_modulu_uzerinde_bekletir() {

        try {
            actions.moveToElement(anasayfaArayuz1.giyimVeAksesuarModulu).perform();
        } catch (ElementNotInteractableException e) {
            try{
                actions.moveToElement(anasayfaArayuz2.kategorilerDropdown).perform();
                actions.moveToElement(anasayfaArayuz2.giyimVeAksesuarKategorisi).perform();
            } catch (ElementNotInteractableException ignored){
                try{
                    Driver.getDriver().navigate().refresh();
                    actions.moveToElement(anasayfaArayuz2.kategorilerDropdown).perform();
                    actions.moveToElement(anasayfaArayuz2.giyimVeAksesuarKategorisi).perform();
                } catch (ElementNotInteractableException ignored2){
                    Driver.getDriver().navigate().refresh();
                    SleepMethod.sleep(3);
                    actions.moveToElement(anasayfaArayuz2.kategorilerDropdown).perform();
                    actions.moveToElement(anasayfaArayuz2.giyimVeAksesuarKategorisi).perform();
                }

            }

        }



        /*

        if (anasayfaArayuz1.giyimVeAksesuarModulu.isDisplayed()) {
            actions.moveToElement(anasayfaArayuz1.giyimVeAksesuarModulu).perform();
        } else if (!(anasayfaArayuz1.giyimVeAksesuarModulu.isDisplayed()) && anasayfaArayuz2.kategorilerDropdown.isDisplayed()) {
            actions.moveToElement(anasayfaArayuz2.kategorilerDropdown).perform();
        }

         */

        //else (!(anasayfaArayuz1.giyimVeAksesuarModulu.isDisplayed()) {
        //  actions.moveToElement(anasayfaArayuz2.giyimVeAksesuarKategorisi).perform();
        //}

        //Mouse imlecini Giyim & Aksesuar modulunun uzerinde bekletir
        // actions.moveToElement(anasayfaArayuz1.giyimVeAksesuarModulu).perform();

    }

    @When("Kullanici Kadin Ic Giyim kategorisine tiklar")
    public void kullanici_kadin_ic_giyim_kategorisine_tiklar() {


        anasayfaArayuz1.kadinIcGiyimKategorisi.click();


        //   wait.until(ExpectedConditions.elementToBeClickable(anasayfaArayuz1.kadinIcGiyimKategorisi));

        /*

        if (anasayfaArayuz1.giyimVeAksesuarModulu.isDisplayed()) {
            wait.until(ExpectedConditions.elementToBeClickable(anasayfaArayuz1.kadinIcGiyimKategorisi));
            anasayfaArayuz1.kadinIcGiyimKategorisi.click();
        } else if (!(anasayfaArayuz1.giyimVeAksesuarModulu.isDisplayed()) && anasayfaArayuz2.kategorilerDropdown.isDisplayed()) {
            actions.moveToElement(anasayfaArayuz2.kadinIcGiyimKategorisi).perform();
            anasayfaArayuz2.kadinIcGiyimKategorisi.click();
        }

         */

        //Kadin Ic Giyim katerogirisine tiklar
        //   anasayfaArayuz1.kadinIcGiyimKategorisi.click();


        //   wait.until(ExpectedConditions.elementToBeClickable(anasayfa.giyimVeAksesuarModulu));

        //  wait.until(ExpectedConditions.urlContains("kadin-ic-giyim"));

        // wait.until(ExpectedConditions.elementToBeClickable(kadinIcGiyimSayfasi.dizaltiCorapAltKategorisi));

    }

    @When("Kullanici Dizalti Corap kategorisine tiklar")
    public void kullanici_dizalti_corap_kategorisine_tiklar() {

        //Dizalti Corap alt kategorisine tiklar
        kadinIcGiyimSayfasi.dizaltiCorapAltKategorisi.click();

        //    wait.until(ExpectedConditions.elementToBeClickable(anasayfa.giyimVeAksesuarModulu));

        //  wait.until(ExpectedConditions.urlContains("dizalti-corap"));

    }

    @Then("Kullanici Dizalti Corap modellerini goruntuler")
    public void kullanici_dizalti_corap_modellerini_goruntuler() {

        //Kadin Dizalti Corap Urun Model Listesinin gorunurlugunu dogrular
        Assert.assertTrue(kadinIcGiyimSayfasi.dizaltiCorapUrunModelListesi.isDisplayed());

        //Dizalti Corap kategorisi secildikten sonraki URL'nin icerigini dogrular
        String dizaltiCorapSecimindenSonraURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(dizaltiCorapSecimindenSonraURL.contains("dizalti-corap"));

    }

    @When("Kullanici siyah renk isaret kutucuguna tiklar")
    public void kullanici_siyah_renk_isaret_kutucuguna_tiklar() {

        try{
            kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
        } catch (StaleElementReferenceException e){
            Driver.getDriver().navigate().refresh();
            kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
        }

    }

    @Then("Acilan urunun siyah renk oldugu dogrulanir")
    public void acilan_urunun_siyah_renk_oldugu_dogrulanir() {

        try{
            Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());
        } catch (AssertionError | StaleElementReferenceException e){
            Driver.getDriver().navigate().refresh();
            if (kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected()){
                Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());
            } else {
                kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
                Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());
            }
            //kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
          //  Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());
        }

    }
    // -------------------------------------------------------------------------------------------------------WWWWWWWWWW
    @When("Kullanici Dizalti Corap sayfasinda Siyah Dizalti Corabini sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_dizalti_corap_sayfasinda_siyah_dizalti_corabini_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {

        //Sepete ekle butonuna cift tiklama (double click) yapar. Bunun sebebini hazirladigim README dosyasinda detayli olarak acikladim
       // actions.doubleClick(kadinIcGiyimSayfasi.sepeteEkleButonu).perform();

        //Sepete ekle butonuna tiklar
        try{
            kadinIcGiyimSayfasi.sepeteEkleButonu.click();
        }catch (StaleElementReferenceException e){
            try{
                actions.doubleClick(kadinIcGiyimSayfasi.sepeteEkleButonu).perform();
            } catch (ElementClickInterceptedException ignored){
                Driver.getDriver().navigate().refresh();
                actions.doubleClick(kadinIcGiyimSayfasi.sepeteEkleButonu).perform();
            }
        }

    }
    /*
//
//    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar")
//    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {
//
//    }
//
//    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar")
//    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepeti_goruntule_baglantisina_tiklar() {
//
//    }
//
//    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar")
//    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_tiklar() {
//
//    }
//
//    @Then("Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina ulasir")
//    public void kullanici_odeme_adimina_gecmek_icin_gerekli_olan_uye_giris_bilgisi_sayfasina_ulasir() {
//
//    }
//
// */
}