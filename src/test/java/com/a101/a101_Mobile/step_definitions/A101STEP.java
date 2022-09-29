package com.a101.a101_Mobile.step_definitions;

import com.a101.a101_Mobile.pages.*;
import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import com.a101.a101_WebBrowser.utilities.SleepMethod;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class A101STEP {

    Anasayfa anasayfa = new Anasayfa();
    Dizalti_Corap_Sayfasi dizalti_corap_sayfasi = new Dizalti_Corap_Sayfasi();
    Siyah_Corap_Urun_Sayfasi siyah_corap_urun_sayfasi = new Siyah_Corap_Urun_Sayfasi();
    Sepetim_Sayfasi sepetim_sayfasi = new Sepetim_Sayfasi();
    Odeme_ve_Uye_Bilgi_Sayfasi odeme_ve_uye_bilgi_sayfasi = new Odeme_ve_Uye_Bilgi_Sayfasi();
    Teslimat_Adresi_Bilgi_Formu teslimat_adresi_bilgi_formu = new Teslimat_Adresi_Bilgi_Formu();

    WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 60);
    Faker faker = new Faker(new Locale("en-US"));

    @BeforeStep
    @AfterStep
    public static void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(),1);
            wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        } catch (Exception exception) {
            //Exception handling
        }
    }


    @When("Kullanici A101 Mobil uygulamasina giris yapar")
    public void kullanici_a101_mobil_uygulamasina_giris_yapar() {

        //AndroidAppDriver.getDriver().launchApp();

    }

    @When("Kullanici Yeni Guncelleme Mevcut uyarisini iptal eder")
    public void kullanici_yeni_guncelleme_mevcut_uyarisini_iptal_eder() {

        // wait.until(ExpectedConditions.alertIsPresent()).dismiss();
    }


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

        wait.until(ExpectedConditions.visibilityOf(dizalti_corap_sayfasi.ilkUrun_SepeteEkleButonu));
        String gecerliSayfaBaslik = dizalti_corap_sayfasi.dizaltiCorap_Baslik.getText();
        Assertions.assertEquals("Dizaltı Çorap", gecerliSayfaBaslik);
    }

    @When("Kullanici filtreleme bolumune dokunur")
    public void kullanici_filtreleme_bolumune_dokunur() {

        dizalti_corap_sayfasi.filtrele_AcilirSecenekler.click();

    }

    @When("Kullanici siyah renk isaret kutucugunu secer ve siyah Dizalti Corabi urunlerine ulasir")
    public void kullanici_siyah_renk_isaret_kutucugunu_secer_ve_siyah_dizalti_corabi_urunlerine_ulasir() {

        dizalti_corap_sayfasi.siyahRenk_Filtrele.click();


    }

    @When("Kullanici Siyah Dizalti Corabi sepete eklemek icin sepete ekle butonuna dokunur")
    public void kullanici_siyah_dizalti_corabi_sepete_eklemek_icin_sepete_ekle_butonuna_dokunur() {

        SleepMethod.sleep(3);
        dizalti_corap_sayfasi.ilkUrun_SepeteEkleButonu.click();
    }

    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna dokunur")
    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_dokunur() {

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//*[@text='Renk']")));
        siyah_corap_urun_sayfasi.sepeteEkle_Butonu.click();

    }

    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepete git butonuna dokunur")
    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepete_git_butonuna_dokunur() {

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//*[@text='SEPETE GİT']")));
        String urunBilgiYazisi = siyah_corap_urun_sayfasi.urunSepeteEklendi_UrunBilgisi.getText();
        Assertions.assertTrue(urunBilgiYazisi.contains("Siyah") && urunBilgiYazisi.contains("Çorab") && urunBilgiYazisi.contains("sepetinize eklendi"));
        siyah_corap_urun_sayfasi.urunSepetineGit_Butonu.click();
    }

    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna dokunur")
    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_dokunur() {

        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//*[@text='Alışverişe devam et']")));
        sepetim_sayfasi.sepetiOnayla_Butonu.click();

    }

    @Then("Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina basariyla ulasir")
    public void kullanici_odeme_adimina_gecmek_icin_gerekli_olan_uye_giris_bilgisi_sayfasina_basariyla_ulasir() {

        Assertions.assertTrue(odeme_ve_uye_bilgi_sayfasi.girisYap_BaslikYazisi.isDisplayed());
        Assertions.assertTrue(odeme_ve_uye_bilgi_sayfasi.uyeOlmadanDevamEt_Butonu.isDisplayed());
    }

    @When("Kullanici UYE OLMADAN DEVAM ET butonuna dokunur")
    public void kullanici_uye_olmadan_devam_et_butonuna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.uyeOlmadanDevamEt_Butonu.click();

    }

    @When("Kullanici E mail adresi verisini girer")
    public void kullanici_e_mail_adresi_verisini_girer() {

        odeme_ve_uye_bilgi_sayfasi.eposta_VeriGirisKutucugu.sendKeys(faker.internet().emailAddress());

    }

    @When("Kullanici aydinlatma metnini onaylar")
    public void kullanici_aydinlatma_metnini_onaylar() {

        odeme_ve_uye_bilgi_sayfasi.aydinlatmaMetni_KabulEtIsaretKutucugu.click();

    }

    @When("Kullanici GONDER butonuna dokunur")
    public void kullanici_gonder_butonuna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.gonder_Butonu.click();


    }

    @When("Kullanici cerez kullanimini kabul et butonuna dokunur")
    public void kullanici_cerez_kullanimini_kabul_et_butonuna_dokunur() {

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//*[@text='Kabul Et']")));
        odeme_ve_uye_bilgi_sayfasi.cerezKullanimi_KabulEt_Butonu.click();


    }

    @When("Kullanici yeni adres olustur butonuna dokunur")
    public void kullanici_yeni_adres_olustur_butonuna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.yeniAdresOlustur_Butonu.click();


    }

    @When("Kullanici kisi ve teslimat adresi bilgilerini adres guncelleme formuna girer")
    public void kullanici_kisi_ve_teslimat_adresi_bilgilerini_adres_guncelleme_formuna_girer() {

        String postaKodu = faker.address().zipCode();
        String ad = faker.name().firstName();
        String soyad = faker.name().lastName();

        teslimat_adresi_bilgi_formu.evAdresim_VeriGirisi.sendKeys("Ev Adresim");
        teslimat_adresi_bilgi_formu.ad_veriGirisi.sendKeys(ad);
        teslimat_adresi_bilgi_formu.soyad_VeriGirisi.sendKeys(soyad);
        teslimat_adresi_bilgi_formu.cepTelefonu_VeriGirisi.sendKeys(faker.numerify("554#######"));

        teslimat_adresi_bilgi_formu.il_AcilirSecimKutucugu.click();
        Ui_Scroll.scrollToElementAndClick("İSTANBUL");

        teslimat_adresi_bilgi_formu.ilce_AcilirSecimKutucugu.click();
        Ui_Scroll.scrollToElementAndClick("KADIKÖY");

        teslimat_adresi_bilgi_formu.mahalle_AcilirSecimKutucugu.click();
        Ui_Scroll.scrollToElementAndClick("CADDEBOSTAN MAH");

        teslimat_adresi_bilgi_formu.tumAdres_VeriGirisKutusu.sendKeys(
                ad + " " + soyad + " \n" +
                        "Caddebostan Mahallesi\n" +
                        "A101 Harca Harca Bitmez Sokak\n" +
                        "No:" + faker.number().numberBetween(1, 101) + "\n" +
                        "Daire: " + faker.number().numberBetween(1, 101) + "\n" +
                        "Posta Kodu:" + postaKodu + " Kadıköy İSTANBUL"
        );


    }

    @When("Kullanici teslimat adresi bilgi formundaki kaydet butonuna dokunur")
    public void kullanici_teslimat_adresi_bilgi_formundaki_kaydet_butonuna_dokunur() {

        int mahalleSecim_X = teslimat_adresi_bilgi_formu.mahalle_AcilirSecimKutucugu.getLocation().getX();
        int mahalleSecim_Y = teslimat_adresi_bilgi_formu.mahalle_AcilirSecimKutucugu.getLocation().getY();

        int kaydet_X = teslimat_adresi_bilgi_formu.kaydet_Butonu.getLocation().getX();
        int kaydet_Y = teslimat_adresi_bilgi_formu.kaydet_Butonu.getLocation().getY();

        ScrollDown.scrollDown();


    }


}


