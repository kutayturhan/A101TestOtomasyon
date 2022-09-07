package com.a101.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1-) Properties nesnesini olusturur.
    // 1-) Creates properties object.
    private static Properties properties = new Properties();

    static {

        try {

            // 2-) Dosyayi Java belleginde acar: FileInputStream
            // 2-) Opens the file in the java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            // 3-) FileInputStream nesnesini kullanarak ozellikler nesnesini yukler.
            // 3-) Loads the properties object using the FileInputStream object.
            properties.load(file);

            // 4-) Dosyayi kapatir.
            // 4-) Closes the file.
            file.close();

        } catch (IOException e) {
            System.out.println("ConfigurationReader sinifinda dosya bulunamadi.");
            //System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}

