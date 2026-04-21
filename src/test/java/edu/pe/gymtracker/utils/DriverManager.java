package edu.pe.gymtracker.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void startDriver() {
        try{
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android");
            options.setDeviceName("emulator-5554");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("edu.pe.cibertec.gymtrakcer");
            options.setAppActivity("edu.pe.cibertec.gymtrakcer.MainActivity");
            options.setNoReset(false);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
        }
    }
}
