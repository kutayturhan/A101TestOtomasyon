package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sepetim_Sayfasi {

    public Sepetim_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/orders/checkout/'][@title='Sepeti Onayla']")
    public WebElement sepetiOnaylaButonu;

}
