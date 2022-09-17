package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Odeme_ve_Uye_Bilgi_Sayfasi {

    public Odeme_ve_Uye_Bilgi_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='title login-title']")
    public WebElement uyeGirisi_BaslikYazisi;

    @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEt_Butonu;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement email_VeriGirisSatiri;

    @FindBy(xpath = "//button[@class='button block green']")
    public WebElement emailVeriGirisi_DevamEt_Butonu;

    @FindBy(xpath = "(//a[@class='new-address js-new-address'])[1]")
    public WebElement yeniAdresOlustur_Butonu;

    @FindBy(xpath = "//div[@class='cargo-list']//div[@class='check']")
    public List<WebElement> kargoFirmaButonlari_Liste;

    @FindBy(xpath = "button[@class='button block green js-proceed-button']")
    public WebElement adresVeKargoBilgieri_KaydetVeDevamEt_Butonu;

    @FindBy(xpath = "//div[@class='form-area js-new-creditcard-area']//input[@name='name']")
    public WebElement krediKarti_AdSoyad_VeriGirisKutucugu;

    @FindBy(xpath = "//input[@class='js-masterpassbin-payment-card']")
    public WebElement krediKartNumarasi_VeriGirisKutucugu;

    @FindBy(xpath = "//div[@class='form-area js-new-creditcard-area']//select[@name='card_month']")
    public WebElement krediKarti_AySecimKutucugu;

    @FindBy(xpath = "//div[@class='form-area js-new-creditcard-area']//select[@name='card_year']")
    public WebElement krediKart_YilSecimKutucugu;

    @FindBy(xpath = "//div[@class='form-area js-new-creditcard-area']//input[@name='card_cvv']")
    public WebElement krediKart_CVV_VeriGirisKutucugu;

    @FindBy(xpath = "//label[@for='agrement2']")
    public WebElement kosulVeSozlesme_KabulEtKutucugu;

    @FindBy(xpath = "//span[@class='order-complete']")
    public WebElement siparisiTamamla_Butonu;

}
