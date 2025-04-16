package com.selenium.pages.flightreservation;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchPage extends AbstractPage {


    @FindBy(id="passengers")
    private WebElement passengersOption;

    @FindBy(xpath = "//button[text()='Search Flights']")
    private WebElement searchFlights;

    public FlightSearchPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(searchFlights));
        return searchFlights.isDisplayed();
    }

    public void selectPassenger(String noOfPassengers){
        Select passengers = new Select(passengersOption);
        passengers.selectByValue(noOfPassengers);
    }

    public void clickSearchFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(searchFlights));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchFlights).click().perform();
//        searchFlights.click();
    }


}
