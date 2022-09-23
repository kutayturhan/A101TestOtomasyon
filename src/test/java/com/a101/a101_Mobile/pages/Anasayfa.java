package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {

    public Anasayfa() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='\uE90F']")
    public MobileElement kategoriler_AcilirMenu;

    @AndroidFindBy(xpath = "//android.widget.ScrollView//android.widget.TextView[@text='GİYİM & AKSESUAR']")
    public MobileElement giyimVeAksesuar_Kategorisi;

    @AndroidFindBy(xpath = "//android.widget.ScrollView//android.widget.TextView[@text='Kadın İç Giyim']")
    public MobileElement kadinIcGiyim_Kategorisi;

    @AndroidFindBy(xpath = "//android.widget.ScrollView//android.widget.TextView[@text='Dizaltı Çorap']")
    public MobileElement dizaltiCorap_Kategorisi;





}
