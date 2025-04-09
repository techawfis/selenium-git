package org.sel.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest implements Runnable {

    private final String browserType;

    // Constructor to specify the browser type
    public BrowserTest(String browserType) {
        this.browserType = browserType;
    }

    @Override
    public void run() {
        WebDriver driver = null;

        // Launch different browsers based on browserType
        switch (browserType.toLowerCase()) {
            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "C:/path_to_chromedriver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
//                System.setProperty("webdriver.gecko.driver", "C:/path_to_geckodriver/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "edge":
//                System.setProperty("webdriver.edge.driver", "C:/path_to_edgedriver/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser not supported: " + browserType);
                return;
        }

        try {
            // Example test: Open a website and print the title
            driver.get("https://demo.aspnetawesome.com/");
            System.out.println(browserType + " Browser - Title: " + driver.getTitle());
            BrowserActions.takeScreenshot(driver);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}


