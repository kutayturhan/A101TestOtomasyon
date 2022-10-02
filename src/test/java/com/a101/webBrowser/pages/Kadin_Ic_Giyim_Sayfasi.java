package com.a101.webBrowser.pages;

import com.a101.webBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='categories']//a[@title='Dizaltı Çorap']")
    public WebElement dizaltiCorap_AltKategorisi;
}