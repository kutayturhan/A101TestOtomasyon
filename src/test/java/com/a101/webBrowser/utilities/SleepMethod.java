package com.a101.webBrowser.utilities;

public class SleepMethod {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public static void milliSleep(int millisecond) {
        millisecond *= 1;
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}