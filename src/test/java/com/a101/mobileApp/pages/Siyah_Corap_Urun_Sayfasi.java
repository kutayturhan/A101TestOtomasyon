package com.a101.mobileApp.pages;

import com.a101.mobileApp.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Siyah_Corap_Urun_Sayfasi {

    public Siyah_Corap_Urun_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@text=\"SEPETE EKLE\"]")
    public MobileElement sepeteEkle_Butonu;

    @AndroidFindBy(xpath = "//*[@text='1 adet Penti Kadın 50 Denye Pantolon Çorabı Siyah sepetinize eklendi.']")
    public MobileElement urunSepeteEklendi_UrunBilgisi;

    @AndroidFindBy(xpath = "//*[@text='SEPETE GİT']")
    public MobileElement urunSepetineGit_Butonu;

}
