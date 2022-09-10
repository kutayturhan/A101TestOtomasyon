package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa_Arayuz_2 {

    public Anasayfa_Arayuz_2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[normalize-space()='Kategoriler'])[1]")
    public WebElement kategorilerDropdown;

    @FindBy(xpath = "(//a[normalize-space()='Giyim & aksesuar'])[1]")
    public WebElement giyimVeAksesuarKategorisi;

}
