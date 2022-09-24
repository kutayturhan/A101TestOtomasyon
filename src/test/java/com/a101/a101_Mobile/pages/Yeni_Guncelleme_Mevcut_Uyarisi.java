package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Yeni_Guncelleme_Mevcut_Uyarisi {

    public Yeni_Guncelleme_Mevcut_Uyarisi(){
        PageFactory.initElements(new AppiumFieldDecorator(AndroidAppDriver.getDriver()), this);
    }



    public static void yeniGuncellemeUyarisi_Iptal(){

        Anasayfa anasayfa = new Anasayfa();
        if (anasayfa.guncellemeUyarisi.isDisplayed()){
            anasayfa.guncellemeIptal.click();
        }

    }

}
