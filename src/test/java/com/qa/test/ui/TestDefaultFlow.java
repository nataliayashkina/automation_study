package com.qa.test.ui;


import com.qa.test.ui.Pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {
    @BeforeTest
    public void testLoginPage() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.checkOfLogin();
    }

  //  @Test(groups = {"ui", "login"})
   // public void testLoginPage() {
            // LoginPage loginPage = new LoginPage();
       // loginPage.goToLoginPage();
       // StartPage startPage = loginPage.login(Users.ADMIN);
       // startPage.checkOfLogin();
   // }
    @Test(description = "telecompage, registration")
    public void testTelecomRegistration(){
            LoginPage loginPage = new LoginPage();
            loginPage.goToLoginPage();
            StartPage startPage = loginPage.login(Users.ADMIN);
            startPage.checkOfLogin();
        startPage.goToTelecomPage();
        TelecomPage telecomPage = new TelecomPage();
        telecomPage.goToRegistration();
        NewCustomerForTelecomPage newCustomerForTelecomPage = new NewCustomerForTelecomPage();
        newCustomerForTelecomPage.registration();
        TelecomAccessDetailsPage telecomAccessDetailsPage = new TelecomAccessDetailsPage();
        telecomAccessDetailsPage.checkOfRegistration();
    }

}
