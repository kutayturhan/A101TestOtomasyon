package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.MobileAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Odeme_ve_Uye_Bilgi_Sayfasi {

    public Odeme_ve_Uye_Bilgi_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileAppDriver.getDriver()), this);

    }

    @AndroidFindBy(xpath = "//*[@text='GİRİŞ YAP']")
    public MobileElement girisYap_Yazisi;

    @AndroidFindBy(xpath = "//*[@text='ÜYE OLMADAN DEVAM ET']")
    public MobileElement uyeOlmadanDevamEt_Butonu;

}
