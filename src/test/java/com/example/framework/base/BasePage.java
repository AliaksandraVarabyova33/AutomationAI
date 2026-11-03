package com.example.framework.base;

import com.example.framework.factory.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected final WebDriver driver;

    private static final Duration WAIT_TIMEOUT  = Duration.ofSeconds(10);

    protected BasePage(){
        this.driver = DriverManager.getDriver();
    }

    protected WebElement waitUntilElementIsDisplayed(By locator){
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
