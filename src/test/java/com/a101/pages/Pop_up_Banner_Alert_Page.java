package com.a101.pages;

import com.a101.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pop_up_Banner_Alert_Page {

    public Pop_up_Banner_Alert_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezBannerKabulEtButonu;

    @FindBy(xpath = "//button[normalize-space()='ARA']")
    public WebElement aramaButonu;

}
