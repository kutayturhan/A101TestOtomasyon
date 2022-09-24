package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import io.appium.java_client.MobileElement;

public class Ui_Scroll {

    public static void scrollToElementAndClick(String elementText){

        MobileElement secim = AndroidAppDriver.getDriver().findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView" +
                        "(new UiSelector().text(\""+elementText+"\"))");
        secim.click();

    }


}
