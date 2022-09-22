package com.a101.a101_Mobile.step_definitions;

import com.a101.a101_Mobile.pages.*;
import com.a101.a101_Mobile.utilities.MobileAppDriver;
import com.a101.a101_WebBrowser.utilities.SleepMethod;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Modul_Fonksiyon_Test_Mobile {

    Anasayfa anasayfa = new Anasayfa();
    Dizalti_Corap_Sayfasi dizalti_corap_sayfasi = new Dizalti_Corap_Sayfasi();
    Siyah_Corap_Urun_Sayfasi siyah_corap_urun_sayfasi = new Siyah_Corap_Urun_Sayfasi();
    Sepetim_Sayfasi sepetim_sayfasi = new Sepetim_Sayfasi();
    Odeme_ve_Uye_Bilgi_Sayfasi odeme_ve_uye_bilgi_sayfasi = new Odeme_ve_Uye_Bilgi_Sayfasi();

    WebDriverWait wait = new WebDriverWait(MobileAppDriver.getDriver(), 10);
    Actions actions = new Actions(MobileAppDriver.getDriver());

    @When("Kullanici kategoriler acilir menusunu secer")
    public void kullanici_kategoriler_acilir_menusunu_secer() {

        anasayfa.kategoriler_AcilirMenu.click();
    }

    @When("Kullanici Giyim ve Aksesuar kategorisini secer")
    public void kullanici_giyim_ve_aksesuar_kategorisini_secer() {

        anasayfa.giyimVeAksesuar_Kategorisi.click();
    }

    @When("Kullanici Kadin Ic Giyim kategorisini secer")
    public void kullanici_kadin_ic_giyim_kategorisini_secer() {

        anasayfa.kadinIcGiyim_Kategorisi.click();
    }

    @When("Kullanici Dizalti Corap kategorisini secer")
    public void kullanici_dizalti_corap_kategorisini_secer() {

        anasayfa.dizaltiCorap_Kategorisi.click();
    }

    @Then("Kullanici mobil uygulamada Dizalti Corap modellerini goruntuler")
    public void kullanici_mobil_uygulamada_dizalti_corap_modellerini_goruntuler() {

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//*[@text='Dizaltı Çorap']")));
        Assertions.assertTrue(anasayfa.dizaltiCorap_Kategorisi.isDisplayed());
    }

    @When("Kullanici filtreleme bolumune dokunur")
    public void kullanici_filtreleme_bolumune_dokunur() {

        dizalti_corap_sayfasi.filtrele.click();

    }

    @When("Kullanici siyah renk isaret kutucugunu secer ve siyah Dizalti Corabi urunlerine ulasir")
    public void kullanici_siyah_renk_isaret_kutucugunu_secer_ve_siyah_dizalti_corabi_urunlerine_ulasir() {

        dizalti_corap_sayfasi.siyahRenk_Filtrele.click();

    }

    @When("Kullanici Siyah Dizalti Corabi sepete eklemek icin sepete ekle butonuna dokunur")
    public void kullanici_siyah_dizalti_corabi_sepete_eklemek_icin_sepete_ekle_butonuna_dokunur() {

        wait.until(ExpectedConditions.elementToBeClickable(dizalti_corap_sayfasi.ilkUrun_SepeteEkleButonu));
        dizalti_corap_sayfasi.ilkUrun_SepeteEkleButonu.click();
    }
    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna dokunur")
    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_dokunur() {

        //wait.until(ExpectedConditions.elementToBeClickable(siyah_corap_urun_sayfasi.sepeteEkle_Butonu));

        siyah_corap_urun_sayfasi.sepeteEkle_Butonu.click();


    }
    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepete git butonuna dokunur")
    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepete_git_butonuna_dokunur() {


        String urunBilgiYazisi = siyah_corap_urun_sayfasi.urunSepeteEklendi_UrunBilgisi.getText();
        Assertions.assertTrue(urunBilgiYazisi.contains("Siyah") && urunBilgiYazisi.contains("Çorab") && urunBilgiYazisi.contains("sepetinize eklendi"));
        siyah_corap_urun_sayfasi.urunSepetineGit_Butonu.click();
    }


    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna dokunur")
    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_dokunur() {

        wait.until(ExpectedConditions.elementToBeClickable(sepetim_sayfasi.sepetiOnayla_Butonu));
        sepetim_sayfasi.sepetiOnayla_Butonu.click();

    }
    @Then("Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina basariyla ulasir")
    public void kullanici_odeme_adimina_gecmek_icin_gerekli_olan_uye_giris_bilgisi_sayfasina_basariyla_ulasir() {

        Assertions.assertTrue(odeme_ve_uye_bilgi_sayfasi.girisYap_Yazisi.isDisplayed());
        Assertions.assertTrue(odeme_ve_uye_bilgi_sayfasi.uyeOlmadanDevamEt_Butonu.isDisplayed());
    }

}
