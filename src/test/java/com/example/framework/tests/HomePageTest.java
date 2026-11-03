package com.example.framework.tests;

import com.example.framework.base.BaseTest;
import com.example.framework.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePageIsOpened() {
        HomePage homePage = new HomePage();

        boolean isPageSliderDisplayed = homePage
                .open()
                .isHomePageSliderDisplayed();
        boolean isHomePageLinkActive = homePage
                .isHomeLinkActive();

        Assert.assertTrue(isPageSliderDisplayed, "Slider is not displayed");
        Assert.assertTrue(isHomePageLinkActive, "Home Link is not active");
    }
}
