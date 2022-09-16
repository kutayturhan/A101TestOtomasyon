package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dizalti_Corap_Sayfasi {

    public Dizalti_Corap_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[3]")
    public WebElement sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement;


    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[4]")
    public WebElement alternatifArayuz_SadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunen_WebElement;


    @FindBy(xpath = "//input[@id='attributes_integration_colourSİYAH']")
    public WebElement siyahRenk_Checkbox_IsaretKutucugu;

    @FindBy(xpath = "//ul[@class='product-list-general']")
    public WebElement getSiyahRenk_Checkbox_IsaretKutucugu_SecimSonrasiUrunGorunurluk;

    //ortak element
    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/'])[8]")
    public WebElement sepeteEkleButonu;
}
