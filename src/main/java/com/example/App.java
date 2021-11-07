package com.example;

import java.io.File;

/**
 * Hello world!
 *
 */

public class App {
    private static String getPath() {
        try {
            return new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI())
                .getPath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getPath());
    }
}
