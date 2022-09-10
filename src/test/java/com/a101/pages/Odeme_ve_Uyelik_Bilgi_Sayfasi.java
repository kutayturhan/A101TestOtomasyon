package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Odeme_ve_Uyelik_Bilgi_Sayfasi {

    public Odeme_ve_Uyelik_Bilgi_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamEtButonu;
}
