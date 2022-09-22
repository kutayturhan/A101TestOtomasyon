package com.a101.a101_WebBrowser.pages;

import com.a101.a101_WebBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sepetim_Sayfasi {

    public Sepetim_Sayfasi(){
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/orders/checkout/'][@title='Sepeti Onayla']")
    public WebElement sepetiOnayla_Butonu;

    @FindBy(xpath = "(//a[@class='title'])[1]")
    public WebElement eklenenUrunBilgisi;


}
