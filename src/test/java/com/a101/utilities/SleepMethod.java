package com.a101.utilities;

public class SleepMethod {

    public static void sleepSecond(int second){
        second *=1000; // 1 1000 - 10 100 1000
        try {
            Thread.sleep(second);
        }catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public static void sleepDecimalNumber(int decimalnumber){

        decimalnumber *= 100;
        try{
            Thread.sleep(decimalnumber);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }

    }

}
