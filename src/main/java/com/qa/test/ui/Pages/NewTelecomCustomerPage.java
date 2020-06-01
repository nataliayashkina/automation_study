package com.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NewTelecomCustomerPage extends AbstractPage {

    private static final String FIRST_NAME = "[name='fname']";
    private static final String LAST_NAME = "[name='lname']";
    private static final String EMAIL = "[name='emailid']";
    private static final String ADDRESS = "[name='addr']";
    private static final String PHONE_NUMBER = "[name='telephoneno']";
    private static final String SUBMIT_BUTTON = "[name='submit']";

    public TelecomAccessDetailsPage registration(String name, String lastName,
                                                 String email, String address,
                                                 String phoneNumber) {
        $(FIRST_NAME).setValue(name);
        $(LAST_NAME).setValue(lastName);
        $(EMAIL).setValue(email);
        $(ADDRESS).setValue(address);
        $(PHONE_NUMBER).setValue(phoneNumber);
        $(SUBMIT_BUTTON).click();
        return new TelecomAccessDetailsPage();
    }

}
