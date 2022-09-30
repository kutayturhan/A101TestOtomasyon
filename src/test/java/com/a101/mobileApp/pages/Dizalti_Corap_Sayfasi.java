package com.a101.mobileApp.pages;

import com.a101.mobileApp.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dizalti_Corap_Sayfasi {

    public Dizalti_Corap_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Dizaltı Çorap']")
    public MobileElement dizaltiCorap_Baslik;

    @AndroidFindBy(xpath = "//*[@text='Filtrele']")
    public MobileElement filtrele_AcilirSecenekler;

    @AndroidFindBy(xpath = "(//*[contains(@text, \"SİYAH\")])[1]")
    public MobileElement siyahRenk_Filtrele;

    @AndroidFindBy(xpath = "(//*[@text='SEPETE EKLE'])[1]")
    public MobileElement ilkUrun_SepeteEkleButonu;

    @AndroidFindBy(xpath = "//*[@text='SEPETE EKLE']")
    public List<MobileElement> sepeteEkle_Butonu_Liste;

}
