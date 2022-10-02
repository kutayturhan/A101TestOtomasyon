package com.a101.mobileApp.pages;

import com.a101.mobileApp.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Sepetim_Sayfasi {

    public Sepetim_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@text='SEPETİ ONAYLA']")
    public MobileElement sepetiOnayla_Butonu;
}
