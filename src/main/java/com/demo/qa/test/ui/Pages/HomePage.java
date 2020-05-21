package com.demo.qa.test.ui.Pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends AbstractPage{
    private static final String LOGIN_HOME_URI = "[title='home']";
    private static final String HOTELS_BUTTON = "li .hotels";
    private static final String SEARCH_INPUT = ".form-search-main-01 .form-group";
    private static final String FORM_LABEL = ".fr:contains(%s)";
    private static final String DESTINATION_VALUE_INPUT = "#select2-search .select2-input";
    private static final String MATCH_RESULT = ".select2-results-dept-1 .select2-result-label";
    private static final String CHECK_IN = "[name='checkin']";
    private static final String CHECK_OUT = "[name='checkout']";
    private static final String SEARCH_BUTTON = "#hotels .btn-primary";

    public void loginAsUser(){


    }
    public BookingPage searchForHotel(String dateFrom, String dateTo, String city){
        goToHomePage().click();
        getHotelsButton().click();
        getCheckIn().setValue(dateFrom);
        getCheckOut().setValue(dateTo);
        getInputByLabel("Destination").click();
        setDestinationValue().setValue(city);
        getMatch().click();
        getSearchButton().click();
        return new BookingPage();
    }

    private SelenideElement setDestinationValue() { return $(DESTINATION_VALUE_INPUT);}
    private SelenideElement getHotelsButton() { return $(HOTELS_BUTTON);}
    private SelenideElement getInputByLabel(String label){ return $(SEARCH_INPUT).$(String.format(FORM_LABEL, label)).parent();}
    private SelenideElement getMatch(){ return $(MATCH_RESULT);}
    private SelenideElement getCheckIn(){ return $(CHECK_IN);}
    private SelenideElement getCheckOut(){ return $(CHECK_OUT);}
    private SelenideElement goToHomePage(){ return $(LOGIN_HOME_URI);}
    private SelenideElement getSearchButton(){ return $(SEARCH_BUTTON);}



}

