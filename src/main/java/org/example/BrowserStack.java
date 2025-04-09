package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BrowserStack implements Runnable {

    private String browserType;
    public BrowserStack(String browser){
        this.browserType = browser;
    }

    public void run(){

        WebDriver driver = null;

        switch (browserType.toLowerCase()){
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser type not supported");
                return;
        }

        driver.get("https://demo.aspnetawesome.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("from browser"+browserType+"-"+driver.getTitle());
        driver.close();
        driver.quit();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
//        FluentWait<WebDriver> waitF  = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(20))
//                .pollingEvery(Duration.ofSeconds(2))
//                .ignoring(NoSuchElementException.class);

    }
}
