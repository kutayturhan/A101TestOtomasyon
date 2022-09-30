package com.a101.webBrowser.pages;

import com.a101.webBrowser.utilities.WebBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dizalti_Corap_Sayfasi {

    public Dizalti_Corap_Sayfasi(){
        PageFactory.initElements(WebBrowserDriver.getDriver(), this);
    }


    @FindBy(xpath = "//ol[@class='breadcrumb']//a[@title='Dizaltı Çorap']")
    public WebElement gezintiMenusu_DizaltiCorap;

    @FindBy(xpath = "//div[@class='filters']//input[@id='attributes_integration_colourSİYAH']")
    public WebElement siyahRenk_Checkbox_IsaretKutucugu;

    @FindBy(xpath = "(//a[@data-quantity='1'][@data-pk='18864']//em[@class='icon-sepetekle'])[1]")
    public WebElement sepeteEkle_Butonu;
}
