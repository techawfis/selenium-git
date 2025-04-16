package com.selenium.pages.vendorportal;

import com.selenium.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class    DashboardPage extends AbstractPage {


    private final static Logger log  = LoggerFactory.getLogger(DashboardPage.class);

    @FindBy(css = ".h3")
    private WebElement dashboardTitle;

    @FindBy(id="monthly-earning")
    private WebElement monthlyEarning;

    @FindBy(id="annual-earning")
    private WebElement annualEarning;

    @FindBy(id="profit-margin")
    private WebElement profitMargin;

    @FindBy(id="available-inventory")
    private WebElement availableInventory;

    @FindBy(css = "#dataTable_filter input")
    private WebElement search;

    @FindBy(css="dataTables_info")
    private WebElement searchResultCount;

    @FindBy(css="img.img-profile")
    private WebElement userProfilePicture;

    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    @FindBy(css = "#logoutModal a")
    private WebElement modalLogoutButton;

    public DashboardPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        wait.until(ExpectedConditions.visibilityOf(dashboardTitle));
        return dashboardTitle.isDisplayed();
    }

    public String getMonthlyEarning(){
        return monthlyEarning.getText();
    }

    public String getAnnualEarning(){
        return annualEarning.getText();
    }

    public String getProfitMargin(){
        return profitMargin.getText();
    }

    public String getInventoryDetails(){
        return availableInventory.getText();
    }

    public void searchOrderHistory(String keyword){
        search.sendKeys(keyword);
//        search.sendKeys(Keys.TAB);
    }

    public int getSearchResultCount(){
//        Actions actions = new Actions(driver);
//        actions.scrollToElement(searchResultCount).perform();
        String resultCountText = searchResultCount.getText();
        String[] arr= resultCountText.split(" ");
        int count = Integer.parseInt(arr[5]);
        log.info("Result count: {}",count);
        return count;
    }

    public void logout(){
        userProfilePicture.click();
        wait.until(ExpectedConditions.visibilityOf(logoutLink));
        logoutLink.click();
        wait.until(ExpectedConditions.visibilityOf(modalLogoutButton));
        modalLogoutButton.click();
    }
}
