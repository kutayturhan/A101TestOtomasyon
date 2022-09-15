package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //3üncü ilkine benzeyen le orjinalde calısan locatorlar ya
    //ANASAYFADA CALISAN LOCATORLAR BUNLAR
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKullanimi_KabulEtButonu;

    @FindBy(xpath = "//a[normalize-space()='Giyim & aksesuar']")
    public WebElement giyimVeAksesuar_Dropdown_AsagiAcilirListe;





    //ALTERNATIF ARAYUZ
    @FindBy(xpath = "(//div[normalize-space()='Kategoriler'])[1]")
    public WebElement alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe;

    @FindBy(xpath = "(//a[normalize-space()='Giyim & aksesuar'])[1]")
    public WebElement alternatifArayuz_giyimVeAksesuar_Kategorisi;

    @FindBy(xpath = "(//a[normalize-space()='Kadın İç Giyim'])[1]")
    public WebElement alternatifArayuz_KadinIcGiyim_Kategorisi;

    @FindBy(xpath = "//div[@class='col-md-12 hype-header']")
    public WebElement alternatifArayuz_Header;

    //ORTAK ELEMENT
    @FindBy(xpath = "//a[normalize-space()='Kadın İç Giyim']")
    public WebElement kadinIcGiyim_Kategorisi;

}
