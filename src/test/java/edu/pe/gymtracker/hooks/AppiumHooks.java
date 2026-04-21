package edu.pe.gymtracker.hooks;

import edu.pe.gymtracker.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppiumHooks {

    @Before
    public void setUp(){
        DriverManager.startDriver();
    }
    @After
    public void tearDown(){
        DriverManager.quitDriver();
    }
}
