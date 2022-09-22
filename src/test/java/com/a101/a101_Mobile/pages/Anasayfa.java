package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.MobileAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@text='\ue90F']")
    public MobileElement kategoriler_AcilirMenu;

    @AndroidFindBy(xpath = "//*[@text='GİYİM & AKSESUAR']")
    public MobileElement giyimVeAksesuar_Kategorisi;

    @AndroidFindBy(xpath = "//*[@text='Kadın İç Giyim']")
    public MobileElement kadinIcGiyim_Kategorisi;

    @AndroidFindBy(xpath = "//*[@text='Dizaltı Çorap']")
    public MobileElement dizaltiCorap_Kategorisi;


}
