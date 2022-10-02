package com.a101.mobileApp.pages;

import com.a101.mobileApp.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Teslimat_Adresi_Bilgi_Formu {

    public Teslimat_Adresi_Bilgi_Formu() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement evAdresim_VeriGirisi;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement ad_veriGirisi;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement soyad_VeriGirisi;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    public MobileElement cepTelefonu_VeriGirisi;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public MobileElement il_AcilirSecimKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement ilce_AcilirSecimKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[3]")
    public MobileElement mahalle_AcilirSecimKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
    public MobileElement tumAdres_VeriGirisKutusu;

    @AndroidFindBy(xpath = "//*[@text='KAYDET']")
    public MobileElement kaydet_Butonu;
}