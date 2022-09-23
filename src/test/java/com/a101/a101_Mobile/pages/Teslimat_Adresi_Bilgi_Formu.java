package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.MobileAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Teslimat_Adresi_Bilgi_Formu {

    public Teslimat_Adresi_Bilgi_Formu() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileAppDriver.getDriver()), this);

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

    @AndroidFindBy(xpath = "//*[@text='İSTANBUL']")
    public MobileElement il_Istanbul;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement ilce_AcilirSecimKutucugu;

    @AndroidFindBy(xpath = "//*[@text='KADIKOY']")
    public MobileElement ilce_Kadikoy;

    @AndroidFindBy(xpath = "(//android.widget.Spinner)[3]")
    public MobileElement mahalle_AcilirSecimKutucugu;

    @AndroidFindBy(xpath = "//*[@text='CADDEBOSTAN MAH']")
    public MobileElement mahalle_CaddebostanMah;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
    public MobileElement tumAdres_VeriGirisKutusu;

    @AndroidFindBy(xpath = "//*[@text='KAYDET']")
    public MobileElement kaydet_Butonu;


}
