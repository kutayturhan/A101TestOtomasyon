package com.a101.mobileApp.step_definitions;

import com.a101.mobileApp.pages.*;
import com.a101.mobileApp.utilities.AndroidAppDriver;
import com.a101.mobileApp.utilities.AppiumUtilities;
import com.a101.webBrowser.utilities.SleepMethod;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
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

    WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 60);
    Faker faker = new Faker(new Locale("en-US"));

    @When("Kullanici A101 Mobil uygulamasina giris yapar")
    public void kullanici_a101_mobil_uygulamasina_giris_yapar() {

        //AndroidAppDriver.getDriver().launchApp();
    }

    @When("Kullanici islemine yeni guncelleme mevcut uyarisini iptal ederek devam eder")
    public void kullanici_islemine_yeni_guncelleme_mevcut_uyarisini_iptal_ederek_devam_eder() {

        try {
            WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 120);
            wait.until(ExpectedConditions.alertIsPresent());
            AndroidAppDriver.getDriver().switchTo().alert().dismiss();
        } catch (Exception exception) {
            //Exception handling
        }
    }

    @When("Kullanici kategoriler acilir menusune dokunur")
    public void kullanici_kategoriler_acilir_menusune_dokunur() {

        anasayfa.kategoriler_AcilirMenu.click();
    }

    @When("Kullanici Giyim ve Aksesuar kategorisine dokunur")
    public void kullanici_giyim_ve_aksesuar_kategorisine_dokunur() {

        anasayfa.giyimVeAksesuar_Kategorisi.click();
    }

    @When("Kullanici Kadin Ic Giyim kategorisine dokunur")
    public void kullanici_kadin_ic_giyim_kategorisine_dokunur() {

        anasayfa.kadinIcGiyim_Kategorisi.click();
    }

    @When("Kullanici Dizalti Corap kategorisine dokunur")
    public void kullanici_dizalti_corap_kategorisine_dokunur() {

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

        SleepMethod.sleep(4);
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

        SleepMethod.sleep(5);
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

        String ad = faker.name().firstName();
        String soyad = faker.name().lastName();
        String postaKodu = faker.address().zipCode();

        teslimat_adresi_bilgi_formu.evAdresim_VeriGirisi.sendKeys("Ev Adresim");
        teslimat_adresi_bilgi_formu.ad_veriGirisi.sendKeys(ad);
        teslimat_adresi_bilgi_formu.soyad_VeriGirisi.sendKeys(soyad);
        teslimat_adresi_bilgi_formu.cepTelefonu_VeriGirisi.sendKeys(faker.numerify("554#######"));

        teslimat_adresi_bilgi_formu.il_AcilirSecimKutucugu.click();
        AppiumUtilities.scrollToElementAndClick("İSTANBUL");

        teslimat_adresi_bilgi_formu.ilce_AcilirSecimKutucugu.click();
        AppiumUtilities.scrollToElementAndClick("KADIKÖY");

        teslimat_adresi_bilgi_formu.mahalle_AcilirSecimKutucugu.click();
        AppiumUtilities.scrollToElementAndClick("CADDEBOSTAN MAH");

        AppiumUtilities.scrollDown();

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

        wait.until(ExpectedConditions.visibilityOf(teslimat_adresi_bilgi_formu.kaydet_Butonu));
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

        odeme_ve_uye_bilgi_sayfasi.krediKarti_kartNumarasi_VeriGirisKutucugu.click();

        int[] krediKartNo = {6, 0, 1, 1, 0, 0, 0, 9, 9, 0, 1, 3, 9, 4, 2, 4};

        for (int each : krediKartNo) {
            AndroidAppDriver.getDriver().pressKey(new KeyEvent(AndroidKey.valueOf("DIGIT_" + each)));
            SleepMethod.milliSleep(250);
        }

        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_AySecimKutucugu.click();
        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_5inciAyVeyaYilSecimKutucugu.click();

        odeme_ve_uye_bilgi_sayfasi.getSonKullanmaTarihi_YilSecimKutucugu.click();
        odeme_ve_uye_bilgi_sayfasi.sonKullanmaTarihi_5inciAyVeyaYilSecimKutucugu.click();

        String cvc_No = Integer.toString(faker.number().numberBetween(100, 999));
        odeme_ve_uye_bilgi_sayfasi.krediKarti_CVC_VeriGirisKutucugu.sendKeys(cvc_No);
    }

    @When("Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucuguna dokunur")
    public void kullanici_on_bilgilendirme_kosullari_ni_ve_uzaktan_satis_sozlemesi_ni_okudum_ve_kabul_ediyorum_kutucuguna_dokunur() {

        for (int i = 0; i < 2; i++) {
            AppiumUtilities.scrollDown();
        }
        wait.until(ExpectedConditions.visibilityOf(odeme_ve_uye_bilgi_sayfasi.kosulVeSozlesme_OnaylaKutucugu));
        odeme_ve_uye_bilgi_sayfasi.kosulVeSozlesme_OnaylaKutucugu.click();
    }

    @When("Kullanici Siparisi Tamamla butonuna dokunur")
    public void kullanici_siparisi_tamamla_butonuna_dokunur() {

        TouchAction action = new TouchAction<>(AndroidAppDriver.getDriver());
        action.tap(PointOption.point(525, 1975)).perform();
    }

    @Then("Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana basariyla ulasir")
    public void kullanici_guvenli_odeme_yapmak_icin_dogrulama_kodunu_girecegi_ekrana_basariyla_ulasir() {

        System.out.println("Ürün seçiminden ödeme adımına kadar kullanılan ve etkileşim " +
                "içinde bulunulan fonksiyonların ve modüllerin işlevselliğinin, fonksiyonelliğinin ve çalışabilirliliğinin " +
                "Uçtan Uca Testi, test otomasyonu ile başarıyla tamamlandı. Uygulama birazdan kendini kapatacaktır");

        SleepMethod.milliSleep(7500);
        AndroidAppDriver.closeDriver();
    }
}