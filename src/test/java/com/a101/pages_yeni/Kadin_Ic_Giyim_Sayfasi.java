package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //1. arayuz
    @FindBy(xpath = "//div[@class='categories']//a[@title='Dizaltı Çorap']")
    public WebElement dizaltiCorap_AltKategorisi;

}
