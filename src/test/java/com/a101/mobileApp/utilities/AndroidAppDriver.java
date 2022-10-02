package com.a101.mobileApp.utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AndroidAppDriver {

    private static AndroidDriver<MobileElement> androidDriver;
    private static URL url;

    private AndroidAppDriver() {
    }

    public static AndroidDriver<MobileElement> getDriver() {

        String platform = ConfigurationReader.getProperty("platform");

        if (Objects.isNull(androidDriver)) {

            switch (platform) {

                case "android":

                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_A101");
                    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.studionord.a101");
                    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.studionord.a101.MainActivity");

                    try {
                        url = new URL("http://localhost:4723/wd/hub");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    androidDriver = new AndroidDriver<>(url, capabilities);
                    androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                    break;
            }
        }
        return androidDriver;
    }

    public static void closeDriver() {
        if (Objects.nonNull(androidDriver)) {
            androidDriver.closeApp();
            androidDriver = null;
        }
    }
}