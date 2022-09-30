package com.a101.mobileApp.pages;

import com.a101.mobileApp.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Odeme_ve_Uye_Bilgi_Sayfasi {

    public Odeme_ve_Uye_Bilgi_Sayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "(//*[@text='GİRİŞ YAP'])[1]")
    public MobileElement girisYap_BaslikYazisi;

    @AndroidFindBy(xpath = "//*[@text='ÜYE OLMADAN DEVAM ET']")
    public MobileElement uyeOlmadanDevamEt_Butonu;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='E-posta Adresiniz']")
    public MobileElement eposta_VeriGirisKutucugu;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup)[23]")
    public MobileElement aydinlatmaMetni_KabulEtIsaretKutucugu;

    @AndroidFindBy(xpath = "//*[@text='GÖNDER']")
    public MobileElement gonder_Butonu;

    @AndroidFindBy(xpath = "//*[@text='Kabul Et']")
    public MobileElement cerezKullanimi_KabulEt_Butonu;

    @AndroidFindBy(xpath = "//*[@text='\uE919 Yeni adres oluştur']")
    public MobileElement yeniAdresOlustur_Butonu;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[2]")
    public MobileElement kargoFirmasi_SecimKutucugu;

    @AndroidFindBy(xpath = "//*[@text='Kaydet ve Devam Et']")
    public MobileElement kaydetVeDevamEt_Butonu;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement krediKarti_adSoyad_VeriGirisKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement krediKarti_kartNumarasi_VeriGirisKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement krediKarti_CVC_VeriGirisKutucugu;

    @AndroidFindBy(xpath = "(//android.webkit.WebView//android.view.View[@text='\uE91F'])[1]")
    public MobileElement sonKullanmaTarihi_AySecimKutucugu;

    @AndroidFindBy(xpath = "(//android.widget.CheckedTextView)[5]")
    public MobileElement sonKullanmaTarihi_5inciAyVeyaYilSecimKutucugu;

    @AndroidFindBy(xpath = "(//android.webkit.WebView//android.view.View[@text='\uE91F'])[2]")
    public MobileElement getSonKullanmaTarihi_YilSecimKutucugu;

    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    public MobileElement kosulVeSozlesme_OnaylaKutucugu;

    @AndroidFindBy(xpath = "//*[@text='Siparişi Tamamla']")
    public MobileElement siparisiTamamla_Butonu;







}
