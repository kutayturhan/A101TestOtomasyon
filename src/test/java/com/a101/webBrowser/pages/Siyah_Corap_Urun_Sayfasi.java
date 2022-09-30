package com.a101.webBrowser.pages;

import com.a101.webBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Siyah_Corap_Urun_Sayfasi {

    public Siyah_Corap_Urun_Sayfasi(){
        PageFactory.initElements(WebBrowserDriver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle_Butonu;

    @FindBy(xpath = "//a[@class='go-to-shop'][@title='Sepeti Görüntüle']")
    public WebElement sepetiGoruntule_Butonu;

    @FindBy(xpath = "//li[@class='breadcrumb-item']//a[@title='Dizaltı Çorap']")
    public WebElement gezintiMenusu_PentiKadin50DenyePantalonCorabiSiyah;

    @FindBy(xpath = "//a[@class='name']")
    public WebElement alisveriseDevamEt_AcilirPencere_EklenenUrunBilgisi;
}
