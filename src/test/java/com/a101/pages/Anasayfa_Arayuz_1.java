package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa_Arayuz_1 {

    public Anasayfa_Arayuz_1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Giyim & aksesuar']")
    public WebElement giyimVeAksesuarModulu;

    @FindBy(xpath = "//a[normalize-space()='Kadın İç Giyim']")
    public WebElement kadinIcGiyimKategorisi;

}
