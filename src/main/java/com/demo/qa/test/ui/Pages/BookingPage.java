package com.demo.qa.test.ui.Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getSelenideDriver;


public class BookingPage extends AbstractPage {
    private static final String BOOKING_CITY = ".product-long-item .location:contains(%s)";
    private static final String DETAILS_BUTTON = "li .btn.btn-primary";

    public BookingPage checkCity(String city){
        $(String.format(BOOKING_CITY, city)).shouldBe(Condition.visible);
        return this;
    }
    public HotelDetailsPage hotelBooking(){
    getDetailsButton().first().click();
        return new HotelDetailsPage();


    }
    private ElementsCollection getDetailsButton(){ return $$(DETAILS_BUTTON);}
}

