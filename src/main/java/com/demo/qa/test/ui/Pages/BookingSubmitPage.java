package com.demo.qa.test.ui.Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BookingSubmitPage extends AbstractPage{
private static final String FIRST_NAME = "[name='first_name']";
private static final String LAST_NAME = "[name='last_name']";
private static final String EMAIL = "[name='email']";
private static final String PHONE_NUMBER = "[name='number']";
private static final String TOTAL_AMOUNT = "li.total";
private static final String SUCCESS_BUTTON = ".btn.btn-success";
private static final String SELECT_COUNTRY_BUTTON = ".chosen-container";
private static final String COUNTRY_INPUT = ".chosen-search-input";

    public PurchasePage fillingBookingForm(){
    getFirstName().setValue("Natalia");
    getLastName().setValue("Yashkina");
    getEmail().setValue("nataliia.yashkina@nure.ua");
    getPhoneNumber().setValue("+12345678909");
    getSelectCounty().click();
    getCountryInput().setValue("United States").pressEnter();
    getSuccessButton().click();
    return new PurchasePage();
    }




private SelenideElement getFirstName(){return $(FIRST_NAME);}
private SelenideElement getLastName(){return $(LAST_NAME);}
private SelenideElement getEmail(){ return $(EMAIL);}
private SelenideElement getPhoneNumber(){ return $(PHONE_NUMBER);}
private SelenideElement getSuccessButton(){ return $(SUCCESS_BUTTON);}
private SelenideElement getSelectCounty(){ return $(SELECT_COUNTRY_BUTTON);}
private SelenideElement getCountryInput(){ return $(COUNTRY_INPUT);}
}
