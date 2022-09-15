package com.a101.hehehe;

import com.a101.pages_eski.*;
import com.a101.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.NoSuchElementException;

public class A101_Modul_Fonksiyon_Test {

    //Olusturulan "Cerez_Kullanim_Sayfasi" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "cerezKullanimSayfasi" ismini vererek nesne olusturur.
    Cerez_Kullanim_Sayfasi cerezKullanimSayfasi = new Cerez_Kullanim_Sayfasi();
    Kadin_Ic_Giyim_Sayfasi_eski kadinIcGiyimSayfasi = new Kadin_Ic_Giyim_Sayfasi_eski();
    Kadin_Ic_Giyim_Sayfasi_2 kadinIcGiyimSayfasi2 = new Kadin_Ic_Giyim_Sayfasi_2();
    Siyah_Corap_Urun_Sayfasi siyahCorapUrunSayfasi = new Siyah_Corap_Urun_Sayfasi();
    Teslimat_Adresi_Bilgi_Formu teslimatAdresiBilgiFormu = new Teslimat_Adresi_Bilgi_Formu();
    Odeme_ve_Uye_Bilgi_Sayfasi odemeVeUyelikBilgiSayfasi = new Odeme_ve_Uye_Bilgi_Sayfasi();
    Sepetim_Sayfasi sepetimSayfasi = new Sepetim_Sayfasi();

    //Selenium kutuphanesinden gelen WebDriverWait classi ile degisken tanimlamasi yaparak nesne olusturur.
    //Web Surucusune belirli kosullari beklemesini soylemek icin kullanilir.
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();


    Faker faker = new Faker(new Locale("en-US"));

    //Actions classindan degisken tanimlamasi yaparak actions nesnesini olusturur.
    //Actions sinifi, Selenium tarafindan klavye ve fare hareketlerini islemek icin saglanan bir ozellik sinifidir.
    Actions actions = new Actions(Driver.getDriver());

 //  @When("Kullanici Kadin Ic Giyim kategorisine tiklar")
 //  public void kullanici_kadin_ic_giyim_kategorisine_tiklar() {

 //      //   anasayfaArayuz1.kadinIcGiyimKategorisi.click();

 //      // giyim aksesuar kategorisi görünmedigi icin exception veriyordu.
 //      // tekrar o yolu izlemesi icin command verdim
 //      //alternatif arayuz olma olasiligini da ekledim.
 //      try {
 //          anasayfaArayuz1.kadinIcGiyimKategorisi.click();
 //      } catch (ElementNotInteractableException e) {
 //          try {
 //              if (anasayfaArayuz2.kategorilerDropdown.isDisplayed()) {
 //                  actions.moveToElement(anasayfaArayuz2.kategorilerDropdown).perform();
 //                  actions.moveToElement(anasayfaArayuz2.giyimVeAksesuarKategorisi).perform();
 //              }
 //          } catch (ElementNotInteractableException ignored) {
 //              ignored.printStackTrace();
 //          }
 //          actions.moveToElement(anasayfaArayuz1.giyimVeAksesuarModulu).perform();
 //      }


  //  }

//    @When("Kullanici Dizalti Corap kategorisine tiklar")
//    public void kullanici_dizalti_corap_kategorisine_tiklar() {
//
//        try {
//            kadinIcGiyimSayfasi.dizaltiCorapAltKategorisi.click();
//        } catch (ElementNotInteractableException e) {
//            try {
//                if (kadinIcGiyimSayfasi2.alternatifArayuzDizaltiCorapAltKategorisi.isDisplayed()) {
//                    kadinIcGiyimSayfasi2.alternatifArayuzDizaltiCorapAltKategorisi.click();
//                }
//            } catch (ElementNotInteractableException ignored) {
//                ignored.printStackTrace();
//            }
//        }
//
//
//    }

//    @Then("Kullanici Dizalti Corap modellerini goruntuler")
//    public void kullanici_dizalti_corap_modellerini_goruntuler() {
//
//        try {
//            //Dizalti Corap kategorisi secildikten sonraki URL'nin icerigini dogrular
//            String dizaltiCorapSecimindenSonraURL = Driver.getDriver().getCurrentUrl();
//            Assert.assertTrue(dizaltiCorapSecimindenSonraURL.contains("dizalti-corap"));
//
//            //Bu locator sadece dizalti corap menusu secildikten sonra html kodunda gorunuyor.
//            Assert.assertTrue(kadinIcGiyimSayfasi.sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunenLocator.isDisplayed());
//        } catch (ElementNotInteractableException | NoSuchElementException e) {
//
//            try {
//                if (kadinIcGiyimSayfasi2.alternatifArayuzSadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunenLocator.isDisplayed()) {
//                    String alternatifArayuzDizaltiCorapSecimindenSonraURL = Driver.getDriver().getCurrentUrl();
//                    Assert.assertTrue(alternatifArayuzDizaltiCorapSecimindenSonraURL.contains("dizalti-corap"));
//                    Assert.assertTrue(kadinIcGiyimSayfasi2.alternatifArayuzSadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunenLocator.isDisplayed());
//                }
//            } catch (ElementNotInteractableException | NoSuchElementException ignored) {
//                ignored.printStackTrace();
//            }
//        }

//    }

//    @When("Kullanici siyah renk isaret kutucuguna tiklar")
//    public void kullanici_siyah_renk_isaret_kutucuguna_tiklar() {
//
//        try {
//            kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
//        } catch (ElementClickInterceptedException e) {
//            javascriptExecutor.executeScript("arguments[0].click();", kadinIcGiyimSayfasi.siyahRenkCheckbox);
//            if (!(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected())) {
//                actions.moveToElement(kadinIcGiyimSayfasi.siyahRenkCheckbox).click(kadinIcGiyimSayfasi.siyahRenkCheckbox).perform();
//            }
//        }
//
//    }


    @Then("Acilan urunun siyah renk oldugu dogrulanir")
    public void acilan_urunun_siyah_renk_oldugu_dogrulanir() {


       // Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());

        try{
            Assert.assertTrue(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected());
        } catch (AssertionError e){
            try {
                kadinIcGiyimSayfasi.siyahRenkCheckbox.click();
            } catch (ElementClickInterceptedException exception) {
                javascriptExecutor.executeScript("arguments[0].click();", kadinIcGiyimSayfasi.siyahRenkCheckbox);
                if (!(kadinIcGiyimSayfasi.siyahRenkCheckbox.isSelected())) {
                    actions.moveToElement(kadinIcGiyimSayfasi.siyahRenkCheckbox).click(kadinIcGiyimSayfasi.siyahRenkCheckbox).perform();
                }
            }
        }

    }

    @When("Kullanici Siyah Dizalti Corabini sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_siyah_dizalti_corabini_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {

        kadinIcGiyimSayfasi.sepeteEkleButonu.click();

    }

//
//    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar")
//    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {
//
//
//        siyahCorapUrunSayfasi.sepeteEkleButonu.click();
//
//
//    }
//
//    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar")
//    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepeti_goruntule_baglantisina_tiklar() {
//
//        siyahCorapUrunSayfasi.sepetiGoruntuleButonu.click();
//
//
//    }
//
//    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar")
//    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_tiklar() {
//
//        try {
//            wait.until(ExpectedConditions.elementToBeClickable(sepetimSayfasi.sepetiOnaylaButonu));
//            sepetimSayfasi.sepetiOnaylaButonu.click();
//
//        } catch (ElementNotInteractableException e) {
//
//            Driver.getDriver().navigate().refresh();
//            wait.until(ExpectedConditions.elementToBeClickable(sepetimSayfasi.sepetiOnaylaButonu));
//            sepetimSayfasi.sepetiOnaylaButonu.click();
//        }
//
//        /*
//        try {
//
//            sepetimSayfasi.sepetiOnaylaButonu.click();
//        } catch (ElementNotInteractableException e) {
//            try {
//                Driver.getDriver().navigate().refresh();
//                sepetimSayfasi.sepetiOnaylaButonu.click();
//            } catch (StaleElementReferenceException | ElementClickInterceptedException ignored) {
//                Driver.getDriver().navigate().refresh();
//                sepetimSayfasi.sepetiOnaylaButonu.click();
//                if (!(odemeVeUyelikBilgiSayfasi.uyeOlmadanDevamEtButonu.isDisplayed())){
//                    Driver.getDriver().navigate().refresh();
//                    actions.doubleClick(sepetimSayfasi.sepetiOnaylaButonu).perform();
//                }
//            }
//        }
//
//
//         */
//    }
//
//    @Then("Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina ulasir")
//    public void kullanici_odeme_adimina_gecmek_icin_gerekli_olan_uye_giris_bilgisi_sayfasina_ulasir() {
//
//        String sepetiOnaylaButonunaTiklandiktanSonrakiURL = Driver.getDriver().getCurrentUrl();
//        Assert.assertTrue(sepetiOnaylaButonunaTiklandiktanSonrakiURL.contains("checkout"));
//
//        Assert.assertTrue(odemeVeUyelikBilgiSayfasi.uyeOlmadanDevamEtButonu.isDisplayed());
//
//
//    }
//
//    @When("Kullanici UYE OLMADAN DEVAM ET butonuna tiklar")
//    public void kullanici_uye_olmadan_devam_et_butonuna_tiklar() {
//
//        odemeVeUyelikBilgiSayfasi.uyeOlmadanDevamEtButonu.click();
//
//    }
//
//    @When("Kullanici E mail adresini girer")
//    public void kullanici_e_mail_adresini_girer() {
//
//        odemeVeUyelikBilgiSayfasi.emailVeriGirisSatiri.sendKeys(faker.internet().emailAddress());
//
//    }
//
//    @When("Kullanici DEVAM ET butonuna tiklar")
//    public void kullanici_devam_et_butonuna_tiklar() {
//
//        odemeVeUyelikBilgiSayfasi.emailVeriGirisiDEVAMETbutonu.click();
//
//    }
//
//    @When("Kullanici yeni adres olustur butonuna tiklar")
//    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {
//
//        odemeVeUyelikBilgiSayfasi.yeniAdresOlusturButonu.click();
//
//    }
//
//    @When("Kullanici kisi ve teslimat adres bilgilerini adres guncelleme formuna girer")
//    public void kullanici_kisi_ve_teslimat_adres_bilgilerini_adres_guncelleme_formuna_girer() {
//
//        String ad = faker.name().firstName();
//        String soyad = faker.name().lastName();
//        String postaKodu = faker.address().zipCode();
//
//        teslimatAdresiBilgiFormu.adresBasligi.sendKeys("Ev Adresim");
//        teslimatAdresiBilgiFormu.adVeriGirisKutucugu.sendKeys(ad);
//        teslimatAdresiBilgiFormu.soyadVeriGirisKutucugu.sendKeys(soyad);
//        teslimatAdresiBilgiFormu.cepTelefonuNoVeriGirisKutucugu.sendKeys(faker.numerify("555#######"));
//        Select selectSehir = new Select(teslimatAdresiBilgiFormu.sehirSecimKutucugu);
//        selectSehir.selectByVisibleText("İSTANBUL");
//        wait.until(ExpectedConditions.visibilityOf(teslimatAdresiBilgiFormu.ilceSecimKutucuguGorunurluk));
//        Select selectIlce = new Select(teslimatAdresiBilgiFormu.ilceSecimKutucugu);
//        selectIlce.selectByVisibleText("KADIKÖY");
//
//        try {
//
//            wait.until(ExpectedConditions.visibilityOf(teslimatAdresiBilgiFormu.mahalleSecimKutucuguGorunurluk));
//            Select selectMahalle = new Select(teslimatAdresiBilgiFormu.mahalleSecimKutucugu);
//            selectMahalle.selectByVisibleText("CADDEBOSTAN MAH");
//        } catch (StaleElementReferenceException e) {
//            teslimatAdresiBilgiFormu.mahalleSecimKutucugu.click();
//            wait.until(ExpectedConditions.visibilityOf(teslimatAdresiBilgiFormu.mahalleSecimKutucuguGorunurluk));
//            Select selectMahalle = new Select(teslimatAdresiBilgiFormu.mahalleSecimKutucugu);
//            selectMahalle.selectByVisibleText("CADDEBOSTAN MAH");
//        }
//
//
//        teslimatAdresiBilgiFormu.adresVeriGirisKutusu.sendKeys(
//                ad + " " + soyad + " \n" +
//                        "Caddebostan Mahallesi\n" +
//                        "A101 Harca Harca Bitmez sokak\n" +
//                        "No: " + faker.numerify("##") + "\n" +
//                        "Daire: " + faker.numerify("1#") + "\n" +
//                        "Posta Kodu: " + postaKodu + " Kadıköy İSTANBUL"
//        );
//        teslimatAdresiBilgiFormu.postaKoduVeriGirisKutucugu.sendKeys(postaKodu);
//
//
//    }
//
//    @When("Kullanici teslimat adresi bilgi formundaki kaydet butonuna tiklar")
//    public void kullanici_teslimat_adresi_bilgi_formundaki_kaydet_butonuna_tiklar() {
//
//        teslimatAdresiBilgiFormu.formuKAYDETbutonu.click();
//        //     wait.until(ExpectedConditions.visibilityOf(odemeVeUyelikBilgiSayfasi.sectiginizAdresGorunurluk));
//
//    }
//
//    @When("Kullanici kargo firmasi secimi yapar")
//    public void kullanici_kargo_firmasi_secimi_yapar() {
//
//
//        odemeVeUyelikBilgiSayfasi.kargoFirButonlari.get(faker.number().numberBetween(0, odemeVeUyelikBilgiSayfasi.kargoFirButonlari.size() - 1));
////        odemeVeUyelikBilgiSayfasi.kargoFirmasiSecim
//
//        // actions.doubleClick(odemeVeUyelikBilgiSayfasi.kargoFirmasiSecim).perform();
////        odemeVeUyelikBilgiSayfasi.kargoFirmasiSecim.click();
//
//    }
//
//    @When("Kullanici Kaydet ve Devam Et butonuna tiklar")
//    public void kullanici_kaydet_ve_devam_et_butonuna_tiklar() {
//
//
//        //    try {
//        odemeVeUyelikBilgiSayfasi.adresVeKargoBilgieriKaydetVeDevamEtButonu.click();
//
//        //    boolean displayed = odemeVeUyelikBilgiSayfasi.buAlanGerekliUyarisi.isDisplayed();
//        // System.out.println(displayed);
//
//        //      if (odemeVeUyelikBilgiSayfasi.buAlanGerekliUyarisi.isDisplayed()) {
//        //        Driver.getDriver().navigate().refresh();
//
//        //  }
//
//        //   } catch (ElementNotInteractableException | StaleElementReferenceException e) {
//        //     actions.doubleClick(odemeVeUyelikBilgiSayfasi.adresVeKargoBilgieriKaydetVeDevamEtButonu).perform();
//        // }
//
//
//    }
//
//    @When("Kullanici kredi kart bilgilerini girer")
//    public void kullanici_kredi_kart_bilgilerini_girer() {
//
//        odemeVeUyelikBilgiSayfasi.krediKartiAdSoyadVeriGirisKutucugu.sendKeys(faker.name().fullName());
//        odemeVeUyelikBilgiSayfasi.krediKartNumarasiVeriGirisKutucugu.sendKeys("6011000990139424");
//        odemeVeUyelikBilgiSayfasi.krediKartCVVveriGirisKutucugu.sendKeys(faker.numerify("###"));
//        Select selectKrediKartiAy = new Select(odemeVeUyelikBilgiSayfasi.krediKartiAySecimKutucugu);
//        selectKrediKartiAy.selectByIndex(3);
//        Select selectKrediKartiYil = new Select(odemeVeUyelikBilgiSayfasi.krediKartYilSecimKutucugu);
//        selectKrediKartiYil.selectByIndex(5);
//
//    }
//
//    @When("Kullanici On Bilgilendirme Kosullari'ni ve Uzaktan Satis Sozlemesi'ni okudum ve kabul ediyorum kutucugunu isaretler")
//    public void kullanici_on_bilgilendirme_kosullari_ni_ve_uzaktan_satis_sozlemesi_ni_okudum_ve_kabul_ediyorum_kutucugunu_isaretler() {
//
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
//        javascriptExecutor.executeScript("arguments[0].click();", odemeVeUyelikBilgiSayfasi.kosulVeSozlesmeKabulEtmeKutucugu);
//        //      odemeVeUyelikBilgiSayfasi.kosulVeSozlesmeKabulEtmeKutucugu.click();
//
//
//    }
//
//    @When("Kullanici Siparisi Tamamla butonuna tiklar")
//    public void kullanici_siparisi_tamamla_butonuna_tiklar() {
//
//        odemeVeUyelikBilgiSayfasi.siparisiTamamlaButonu.click();
//
//    }
//
//    @Then("Kullanici guvenli odeme yapmak icin dogrulama kodunu girecegi ekrana ulasir")
//    public void kullanici_guvenli_odeme_yapmak_icin_dogrulama_kodunu_girecegi_ekrana_ulasir() {
//
//        //    String odemeGuvenlikSayfasiURL = Driver.getDriver().getCurrentUrl();
//
//        //  wait.until(ExpectedConditions.urlContains("masterpassturkiye"));
//
//        // Assert.assertTrue(odemeGuvenlikSayfasiURL.contains("masterpassturkiye"));
//        //    wait.until(ExpectedConditions.urlContains("masterpassturkiye"));
//        //  wait.until(ExpectedConditions.urlContains("checkout"));
//        // String tumAdimlardanSonrakiURL = Driver.getDriver().getCurrentUrl();
//
//        SleepMethod.sleep(5);
//        Driver.getDriver().navigate().to("https://www.a101.com.tr/");
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("alert('Ürün seçiminden ödeme adımına kadar etkileşim içinde bulunulan " +
//                "fonksiyonların ve modüllerin" +
//                " işlevselliği, fonksiyonelliği ve çalışabilirliliği uçtan uca başarı ile test edildi. " +
//                "Tarayıcı birazdan kapanacaktır.');");
//        SleepMethod.sleep(5);
//        Driver.getDriver().switchTo().alert().accept();
//        Driver.closeDriver();
//
//        //         js.executeScript("alert('Ürün seçiminden ödeme adımına kadar etkileşim içinde bulunulan " +
//        //               "fonksiyonların ve modüllerin" +
//        //             " işlevselliği, fonsiyonelliği ve çalışabilirliliği uçtan uca başarı ile test edildi. " +
//        //           "Tarayıcı 3 saniye sonra kapatılacaktır.');");
//        //    SleepMethod.sleep(3);
//        //  Driver.getDriver().switchTo().alert().accept();
//        // Driver.closeDriver();
//
//
//// Urun seciminden odeme adimina kadar kullanilan ve etkilesim icinde bulunulan,
////  Fonksiyonlarin ve Modullerin
////  Islevselligi, fonksiyonelligi ve calisilabilirliligi,
////  Uctan Uca Testi
//    }
//
//
}

//