package com.qa.test.ui;


import com.qa.test.ui.Pages.*;
import com.qa.test.ui.Util.DataOfCityAndState;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {
    // @BeforeTest
//    public void testLoginPage() {
    //   LoginPage loginPage = new LoginPage();
    //   loginPage.goToLoginPage();
    //  StartPage startPage = loginPage.login(Users.ADMIN);
    // startPage.checkOfLogin();
    // }

    //  @Test(groups = {"ui", "login"})
    // public void testLoginPage() {
    // LoginPage loginPage = new LoginPage();
    // loginPage.goToLoginPage();
    // StartPage startPage = loginPage.login(Users.ADMIN);
    // startPage.checkOfLogin();
    // }
    @Test(description = "telecom")
    public void testTelecomRegistration() {
        String name = getRandomString();
        String lastName = getRandomString();
        String email = getRandomString() + "@test.com";
        String phoneNumber = "+" + getRandomNumber();
        String address = getRandomString() + "street" + getRandomNumber();
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.checkOfLogin();
        startPage.goToTelecomPage();
        TelecomPage telecomPage = new TelecomPage();
        telecomPage.goToRegistration();
        NewCustomerForTelecomPage newCustomerForTelecomPage = new NewCustomerForTelecomPage();
        newCustomerForTelecomPage.registration(name, lastName, email, address, phoneNumber);
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
        String name = getRandomString();
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String dateOfBirth = dataOfCityAndState.getDay() + "." + dataOfCityAndState.getMonth() + "." + dataOfCityAndState.getYear();
        String city = dataOfCityAndState.getRandomCity();
        String address = getRandomString() + "street" + getRandomNumber();
        String state = dataOfCityAndState.getRandomState();
        String pin = getRandomNumber();
        String email = getRandomString() + "@test.com";
        String phoneNumber = "+" + getRandomNumber();
        NewCustomerPage newCustomerPage = new NewCustomerPage();
        newCustomerPage.registration(name, dateOfBirth, city, address, state, pin, email, phoneNumber);
    }
}