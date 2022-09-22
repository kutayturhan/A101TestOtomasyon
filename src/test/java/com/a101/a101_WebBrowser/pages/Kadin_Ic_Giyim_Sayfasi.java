package com.a101.a101_WebBrowser.pages;

import com.a101.a101_WebBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }

    //1. arayuz
    @FindBy(xpath = "//div[@class='categories']//a[@title='Dizaltı Çorap']")
    public WebElement dizaltiCorap_AltKategorisi;

}
