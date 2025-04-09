package org.sel.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class WebTableExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
//        element.click();

//        try{
//            WebElement table = driver.findElement(By.id(""));
//
//            List<WebElement> rows = table.findElements(By.tagName("tr"));
//            for(int i=0;i<rows.size();i++){
//                WebElement row = rows.get(i);
//                List<WebElement> cells = row.findElements(By.tagName("td"));
//                if(i==2){
//                    WebElement targetCell = cells.get(2);
//                    targetCell.findElement(By.className("checkbox")).click();
//                    break;
//                }
//            }
//        }catch (Exception e){
//
//        }finally {
//
//        }

        try{
            WebElement table = driver.findElement(By.id(""));
            List<WebElement> rows  = table.findElements(By.tagName("tr"));
            for(int i=0;i<rows.size();i++){
                if(i==2){
                    WebElement row = rows.get(i);
                    List<WebElement> cells =  row.findElements(By.tagName(""));
                    WebElement cell = cells.get(3);
                    cell.findElements(By.id(""));
                    break;
                }
            }




        } finally {

        }

    }
}
