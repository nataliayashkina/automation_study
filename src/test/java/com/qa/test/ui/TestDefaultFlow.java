package com.qa.test.ui;


import com.qa.test.ui.Pages.*;
import com.qa.test.ui.Util.DataOfCityAndState;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {
    @Test(description = "telecom")
    public void testTelecomRegistration() {
        String name = getRandomString(10);
        String lastName = getRandomString(12);
        String email = getRandomString(7) + "@test.com";
        String phoneNumber = "+" + getRandomNumber(9);
        String address = getRandomString(7) + "street" + getRandomNumber(3);
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.checkOfLogin();
        startPage.goToTelecomPage();
        TelecomPage telecomPage = new TelecomPage();
        telecomPage.goToRegistration();
        NewTelecomCustomerPage newTelecomCustomerPage = new NewTelecomCustomerPage();
        newTelecomCustomerPage.registration(name, lastName, email, address, phoneNumber);
        TelecomAccessDetailsPage telecomAccessDetailsPage = new TelecomAccessDetailsPage();
        telecomAccessDetailsPage.checkOfRegistration();
    }

    @Test(description = "Bank customer registration")
    public void testBankRegistration() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.checkOfLogin();
        startPage.goToBankRegistration();
        String name = getRandomString(10);
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String dateOfBirth = dataOfCityAndState.getDay() + "." + dataOfCityAndState.getMonth() + "." + dataOfCityAndState.getYear();
        String city = dataOfCityAndState.getRandomCity();
        String address = getRandomString(5) + "street" + getRandomNumber(3);
        String state = dataOfCityAndState.getRandomState();
        String pin = getRandomNumber(6);
        String email = getRandomString(8) + "@test.com";
        String phoneNumber = "+" + getRandomNumber(10);
        NewCustomerPage newCustomerPage = new NewCustomerPage();
        newCustomerPage.registration(name, dateOfBirth, city, address, state, pin, email, phoneNumber);
        Assert.assertEquals(newCustomerPage.getSuccessRegistrationMessage(),
                "Could not connect: Access denied for user 'root'@'localhost' (using password: NO)");
    }
}