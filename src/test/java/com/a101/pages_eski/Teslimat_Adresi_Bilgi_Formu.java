package com.a101.pages_eski;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teslimat_Adresi_Bilgi_Formu {

    public Teslimat_Adresi_Bilgi_Formu(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligi;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement adVeriGirisKutucugu;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement soyadVeriGirisKutucugu;

    @FindBy(xpath = "//input[@name='phone_number']")
    public WebElement cepTelefonuNoVeriGirisKutucugu;

    @FindBy(xpath = "//select[@name='city']")
    public WebElement sehirSecimKutucugu;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilceSecimKutucugu;

    @FindBy(xpath = "//option[normalize-space()='KADIKÖY']")
    public WebElement ilceSecimKutucuguGorunurluk;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalleSecimKutucugu;

    @FindBy(xpath = "//option[normalize-space()='CADDEBOSTAN MAH']")
    public WebElement mahalleSecimKutucuguGorunurluk;

    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public WebElement adresVeriGirisKutusu;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postaKoduVeriGirisKutucugu;

    @FindBy(xpath = "//button[normalize-space()='KAYDET']")
    public WebElement formuKAYDETbutonu;
}
