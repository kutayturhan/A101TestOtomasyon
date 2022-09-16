package com.a101.pages_yeni;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giyim_ve_Aksesuar_Sayfasi {


    public Giyim_ve_Aksesuar_Sayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@title='Kadın İç Giyim'])[3]")
    public WebElement alternatifArayuz_kadinIcGiyim_Kategorisi;

    @FindBy(xpath = "(//a[@title='Kadın İç Giyim'])[2]")
    public WebElement kadinIcGiyim_Kategorisi;


}


