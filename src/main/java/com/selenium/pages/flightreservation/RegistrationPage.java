package com.selenium.pages.flightreservation;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends AbstractPage {

    @FindBy(id="firstName")
    private WebElement firstname;

    @FindBy(id="lastName")
    private WebElement lastname;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(name="street")
    private WebElement street;

    @FindBy(name="city")
    private WebElement city;

    @FindBy(id="inputState")
    private WebElement state;

    @FindBy(name="zip")
    private WebElement zip;

    @FindBy(id="register-btn")
    private WebElement register;


    public RegistrationPage(WebDriver driver){
        super(driver);
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(firstname));
        return firstname.isDisplayed();
    }

    public void goTo(String url){
        driver.get(url);
    }

    public void enterUserDetails(String firstName,String lastName){
        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
    }

    public void enterUserCredentials(String email,String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }

    public void enterUserAddress(String streetName,String cityName, String zipCode){
        street.sendKeys(streetName);
        city.sendKeys(cityName);
        zip.sendKeys(zipCode);
    }

    public void clickRegister(){
        register.click();
    }


}
