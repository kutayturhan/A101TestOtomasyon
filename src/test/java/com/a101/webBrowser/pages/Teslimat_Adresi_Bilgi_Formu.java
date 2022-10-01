package com.a101.webBrowser.pages;

import com.a101.webBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teslimat_Adresi_Bilgi_Formu {

    public Teslimat_Adresi_Bilgi_Formu(){
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligi_VeriGirisKutucugu;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement ad_VeriGirisKutucugu;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement soyad_VeriGirisKutucugu;

    @FindBy(xpath = "//input[@name='phone_number']")
    public WebElement cepTelefonuNo_VeriGirisKutucugu;

    @FindBy(xpath = "//select[@name='city']")
    public WebElement sehir_SecimKutucugu;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilce_SecimKutucugu;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalle_SecimKutucugu;

    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adres_VeriGirisKutusu;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postaKodu_VeriGirisKutucugu;

    @FindBy(xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement formuKaydet_Butonu;
}
