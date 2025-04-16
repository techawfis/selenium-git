package com.selenium.pages.vendorportal;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VendorLoginPage extends AbstractPage {

    @FindBy(id="username")
    private WebElement userName;

    @FindBy(id="password")
    private WebElement passWord;

    @FindBy(id="login")
    private WebElement loginButton;

    public VendorLoginPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(userName));
        return userName.isDisplayed();
    }

    public void goTo(String url){
        driver.get(url);
    }

    public void loginUser(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();
    }

}
