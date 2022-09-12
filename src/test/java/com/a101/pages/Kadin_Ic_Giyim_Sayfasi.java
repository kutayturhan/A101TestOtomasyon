package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[2]")
    public WebElement dizaltiCorapAltKategorisi;

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[3]")
    public WebElement sadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunenLocator;

    @FindBy(xpath = "//input[@id='attributes_integration_colourSİYAH']")
    public WebElement siyahRenkCheckbox;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/'])[8]")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "(//a[@href='/giyim-aksesuar/doremi-kadin-diz-alti-corap-micro-bronz/'])[8]")
    public WebElement sepeteEkleUrunuReferans;


}
