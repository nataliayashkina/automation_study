package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NewCustomerPage extends AbstractPage {
    private static final String NAME_INPUT = "[name='name']";
    private static final String DATE_OF_BIRTH = "[name='dob']";
    private static final String CITY_NAME = "[name='city']";
    private static final String ADRESS = "[name='addr']";
    private static final String STATE = "[name='state']";
    private static final String PIN = "[name='pinno']";
    private static final String EMAIL = "[name='emailid']";
    private static final String SUBMIT_BUTTON = "[name='sub']";
    private static final String PHOME_NUMBER = "[name='telephoneno']";
    private static final String SUCCESS_REGISTRATION_MESSAGE = "body";

    public void registration(String name, String dateOfBirth, String city, String address, String state, String pin, String email, String phoneNumber) {
        $(NAME_INPUT).setValue(name);
        $(DATE_OF_BIRTH).setValue(dateOfBirth);
        $(CITY_NAME).setValue(city);
        $(ADRESS).setValue((address));
        $(STATE).setValue(state);
        $(PIN).setValue(pin);
        $(EMAIL).setValue(email);
        $(PHOME_NUMBER).setValue(phoneNumber);
        $(SUBMIT_BUTTON).click();
    }

    public String getSuccessRegistrationMessage() {
        return $(SUCCESS_REGISTRATION_MESSAGE).getText();
    }

}