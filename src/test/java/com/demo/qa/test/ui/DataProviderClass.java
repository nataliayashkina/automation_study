package com.demo.qa.test.ui;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "city")
    public Object[][] city() {
        return new Object[][]{
                {"25-05-2020", "27-05-2020", "New York"},
                {"26-05-2020", "28-05-2020", "Miami"},
                {"28-05-2020", "30-05-2020", "Chicago"}
        };
    }
}

