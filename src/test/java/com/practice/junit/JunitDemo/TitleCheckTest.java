package com.practice.junit.JunitDemo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleCheckTest {

    @Test
    public void testGoogleTitle() {
        // Set ChromeDriver path if not in system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Get page title
        String title = driver.getTitle();

        // Assert title contains "Google"
        assertEquals("Google", title, "Title should be Google");

        // Close browser
        driver.quit();
    }
}