package com.a101.a101_Mobile.pages;

import com.a101.a101_Mobile.utilities.AndroidAppDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ScrollDown {

    public static void scrollDown() {

        Dimension dimension = AndroidAppDriver.getDriver().manage().window().getSize();

        double scrollHeightStart = dimension.getHeight() * 0.50;
        int scrollStart = (int) scrollHeightStart;

        double scrollHeightEnd = dimension.getHeight() * 0.25;
        int scrollEnd = (int) scrollHeightEnd ;

        new TouchAction<>((PerformsTouchActions) AndroidAppDriver.getDriver())
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

}
