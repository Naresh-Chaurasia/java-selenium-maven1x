package com.m1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    @Test
    public void testExample() {

        System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
        // Before creating FirefoxDriver instance
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

    }

}