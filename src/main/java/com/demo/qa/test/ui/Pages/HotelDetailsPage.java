package com.demo.qa.test.ui.Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HotelDetailsPage extends AbstractPage{

    private static final String BOOK_NOW_BUTTON = ".room-item .btn.btn-primary";

    public BookingSubmitPage bookNow(){
        Wait();
        $$(BOOK_NOW_BUTTON).first().click();
        Wait();
//        getBookNowButton().click();
        return new BookingSubmitPage();
    }
//    private SelenideElement getBookNowButton(){return $(BOOK_NOW_BUTTON);}
}
