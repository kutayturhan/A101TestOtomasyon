package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cerez_Kullanim_Sayfasi {

    public Cerez_Kullanim_Sayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezBannerKabulEtButonu;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement aramaButonu;

}
