package org.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with the target website's URL

        try {
            // Step 1: Switch to inner iframe
            driver.switchTo().frame("innerIframeID"); // Replace with the inner iframe's ID or name

            // Step 2: Locate the button inside the inner iframe
            WebElement button = driver.findElement(By.id("buttonID")); // Replace with the button's ID

            // Step 3: Switch back to the outer iframe
            driver.switchTo().defaultContent(); // Goes back to the top-level frame

            // Step 4: Switch to the outer iframe
            driver.switchTo().frame("outerIframeID"); // Replace with the outer iframe's ID or name

            // Step 5: Use JavaScript to append the button to the outer iframe
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.body.appendChild(arguments[0]);", button);

            System.out.println("Button moved successfully from inner iframe to outer iframe!");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
