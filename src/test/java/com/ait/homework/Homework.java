package com.ait.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework {

    private static final Logger log = LoggerFactory.getLogger(Homework.class);

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void testOpenHomePage() {
        System.out.println("Home page is opened");
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

}
