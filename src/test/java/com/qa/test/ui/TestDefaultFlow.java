package com.qa.test.ui;


import com.qa.test.ui.Pages.*;
import com.qa.test.ui.Util.DataOfCityAndState;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {
    @Test(description = "telecom customer registration")
    public void testTelecomRegistration() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToTelecomPage();
        String name = getRandomString(10);
        String lastName = getRandomString(12);
        String email = getRandomString(7) + "@test.com";
        String phoneNumber = "+" + getRandomNumber(9);
        String address = getRandomString(7) + "street" + getRandomNumber(3);
        TelecomPage telecomPage = new TelecomPage();
        telecomPage.goToRegistration();
        NewTelecomCustomerPage newTelecomCustomerPage = new NewTelecomCustomerPage();
        newTelecomCustomerPage.registration(name, lastName, email, address, phoneNumber);
        TelecomAccessDetailsPage telecomAccessDetailsPage = new TelecomAccessDetailsPage();
        telecomAccessDetailsPage.checkOfRegistration();
    }

    @Test(description = "Negative scenario for telecom registration")
    public void testNegativeTelecomRegistration(){
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToTelecomPage();
        TelecomPage telecomPage = new TelecomPage();
        telecomPage.goToRegistration();
        NewTelecomCustomerPage newTelecomCustomerPage = new NewTelecomCustomerPage();
        newTelecomCustomerPage.negativeRegistration();
    }

    @Test(description = "Bank customer registration")
    public void testBankRegistration() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToBankRegistration();
        String name = getRandomString(10);
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String dateOfBirth = String.valueOf(getRandomNumberFromRange(1, 31)) + String.valueOf(getRandomNumberFromRange(1, 12)) + String.valueOf(getRandomNumberFromRange(1940, 2000));
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
    @Test(description = "Negative scenario for Bank Registration")
    public void testNegativeBankRegistration(){
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToBankRegistration();
        String name = getRandomString(10);
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String dateOfBirth = randomBirthday().toString();
        String city = dataOfCityAndState.getRandomCity();
        String address = getRandomString(5) + "street" + getRandomNumber(3);
        String state = dataOfCityAndState.getRandomState();
        String pin = getRandomNumber(6);
        String email = "$%^&*$#" + "@test.com";
        String phoneNumber = "+" + getRandomNumber(2);
        NewCustomerPage newCustomerPage = new NewCustomerPage();
        newCustomerPage.registration(name, dateOfBirth, city, address, state, pin, email, phoneNumber);
        Assert.assertEquals(newCustomerPage.getSuccessRegistrationMessage(),
                "Could not connect: Access denied for user 'root'@'localhost' (using password: NO)");

    }

    @Test(description = "Insurance customer registration")
    public void testInsuranceRegistration() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToInsurancePage();
        InsurancePage insurancePage = new InsurancePage();
        insurancePage.goToRegistration();
        NewInsuranceCustomerPage newInsuranceCustomerPage = new NewInsuranceCustomerPage();
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String firstName = getRandomString(10);
        String lastName = getRandomString(12);
        String phone = "+" + getRandomNumber(10);
        String street = dataOfCityAndState.getRandomStreet();
        String city = dataOfCityAndState.getRandomCity();
        String country = dataOfCityAndState.getCountry();
        String postCode = getRandomString(2) + getRandomNumber(2);
        String email = getRandomString(5) + "@test.com";
        String password = getRandomString(7);
        newInsuranceCustomerPage.insuranceFillingRegistrationForm(firstName, lastName, phone, street, city, country, postCode, email, password);
    }
    @Test(description = "Negative scenario for bank registration")
    public void testNegativeInsuranceRegistration(){
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.goToInsurancePage();
        InsurancePage insurancePage = new InsurancePage();
        insurancePage.goToRegistration();
        String firstName = "";
        String lastName = "";;
        String phone = "";
        String street = "";
        String city = "";
        String country = "";
        String postCode = "";
        String email = "";
        String password = "";
        NewInsuranceCustomerPage newInsuranceCustomerPage = new NewInsuranceCustomerPage();
        newInsuranceCustomerPage.insuranceFillingRegistrationForm(firstName, lastName, phone, street, city, country, postCode, email, password);
    }

    @Test(description = "Contact Us positive filling form")
    public void contactPositiveTest(){
        WebDriverUniversityStartPage webDriverUniversityStartPage = new WebDriverUniversityStartPage();
        webDriverUniversityStartPage.goToStartPage();
        webDriverUniversityStartPage.goToContactPage();
        WebDriverUniversityContactPage webDriverUniversityContactPage = new WebDriverUniversityContactPage();
        String firstName = getRandomString(10);
        String lastName = getRandomString(12);
        String email = getRandomString(7) + "@test.com";
        String comment = getRandomString(20);
        webDriverUniversityContactPage.fillingContactUsForm(firstName,lastName,email,comment);
        webDriverUniversityContactPage.getSuccessContactMessage();
    }

    @Test(description = "Contact us empty filling form")
    public void contactNegativeTest(){
        WebDriverUniversityStartPage webDriverUniversityStartPage = new WebDriverUniversityStartPage();
        webDriverUniversityStartPage.goToStartPage();
        webDriverUniversityStartPage.goToContactPage();
        WebDriverUniversityContactPage webDriverUniversityContactPage = new WebDriverUniversityContactPage();
        String firstName = new String();
        String lastName = new String();
        String email = new String();
        String comment = new String();
        webDriverUniversityContactPage.fillingContactUsForm(firstName,lastName,email,comment);
        webDriverUniversityContactPage.getErrorMessage();
    }

    @Test(description = "Login Portal positive test")
    public void loginPositiveTest(){
        WebDriverUniversityStartPage webDriverUniversityStartPage = new WebDriverUniversityStartPage();
        webDriverUniversityStartPage.goToStartPage();
        webDriverUniversityStartPage.goToLoginPortalPage();
        WebDriverUniversityLoginPortalPage webDriverUniversityLoginPortalPage = new WebDriverUniversityLoginPortalPage();
        String username = "webdriver";
        String password = "webdriver123";
        webDriverUniversityLoginPortalPage.fillingLoginForm(username, password);
        webDriverUniversityLoginPortalPage.getSuccessAlert();
    }

    @Test(description = "Login Portal negative test")
    public void loginNegativeTest(){
        WebDriverUniversityStartPage webDriverUniversityStartPage = new WebDriverUniversityStartPage();
        webDriverUniversityStartPage.goToStartPage();
        webDriverUniversityStartPage.goToLoginPortalPage();
        WebDriverUniversityLoginPortalPage webDriverUniversityLoginPortalPage = new WebDriverUniversityLoginPortalPage();
        String username = getRandomString(10);
        String password = getRandomString(10);
        webDriverUniversityLoginPortalPage.fillingLoginForm(username, password);
        webDriverUniversityLoginPortalPage.getFailAlert();
    }
}