package com.example.framework.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver createDriver(String browser) {
        if (browser == null || browser.isBlank()) {
            throw new IllegalArgumentException(
                    "Browser name must not be empty"
            );
        }

        return switch (browser.trim().toLowerCase()) {
            case "chrome" -> new ChromeDriver();
            case "firefox" -> new FirefoxDriver();
            case "edge" -> new EdgeDriver();

            default -> throw new IllegalArgumentException(
                    "Unsupported browser: " + browser
                            + ". Supported browsers: chrome, firefox, edge"
            );
        };
    }
}
