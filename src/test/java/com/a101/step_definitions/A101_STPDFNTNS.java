package com.a101.step_definitions;

import com.a101.pages_yeni.*;
import com.a101.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class A101_STPDFNTNS {

    Anasayfa anasayfa = new Anasayfa();

    Kadin_Ic_Giyim_Sayfasi kadin_ic_giyim_sayfasi = new Kadin_Ic_Giyim_Sayfasi();
    Dizalti_Corap_Sayfasi dizalti_corap_sayfasi = new Dizalti_Corap_Sayfasi();
    Siyah_Corap_Urun_Sayfasi siyah_corap_urun_sayfasi = new Siyah_Corap_Urun_Sayfasi();
    Sepetim_Sayfasi sepetim_sayfasi = new Sepetim_Sayfasi();
    Odeme_ve_Uye_Bilgi_Sayfasi odeme_ve_uye_bilgi_sayfasi = new Odeme_ve_Uye_Bilgi_Sayfasi();
    Teslimat_Adresi_Bilgi_Formu teslimat_adresi_bilgi_formu = new Teslimat_Adresi_Bilgi_Formu();

    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker(new Locale("en-US"));
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();

    //String emailAdres = faker.internet().emailAddress();
    // int[] indeks_Sayilar = {0, emailAdres.indexOf("."), emailAdres.lastIndexOf("@" + 1)};
    // String ad = emailAdres.substring(indeks_Sayilar[0], indeks_Sayilar[1]);
    // String soyad = emailAdres.substring(indeks_Sayilar[1], indeks_Sayilar[2]);

    @Given("Kullanici {string} alan adindaki web sitesine giris yapar")
    public void kullanici_alan_adindaki_web_sitesine_giris_yapar(String domain) {

        //Kullanici www.a101.com.tr adresindeki web sayfasina giris yapar
        Driver.getDriver().get(domain);


    }


    @When("Kullanici cerez kullanimini kabul eder")
    public void kullanici_cerez_kullanimini_kabul_eder() {

        //Sayfa çerez kullanımı gelmeden yükleniyordu
        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.cerezKullanimi_KabulEtButonu));

        //Class seviyesinde olusturulan nesneyi degisken ismi ile cagirir. Tespit ettigimiz web ogesine tiklar.
        anasayfa.cerezKullanimi_KabulEtButonu.click();
        //cerezleri kabul ettikten sonra olusan web öğesi
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@style='display: none; opacity: 0;']")));

    }

    @Then("Kullanici basarili bir sekilde anasayfaya ulasir")
    public void kullanici_basarili_bir_sekilde_anasayfaya_ulasir() {


        String gecerliURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(gecerliURL, "https://www.a101.com.tr/");

    }

    @When("Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerine goturur")
    public void kullanici_mouse_imlecini_giyim_ve_aksesuar_modulu_uzerine_goturur() {

        try {
            actions.moveToElement(anasayfa.giyimVeAksesuar_Dropdown_AsagiAcilirListe).perform();
        } catch (ElementNotInteractableException exception) {
            actions.moveToElement(anasayfa.alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe).perform();
            actions.moveToElement(anasayfa.alternatifArayuz_giyimVeAksesuar_Kategorisi).perform();
        }

    }

    @When("Kullanici Kadin Ic Giyim kategorisine tiklar")
    public void kullanici_kadin_ic_giyim_kategorisine_tiklar() {

        try {

            anasayfa.kadinIcGiyim_Kategorisi.click();
        } catch (ElementNotInteractableException exception) {

            anasayfa.alternatifArayuz_kadinIcGiyim_Kategorisi.click();


        }

    }

    @When("Kullanici Dizalti Corap kategorisine tiklar")
    public void kullanici_dizalti_corap_kategorisine_tiklar() {


        kadin_ic_giyim_sayfasi.dizaltiCorap_AltKategorisi.click();


    }

    @Then("Kullanici Dizalti Corap modellerini goruntuler")
    public void kullanici_dizalti_corap_modellerini_goruntuler() {

        //BASITCE URL CONTAINS YAZIP GEÇEBİLİRDİM AMA YAPMADIM ONU AÇIKLA İŞTE
        String gecerliURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(gecerliURL.contains("dizalti-corap"));
        //breadcrumb görünürlük ekle
        dizalti_corap_sayfasi.gezintiMenusu_DizaltiCorap.isDisplayed();



    }

    @When("Kullanici siyah renk isaret kutucuguna tiklar")
    public void kullanici_siyah_renk_isaret_kutucuguna_tiklar() {
        //bir sonraki adimda assertion error a neden oluyordu ondan sectigimden kesinlikle emin olmak istedim sonraki adim calissin diye

        try {
            dizalti_corap_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.click();
        } catch (ElementClickInterceptedException exception) {
            javascriptExecutor.executeScript("arguments[0].click()", dizalti_corap_sayfasi.siyahRenk_Checkbox_IsaretKutucugu);
        }

    }

    @Then("Acilan urunun siyah renk oldugu dogrulanir")
    public void acilan_urunun_siyah_renk_oldugu_dogrulanir() {

        //SORABİLİTE wait.until(ExpectedConditions.visibilityOfAllElements(dizalti_corap_sayfasi.getSiyahRenk_Checkbox_IsaretKutucugu_SecimSonrasiUrunGorunurluk));

    //    try {
            Assert.assertTrue(dizalti_corap_sayfasi.siyahRenk_Checkbox_IsaretKutucugu.isSelected());
    //    } catch (AssertionError error) {
    //        Driver.getDriver().navigate().refresh();
    //        kullanici_siyah_renk_isaret_kutucuguna_tiklar();
    //    }

    }

    @When("Kullanici Siyah Dizalti Corabi sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_siyah_dizalti_corabi_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {

        dizalti_corap_sayfasi.sepeteEkle_Butonu.click();

    }

    @When("Kullanici Siyah Dizalti Corabi urun sayfasina ulasir ve sepete eklemek icin sepete ekle butonuna tiklar")
    public void kullanici_siyah_dizalti_corabi_urun_sayfasina_ulasir_ve_sepete_eklemek_icin_sepete_ekle_butonuna_tiklar() {

        //Urun secildikten sonra gezinti menüsünde oluşan web elementi
        Assert.assertTrue(siyah_corap_urun_sayfasi.gezintiMenusu_PentiKadin50DenyePantalonCorabiSiyah.isDisplayed());

        siyah_corap_urun_sayfasi.sepeteEkle_Butonu.click();


    }

    @When("Kullanici eklemis oldugu urun bilgisini acilir menude kontrol eder ve sepeti goruntule baglantisina tiklar")
    public void kullanici_eklemis_oldugu_urun_bilgisini_acilir_menude_kontrol_eder_ve_sepeti_goruntule_baglantisina_tiklar() {

        wait.until(ExpectedConditions.elementToBeClickable(siyah_corap_urun_sayfasi.alisveriseDevamEt_AcilirPencere_EklenenUrunBilgisi));
        Assert.assertTrue(siyah_corap_urun_sayfasi.alisveriseDevamEt_AcilirPencere_EklenenUrunBilgisi.isDisplayed());
        siyah_corap_urun_sayfasi.sepetiGoruntule_Butonu.click();

    }

    @When("Kullanici Sepetim sayfasinda sepete eklenen urun bilgisine ulasir ve sepeti onaylamak icin Sepeti Onayla butonuna tiklar")
    public void kullanici_sepetim_sayfasinda_sepete_eklenen_urun_bilgisine_ulasir_ve_sepeti_onaylamak_icin_sepeti_onayla_butonuna_tiklar() {

        wait.until(ExpectedConditions.elementToBeClickable(sepetim_sayfasi.eklenenUrunBilgisi));
        Assert.assertTrue(sepetim_sayfasi.eklenenUrunBilgisi.isDisplayed());

      //  try {
            sepetim_sayfasi.sepetiOnayla_Butonu.click();
      //  } catch (ElementNotInteractableException exception) {
      //      javascriptExecutor.executeScript("arguments[0].click()", sepetim_sayfasi.sepetiOnayla_Butonu);

      //  }

    }

    @Then("Kullanici odeme adimina gecmek icin gerekli olan uye giris bilgisi sayfasina ulasir")
    public void kullanici_odeme_adimina_gecmek_icin_gerekli_olan_uye_giris_bilgisi_sayfasina_ulasir() {

        String gecerliURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(gecerliURL.contains("checkout"));



        Assert.assertTrue(odeme_ve_uye_bilgi_sayfasi.uyeGirisi_BaslikYazisi.isDisplayed());
    }


    @When("Kullanici UYE OLMADAN DEVAM ET butonuna tiklar")
    public void kullanici_uye_olmadan_devam_et_butonuna_tiklar() {

        odeme_ve_uye_bilgi_sayfasi.uyeOlmadanDevamEtButonu.click();

    }

    @When("Kullanici E mail adresini girer")
    public void kullanici_e_mail_adresini_girer() {

        odeme_ve_uye_bilgi_sayfasi.emailVeriGirisSatiri.sendKeys(faker.internet().emailAddress());


    }

    @When("Kullanici DEVAM ET butonuna tiklar")
    public void kullanici_devam_et_butonuna_tiklar() {

        odeme_ve_uye_bilgi_sayfasi.emailVeriGirisiDEVAMETbutonu.click();

    }

    @When("Kullanici yeni adres olustur butonuna tiklar")
    public void kullanici_yeni_adres_olustur_butonuna_tiklar() {

        odeme_ve_uye_bilgi_sayfasi.yeniAdresOlusturButonu.click();

    }

    @When("Kullanici kisi ve teslimat adres bilgilerini adres guncelleme formuna girer")
    public void kullanici_kisi_ve_teslimat_adres_bilgilerini_adres_guncelleme_formuna_girer() {

        String postaKodu = faker.address().zipCode();
        String ad = faker.name().firstName();
        String soyad = faker.name().lastName();


        teslimat_adresi_bilgi_formu.adresBasligi.sendKeys("Ev Adresim");
        teslimat_adresi_bilgi_formu.adVeriGirisKutucugu.sendKeys(ad);
        teslimat_adresi_bilgi_formu.soyadVeriGirisKutucugu.sendKeys(soyad);
        teslimat_adresi_bilgi_formu.cepTelefonuNoVeriGirisKutucugu.sendKeys(faker.numerify("555#######"));

        Select selectSehir = new Select(teslimat_adresi_bilgi_formu.sehirSecimKutucugu);
        selectSehir.selectByVisibleText("İSTANBUL");


        Select selectIlce = new Select(teslimat_adresi_bilgi_formu.ilceSecimKutucugu);
        selectIlce.selectByVisibleText("KADIKÖY");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@name='district']")));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='district']//option[normalize-space()='Seçiniz']")));

        Select selectMahalle = new Select(teslimat_adresi_bilgi_formu.mahalleSecimKutucugu);
        //teslimat_adresi_bilgi_formu.mahalleSecimKutucugu.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[normalize-space()='CADDEBOSTAN MAH']")));
        selectMahalle.selectByIndex(3);

        teslimat_adresi_bilgi_formu.adresVeriGirisKutusu.sendKeys(
                ad + " " + soyad + " \n" +
                        "Caddebostan Mahallesi\n" +
                        "A101 Harca Harca Bitmez Sokak\n" +
                        "No: " + faker.number().numberBetween(1, 101) + "\n" +
                        "Daire: " + faker.number().numberBetween(1, 101) + "\n" +
                        "Posta Kodu: " + postaKodu + " Kadıköy İSTANBUL"
        );

        teslimat_adresi_bilgi_formu.postaKoduVeriGirisKutucugu.sendKeys(postaKodu);
        System.out.println(ad + " " + soyad + " \n" +
                "Caddebostan Mahallesi\n" +
                "A101 Harca Harca Bitmez Sokak\n" +
                "No: " + faker.number().numberBetween(1, 101) + "\n" +
                "Daire: " + faker.number().numberBetween(1, 101) + "\n" +
                "Posta Kodu: " + postaKodu + " Kadıköy İSTANBUL");

    }

    @When("Kullanici teslimat adresi bilgi formundaki kaydet butonuna tiklar")
    public void kullanici_teslimat_adresi_bilgi_formundaki_kaydet_butonuna_tiklar() {

        teslimat_adresi_bilgi_formu.formuKAYDETbutonu.click();

    }

    @When("Kullanici kargo firmasi secimi yapar")
    public void kullanici_kargo_firmasi_secimi_yapar() {


        odeme_ve_uye_bilgi_sayfasi.kargoFirmaButonlari_List.get(faker.number().numberBetween(0, odeme_ve_uye_bilgi_sayfasi.kargoFirmaButonlari_List.size() - 1));
        odeme_ve_uye_bilgi_sayfasi.kargoFirmasiSecim.click();


    }


}
