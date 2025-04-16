package com.selenium.test.vendorportal;

import com.selenium.pages.vendorportal.DashboardPage;
import com.selenium.pages.vendorportal.VendorLoginPage;
import com.selenium.test.AbstractTest;
import com.selenium.test.vendorportal.model.VendorPortalTestData;
import com.selenium.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VendorPortalTest extends AbstractTest {

    private VendorLoginPage vendorLoginPage;
    private DashboardPage dashboardPage;
    private VendorPortalTestData testData;

    Logger log = LoggerFactory.getLogger(VendorPortalTest.class);

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObjects(String testDataPath) throws Exception {
        this.vendorLoginPage = new VendorLoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, VendorPortalTestData.class);
    }

    @Test
    public void loginTest() {
        vendorLoginPage.goTo("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html");
        Assert.assertTrue(vendorLoginPage.isAt());
        vendorLoginPage.loginUser(testData.username(), testData.password());
    }

    @Test(dependsOnMethods = "loginTest")
    public void dashboardTest() {
        Assert.assertTrue(dashboardPage.isAt());
        Assert.assertEquals(dashboardPage.getMonthlyEarning(),testData.monthlyEarning());
        Assert.assertEquals(dashboardPage.getAnnualEarning(),testData.annualEarning());
        Assert.assertEquals(dashboardPage.getProfitMargin(),testData.profitMargin());
        Assert.assertEquals(dashboardPage.getInventoryDetails(),testData.availableInventory());
        dashboardPage.searchOrderHistory(testData.searchKeyword());
    }

    @Test(dependsOnMethods = "dashboardTest")
    public void logout(){
        dashboardPage.logout();
        Assert.assertTrue(vendorLoginPage.isAt());
    }

}
