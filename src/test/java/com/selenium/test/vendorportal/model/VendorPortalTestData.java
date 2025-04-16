package com.selenium.test.vendorportal.model;


public record VendorPortalTestData(String username,
                                   String password,
                                   String monthlyEarning,
                                   String annualEarning,
                                   String profitMargin,
                                   String availableInventory,
                                   String searchKeyword) {

//    public String displaySummary() {
//        return String.format("Vendor %s has monthly earnings of %s.", username, monthlyEarning);
//    }
}
