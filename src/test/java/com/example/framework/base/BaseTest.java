package com.example.framework.base;

import com.example.framework.factory.DriverFactory;
import com.example.framework.factory.DriverManager;
import com.example.framework.utils.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public void setUp() {
        DriverManager.setDriver(
                DriverFactory.createDriver(ConfigReader.getBrowser())
        );

        DriverManager.getDriver()
                .manage()
                .window()
                .maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
