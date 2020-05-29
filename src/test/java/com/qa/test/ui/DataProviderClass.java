package com.qa.test.ui;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "registration for Telecom")
    public Object[][] city() {
        return new Object[][]{
                {"Natalia", "Yashkina", "nataliayashkina@gmail.com", "Sun str 123", "+12345678909"},
                {"Alexander", "Kalmykov", "test123@gmail.com", "Green ave 420", "+1284763892"},
                {"Ivan", "Ivanov", "ivan555@gmail.com", "White str 777", "+12478936528"},
                {"Petr", "Petrov", "petya360@gmail.com", "Star ave 111", "+12864328081"},
                {"Donald", "Trump", "president@gmail.com", "White str 999", "+12987431086"},
        };
    }
}