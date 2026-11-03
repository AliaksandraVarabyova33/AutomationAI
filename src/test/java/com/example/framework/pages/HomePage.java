package com.example.framework.pages;

import com.example.framework.base.BasePage;
import com.example.framework.factory.DriverManager;
import com.example.framework.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final String url;

    private final By homePageSlider = By.xpath("//section[@id=\"slider\"]");
    private final By homeLink = By.xpath("//a[normalize-space()='Home']");

    public HomePage() {
        super();
        this.url = ConfigReader.getBaseUrl();
    }

    public HomePage open(){
        driver.get(url);
        return this;
    }

    public boolean isHomePageSliderDisplayed(){
        return waitUntilElementIsDisplayed(homePageSlider).isDisplayed();
    }

    public boolean isHomeLinkActive(){
        return waitUntilElementIsDisplayed(homeLink).getCssValue("color").equals("rgba(255, 165, 0, 1)");
    }

}
