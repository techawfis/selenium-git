package com.selenium.pages.flightreservation;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationConfirmationPage extends AbstractPage {

    @FindBy(id="go-to-flights-search")
    private WebElement goToFlightsSearch;

    @FindBy(css="#registration-confirmation-section p b")
    private WebElement firstnameElement;

    public RegistrationConfirmationPage(WebDriver driver){
        super(driver);
//        PageFactory.initElements(driver,this);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(goToFlightsSearch));
        return goToFlightsSearch.isDisplayed();
    }

    public String getFirstName(){
       return firstnameElement.getText();
    }

    public void clickGoToFlightsSearch(){
        goToFlightsSearch.click();
    }



}
