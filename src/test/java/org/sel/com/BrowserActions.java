package org.sel.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Random;

public class BrowserActions {


//    public static void main(String[] args) throws IOException {
//
////        LocalDateTime now = LocalDateTime.now();
////
////        // Extract date, hour, minute, and second
////        String date = now.toLocalDate().toString(); // Extract date as a string
////        int hour = now.getHour();                  // Extract hour
////        int minute = now.getMinute();              // Extract minute
////        int second = now.getSecond();              // Extract second
////
////        // Concatenate into a single string
////        String result = date + " " + hour + ":" + minute + ":" + second;
////
////        // Print the concatenated string
////        System.out.println("Concatenated Date and Time: " + result);
//
//        // Create an instance of Random
//        Random random = new Random();
//        // Generate a random 6-digit number (between 100000 and 999999)
//        int sixDigitNumber = 100000 + random.nextInt(900000);
//        // Print the random number
//        System.out.println("Random 6-digit number: " + sixDigitNumber);
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://demo.aspnetawesome.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        String title = driver.getTitle();
//        System.out.println(title);
////                    driver.close();
////            driver.quit();
//        try {
//            String screenshotpath = "src/test/screenshot";
//            TakesScreenshot ss = (TakesScreenshot) driver;
//            File source = ss.getScreenshotAs(OutputType.FILE);
//            File destination = new File(screenshotpath+"/"+sixDigitNumber+".png");
//            System.out.println("Screenshot saved");
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.err.println("Err while saving the screenshot");
//        }finally {
//            driver.close();
//            driver.quit();
//        }
//
//    }
//
    public static void takeScreenshot(WebDriver driver){
        // Create an instance of Random
        Random random = new Random();
        // Generate a random 6-digit number (between 100000 and 999999)
        int sixDigitNumber = 100000 + random.nextInt(900000);
        System.out.println("Random 6-digit number: " + sixDigitNumber);
        try {
            String screenshotPath = "src/test/screenshot";
            TakesScreenshot ss = (TakesScreenshot) driver;
            File source = ss.getScreenshotAs(OutputType.FILE);
            File destination = new File(screenshotPath+"/"+sixDigitNumber+".png");
            FileUtils.copyFile(source,destination);
            System.out.println("Screenshot saved");

        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Err while saving the screenshot");
        }finally {
            driver.close();
            driver.quit();
        }
    }


}


