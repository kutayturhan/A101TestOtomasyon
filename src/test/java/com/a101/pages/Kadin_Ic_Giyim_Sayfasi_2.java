package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadin_Ic_Giyim_Sayfasi_2 {

    public Kadin_Ic_Giyim_Sayfasi_2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[3]")
    public WebElement alternatifArayuzDizaltiCorapAltKategorisi;

    @FindBy(xpath = "(//a[normalize-space()='Dizaltı Çorap'])[4]")
    public WebElement alternatifArayuzSadeceDizaltiCorapAltKategorisiSecildiktenSonraGorunenLocator;

}
