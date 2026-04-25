package edu.pe.gymtracker.utils;

import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private DriverManager() {}

    public static AndroidDriver asAndroidDriver(WebDriver driver) {
        if (driver instanceof WebDriverFacade) {
            return (AndroidDriver) ((WebDriverFacade) driver).getProxiedDriver();
        }
        return (AndroidDriver) driver;
    }
}
