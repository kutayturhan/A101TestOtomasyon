package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //3üncü ilkine benzeyen le orjinalde calısan locatorlar ya
    //ANASAYFADA CALISAN LOCATORLAR BUNLAR
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKullanimi_KabulEtButonu;

    @FindBy(xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimVeAksesuar_Dropdown_AsagiAcilirListe;


    //ALTERNATIF ARAYUZ

    @FindBy(xpath = "//div[@class='hype-link hype-dropdown hype-categories-link']")
    public WebElement alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe;

    //Aslında ortak eleman ama anlasılması icin farklı tanımlamayla tuttum
    @FindBy(xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement alternatifArayuz_giyimVeAksesuar_Kategorisi;




}
