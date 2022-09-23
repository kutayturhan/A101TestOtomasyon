package com.a101.a101_Mobile.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class MobileAppDriver {


    private static AppiumDriver<MobileElement> driver;
    private static URL url;

    private MobileAppDriver() {
    }

    public static AppiumDriver<MobileElement> getDriver() {
        String platform = ConfigurationReader.getProperty("platform");
        if (Objects.isNull(driver)) {
            switch (platform) {
                case "android":
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
                    capabilities.setCapability("appPackage", "org.studionord.a101");
                    capabilities.setCapability("appActivity", "org.studionord.a101.MainActivity");
                    try {
                        url = new URL("http://localhost:4723/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    driver = new AndroidDriver<>(url, capabilities);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (Objects.nonNull(driver)) {
            driver.closeApp();
            driver = null;
        }
    }
}