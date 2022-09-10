package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Siyah_Corap_Urun_Sayfasi {

    public Siyah_Corap_Urun_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "//a[@class='go-to-shop'][normalize-space()='Sepeti Görüntüle']")
    public WebElement sepetiGoruntuleButonu;

}
