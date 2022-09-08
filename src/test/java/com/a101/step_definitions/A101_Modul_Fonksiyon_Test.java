package com.a101.step_definitions;

import com.a101.pages.Anasayfa;
import com.a101.pages.Cerez_Kullanim_Sayfasi;
import com.a101.pages.Kadin_Ic_Giyim_Sayfasi;
import com.a101.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A101_Modul_Fonksiyon_Test {

    //Olusturulan "Cerez_Kullanim_Sayfasi" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "cerezKullanimSayfasi" ismini vererek nesne olusturur.
    Cerez_Kullanim_Sayfasi cerezKullanimSayfasi = new Cerez_Kullanim_Sayfasi();

    //Olusturulan "Anasayfa" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "cerezKullanimSayfasi" ismini vererek nesne olusturur.
    Anasayfa anasayfa = new Anasayfa();

    //Olusturulan "Kadin_Ic_Giyim_Sayfasi" java classindan bir degisken tanimlamasi yapar.
    //Bu degiskene "kadinIcGiyimSayfasi" ismini vererek nesne olusturur.
    Kadin_Ic_Giyim_Sayfasi kadinIcGiyimSayfasi = new Kadin_Ic_Giyim_Sayfasi();


    //Selenium kutuphanesinden gelen WebDriverWait classi ile degisken tanimlamasi yaparak nesne olusturur.
    //Web Surucusune belirli kosullari beklemesini soylemek icin kullanilir.
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

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

        //Daha da emin olmak icin cerez bannerini kabul ettikten sonra anasayfaya basarili bir sekilde
        //ulasabilip ulasamadigini gormek icin cerez bannerini kabul ettikten sonra anasayfada
        //tiklanabilir olan bir web ogesini tespit edip tiklanabilirligini kontrol ettim.
        Assert.assertTrue(cerezKullanimSayfasi.aramaButonu.isEnabled());

    }

    @When("Kullanici mouse imlecini Giyim ve Aksesuar modulu uzerinde bekletir")
    public void kullanici_mouse_imlecini_giyim_ve_aksesuar_modulu_uzerinde_bekletir() {

        //Actions classindan degisken tanimlamasi yaparak actions nesnesi olusturuldu.
        //Actions sinifi, Selenium tarafindan klavye ve fare hareketlerini islemek icin saglanan bir ozellik sinifidir.
        Actions actions = new Actions(Driver.getDriver());

        //Giyim & Aksesuar modulu tiklanabilir olana kadar web surucusunu bekletir
        wait.until(ExpectedConditions.elementToBeClickable(anasayfa.giyimVeAksesuarModulu));

        //Mouse imlecini Giyim & Aksesuar modulunun uzerinde bekletir
        actions.moveToElement(anasayfa.giyimVeAksesuarModulu).perform();

    }
    @When("Kadin Ic Giyim kategorisine tiklar")
    public void kadin_ic_giyim_kategorisine_tiklar() {

        //Kadin Ic Giyim katerogirisine tiklar
        kadinIcGiyimSayfasi.kadinIcGiyimKategorisi.click();

    }
    @When("Dizalti Corap kategorisine tiklar")
    public void dizalti_corap_kategorisine_tiklar() {

        //Dizalti Corap alt kategorisine tiklar
        kadinIcGiyimSayfasi.dizaltiCorapAltKategorisi.click();

    }
    @Then("Kullanici Dizalti Corap modellerini goruntuler")
    public void kullanici_dizalti_corap_modellerini_goruntuler() {

        //Kadin Dizalti Corap Urun Model Listesinin gorunurlugunu dogrular
        Assert.assertTrue(kadinIcGiyimSayfasi.kadinDizaltiCorapUrunModelListesi.isDisplayed());

    }
}