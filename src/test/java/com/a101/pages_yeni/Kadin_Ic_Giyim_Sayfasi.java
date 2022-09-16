package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Kadin_Ic_Giyim_Sayfasi {

    public Kadin_Ic_Giyim_Sayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //1. arayuz
    @FindBy(xpath = "(//a[@title='Dizaltı Çorap'])[2]")
    public WebElement dizaltiCorap_AltKategorisi;


    //ALTERNATIF ARAYUZ
    @FindBy(xpath = "(//a[@title='Dizaltı Çorap'])[3]")
    public WebElement alternatifArayuz_DizaltiCorap_AltKategorisi;




}
