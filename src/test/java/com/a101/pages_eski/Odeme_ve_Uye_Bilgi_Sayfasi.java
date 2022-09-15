package com.a101.pages_eski;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Odeme_ve_Uye_Bilgi_Sayfasi {

    public Odeme_ve_Uye_Bilgi_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEtButonu;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailVeriGirisSatiri;

    @FindBy(xpath = "//button[normalize-space()='DEVAM ET']")
    public WebElement emailVeriGirisiDEVAMETbutonu;

    @FindBy(xpath = "(//a[normalize-space()='Yeni adres oluştur'])[1]")
    public WebElement yeniAdresOlusturButonu;

    @FindBy(xpath = "(//span[normalize-space()='SEÇTİĞİNİZ ADRES'])[1]")
    public WebElement sectiginizAdresGorunurluk;

    @FindBy(xpath = "(//input[@name='shipping'])[1]")
    public WebElement kargoFirmasiSecim;

    @FindBy(xpath = "//div[normalize-space()='Bu alan gerekli.']")
    public WebElement buAlanGerekliUyarisi;

    @FindBy(xpath = "//ul[@class='js-shipping-list']//div[@class='check']")
    public List<WebElement> kargoFirButonlari;

    @FindBy(xpath = "//button[normalize-space()='Kaydet ve Devam Et']")
    public WebElement adresVeKargoBilgieriKaydetVeDevamEtButonu;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement krediKartiAdSoyadVeriGirisKutucugu;

    @FindBy(xpath = "//input[@class='js-masterpassbin-payment-card']")
    public WebElement krediKartNumarasiVeriGirisKutucugu;

    @FindBy(xpath = "(//select[@name='card_month'])[2]")
    public WebElement krediKartiAySecimKutucugu;

    @FindBy(xpath = "(//select[@name='card_year'])[2]")
    public WebElement krediKartYilSecimKutucugu;

    @FindBy(xpath = "(//input[@name='card_cvv'])[2]")
    public WebElement krediKartCVVveriGirisKutucugu;

    @FindBy(xpath = "//label[@for='agrement2']")
    public WebElement kosulVeSozlesmeKabulEtmeKutucugu;

    @FindBy(xpath = "(//span[normalize-space()='Siparişi Tamamla'])[2]")
    public WebElement siparisiTamamlaButonu;

}
