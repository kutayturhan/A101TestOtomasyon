package com.a101.utilities;

public class SleepMethod {

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
