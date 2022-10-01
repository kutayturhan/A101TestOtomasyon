package com.a101.mobileApp.utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppiumUtilities {

    public static void scrollDown() {

        Dimension dimension = AndroidAppDriver.getDriver().manage().window().getSize();

        double scrollHeightStart = dimension.getHeight() * 0.50;
        int scrollStart = (int) scrollHeightStart;

        double scrollHeightEnd = dimension.getHeight() * 0.25;
        int scrollEnd = (int) scrollHeightEnd;

        new TouchAction<>((PerformsTouchActions) AndroidAppDriver.getDriver())
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

    public static void scrollUp() {

        Dimension dimension = AndroidAppDriver.getDriver().manage().window().getSize();

        double scrollHeightStart = dimension.getHeight() * 0.50;
        int scrollStart = (int) scrollHeightStart;

        double scrollHeightEnd = dimension.getHeight() * 0.25;
        int scrollEnd = (int) scrollHeightEnd;

        new TouchAction<>((PerformsTouchActions) AndroidAppDriver.getDriver())
                .press(PointOption.point(0, scrollEnd))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollStart))
                .release()
                .perform();
    }

    public static void scrollToElementAndClick(String elementText) {

        MobileElement element = AndroidAppDriver.getDriver().findElementByAndroidUIAutomator
                ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView" +
                        "(new UiSelector().text(\"" + elementText + "\"))");
        element.click();
    }

    public static void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(AndroidAppDriver.getDriver(), 120);
            wait.until(ExpectedConditions.alertIsPresent());
            AndroidAppDriver.getDriver().switchTo().alert().dismiss();
        } catch (Exception exception) {
            //Exception handling
        }
    }
}