package com.selenium.pages.flightreservation;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlightConfirmationPage extends AbstractPage {

    private static final Logger log = LoggerFactory.getLogger(FlightConfirmationPage.class);

    @FindBy(css = "#flights-confirmation-section .card-body .row:nth-child(1) .col:nth-child(2)")
    private WebElement flightConfirmationElement;

    @FindBy(css = "#flights-confirmation-section .card-body .row:nth-child(3) .col:nth-child(2)")
    private WebElement totalPriceElement;

    public FlightConfirmationPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(flightConfirmationElement));
        return flightConfirmationElement.isDisplayed();
    }

    public String getPrice(){
        String confirmationMsg = flightConfirmationElement.getText();
        String ticketPrice = totalPriceElement.getText();
        log.info("Flight confirmation: {}", confirmationMsg);
        log.info("Ticket price: {}", ticketPrice);
        return ticketPrice;
    }

}
