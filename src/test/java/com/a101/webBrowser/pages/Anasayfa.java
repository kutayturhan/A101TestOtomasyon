package com.a101.webBrowser.pages;

import com.a101.webBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa() {
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezKullanimi_KabulEtButonu;

    @FindBy(xpath = "//ul[@class='desktop-menu']//a[@title='GİYİM & AKSESUAR']")
    public WebElement giyimVeAksesuar_Dropdown_AsagiAcilirListe;

    @FindBy(xpath = "//div[@class='submenu-dropdown']//a[@title='Kadın İç Giyim']")
    public WebElement kadinIcGiyim_Kategorisi;

    @FindBy(xpath = "//section[@class='container-fluid p-0']//div[@class='hype-link hype-dropdown hype-categories-link']")
    public WebElement alternatifArayuz_Kategoriler_Dropdown_AsagiAcilirListe;

    @FindBy(xpath = "//div[@class='col-md-12 hype-header']//a[@title='GİYİM & AKSESUAR']")
    public WebElement alternatifArayuz_giyimVeAksesuar_Kategorisi;

    @FindBy(xpath = "//div[@class='col-md-12 hype-header']//a[@title='Kadın İç Giyim']")
    public WebElement alternatifArayuz_kadinIcGiyim_Kategorisi;
}