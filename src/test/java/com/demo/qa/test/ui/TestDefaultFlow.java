package com.demo.qa.test.ui;


import com.demo.qa.test.ui.Pages.*;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {

    @Test(groups = {"ui", "login"})
    public void loginPageTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
        startPage.checkWelcomeMessage();
    }
    @Test(dataProvider = "city", dataProviderClass = DataProviderClass.class)
    public void searchForHotelTest(String dateFrom, String dateTo, String city){
       LoginPage loginPage = new LoginPage();
       loginPage.goToLoginPage();
      StartPage startPage = loginPage.login(Users.ADMIN);
      startPage.checkWelcomeMessage();
      HomePage homePage = new HomePage();
      homePage.searchForHotel(dateFrom, dateTo, city);
        BookingPage bookingPage = new BookingPage();
        bookingPage.checkCity(city);
        bookingPage.hotelBooking();
        HotelDetailsPage hotelDetailsPage = new HotelDetailsPage();
        hotelDetailsPage.bookNow();
        BookingSubmitPage bookingSubmitPage = new BookingSubmitPage();
        bookingSubmitPage.fillingBookingForm();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.checkPurchase();
    }
    @Test(description = "booking of hotel")
    public void BookingOfHotelTest(){
        BookingPage bookingPage = new BookingPage();
        bookingPage.hotelBooking();
        HotelDetailsPage hotelDetailsPage = new HotelDetailsPage();
        hotelDetailsPage.bookNow();
        BookingSubmitPage bookingSubmitPage = new BookingSubmitPage();
        bookingSubmitPage.fillingBookingForm();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.checkPurchase();

    }

}
