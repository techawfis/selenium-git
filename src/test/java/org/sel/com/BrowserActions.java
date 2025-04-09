package org.sel.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Random;

public class BrowserActions {

    public static void takeScreenshot(WebDriver driver) {
        // Create an instance of Random
        Random random = new Random();
        // Generate a random 6-digit number (between 100000 and 999999)
        int sixDigitNumber = 100000 + random.nextInt(900000);
        System.out.println("Random 6-digit number: " + sixDigitNumber);
        try {
            String screenshotPath = "src/test/screenshot";
            TakesScreenshot ss = (TakesScreenshot) driver;
            File source = ss.getScreenshotAs(OutputType.FILE);
            File destination = new File(screenshotPath + "/" + sixDigitNumber + ".png");
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Err while saving the screenshot");
        } finally {
            driver.close();
            driver.quit();
        }
    }
}