package com.a101.a101_Mobile.runners;

import com.a101.a101_Mobile.pages.*;
import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Locale;

public class A101_Modul_Fonksiyon_Test_Mobile {

    Anasayfa anasayfa = new Anasayfa();
    Dizalti_Corap_Sayfasi dizalti_corap_sayfasi = new Dizalti_Corap_Sayfasi();
    Siyah_Corap_Urun_Sayfasi siyah_corap_urun_sayfasi = new Siyah_Corap_Urun_Sayfasi();
    Sepetim_Sayfasi sepetim_sayfasi = new Sepetim_Sayfasi();
    Odeme_ve_Uye_Bilgi_Sayfasi odeme_ve_uye_bilgi_sayfasi = new Odeme_ve_Uye_Bilgi_Sayfasi();
    Teslimat_Adresi_Bilgi_Formu teslimat_adresi_bilgi_formu = new Teslimat_Adresi_Bilgi_Formu();

    WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 10);
    Faker faker = new Faker(new Locale("en-US"));


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

        MobileElement kaydetButonu = AndroidAppDriver.getDriver().findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"KAYDET\"))");
        kaydetButonu.getCenter();


        teslimat_adresi_bilgi_formu.tumAdres_VeriGirisKutusu.sendKeys(
                ad + " " + soyad + " \n" +
                        "Caddebostan Mahallesi\n" +
                        "A101 Harca Harca Bitmez Sokak\n" +
                        "No:" + faker.number().numberBetween(1, 101) + "\n" +
                        "Daire: " + faker.number().numberBetween(1, 101) + "\n" +
                        "Posta Kodu:" + postaKodu + " Kadıköy İSTANBUL"
        );

        kaydetButonu.click();


    }

    @When("Kullanici teslimat adresi bilgi formundaki kaydet butonuna dokunur")
    public void kullanici_teslimat_adresi_bilgi_formundaki_kaydet_butonuna_dokunur() {

        teslimat_adresi_bilgi_formu.kaydet_Butonu.click();

    }

    @When("Kullanici kargo firmasi secimini yapar")
    public void kullanici_kargo_firmasi_secimini_yapar() {

        odeme_ve_uye_bilgi_sayfasi.kargoFirmasi_SecimKutucugu.click();

    }

    @When("Kullanici Kaydet ve Devam Et butonuna dokunur")
    public void kullanici_kaydet_ve_devam_et_butonuna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.kaydetVeDevamEt_Butonu.click();

    }

    @When("Kullanici kredi karti verilerini girer")
    public void kullanici_kredi_karti_verilerini_girer() {

        wait.until(ExpectedConditions.elementToBeClickable(odeme_ve_uye_bilgi_sayfasi.krediKarti_CVC_VeriGirisKutucugu));
        odeme_ve_uye_bilgi_sayfasi.krediKarti_adSoyad_VeriGirisKutucugu.sendKeys(faker.name().fullName());
        odeme_ve_uye_bilgi_sayfasi.krediKarti_kartNumarasi_VeriGirisKutucugu.sendKeys("6011000990139424");
        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_AySecimKutucugu.click();
        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_5inciAyVeyaYilSecimKutucugu.click();
        odeme_ve_uye_bilgi_sayfasi.getSonKullanmaTarihi_YilSecimKutucugu.click();
        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_5inciAyVeyaYilSecimKutucugu.click();
        String cvv_No = Integer.toString(faker.number().numberBetween(100, 999));
        odeme_ve_uye_bilgi_sayfasi.krediKarti_CVC_VeriGirisKutucugu.sendKeys(faker.numerify(cvv_No));

    }

    @When("Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucuguna dokunur")
    public void kullanici_on_bilgilendirme_kosullari_ni_ve_uzaktan_satis_sozlemesi_ni_okudum_ve_kabul_ediyorum_kutucuguna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.kosulVeSozlesme_OnaylaKutucugu.click();

    }

    @When("Kullanici Siparisi Tamamla butonuna dokunur")
    public void kullanici_siparisi_tamamla_butonuna_dokunur() {

        odeme_ve_uye_bilgi_sayfasi.siparisiTamamla_Butonu.click();

    }

    @Then("Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana basariyla ulasir")
    public void kullanici_guvenli_odeme_yapmak_icin_dogrulama_kodunu_girecegi_ekrana_basariyla_ulasir() {

    }


}
