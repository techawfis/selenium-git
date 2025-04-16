package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class AbstractTest {

    protected WebDriver driver;

    @BeforeTest
    public void setDriver(){
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }

    @AfterTest
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
