package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.MobileAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Siyah_Corap_Urun_Sayfasi {

    public Siyah_Corap_Urun_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SEPETE EKLE\"]")
    public MobileElement sepeteEkle_Butonu;

    @AndroidFindBy(xpath = "//*[@text='1 adet Penti Kadın 50 Denye Pantolon Çorabı Siyah sepetinize eklendi.']")
    public MobileElement urunSepeteEklendi_UrunBilgisi;

    @AndroidFindBy(xpath = "//*[@text='SEPETE GİT']")
    public MobileElement urunSepetineGit_Butonu;

}
