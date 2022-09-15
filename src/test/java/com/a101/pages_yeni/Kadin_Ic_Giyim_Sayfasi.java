package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //1. arayuz
    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[2]")
    public WebElement dizaltiCorap_AltKategorisi;

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[3]")
    public WebElement sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement;


    //ALTERNATIF ARAYUZ
    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[3]")
    public WebElement alternatifArayuz_DizaltiCorap_AltKategorisi;

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[4]")
    public WebElement alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement;

    @FindBy(xpath = "//input[@id='attributes_integration_colourSİYAH']")
    public WebElement siyahRenk_Checkbox_IsaretKutucugu;

    //ortak element
    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/'])[8]")
    public WebElement sepeteEkleButonu;


}
