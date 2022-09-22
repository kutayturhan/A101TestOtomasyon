package com.a101.a101_WebBrowser.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1-) Properties nesnesini olusturur.
    private static Properties properties = new Properties();

    static {

        try {

            // 2-) Dosyayi Java belleginde acar: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            // 3-) FileInputStream nesnesini kullanarak ozellikler nesnesini yukler.
            properties.load(file);

            // 4-) Dosyayi kapatir.
            file.close();

        } catch (IOException e) {
            System.out.println("ConfigurationReader sinifinda dosya bulunamadi.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}

