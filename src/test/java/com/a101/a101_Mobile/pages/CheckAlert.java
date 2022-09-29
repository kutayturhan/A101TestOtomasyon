package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckAlert {

    public static void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 2);
            wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
