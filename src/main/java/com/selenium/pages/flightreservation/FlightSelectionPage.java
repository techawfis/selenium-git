package com.selenium.pages.flightreservation;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FlightSelectionPage extends AbstractPage {

    @FindBy(name="departure-flight")
    private List<WebElement> departureFlightOptions;

    @FindBy(name="arrival-flight")
    private List<WebElement> arrivalFlightOptions;

    @FindBy(id="confirm-flights")
    private WebElement confirmFlights;

    public FlightSelectionPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(confirmFlights));
        return confirmFlights.isDisplayed();
    }

    public void selectFlights(){
        int random = ThreadLocalRandom.current().nextInt(0,departureFlightOptions.size());
        departureFlightOptions.get(random).click();
//        Actions actions = new Actions(driver);
//        actions.scrollToElement(confirmFlights).perform();
        // Scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmFlights);
        arrivalFlightOptions.get(random).click();
    }

    public void clickConfirmFlights(){
        Actions actions = new Actions(driver);
        actions.moveToElement(confirmFlights).click().perform();
    }
}
