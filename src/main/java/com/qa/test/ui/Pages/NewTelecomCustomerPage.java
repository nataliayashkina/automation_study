package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewTelecomCustomerPage extends AbstractPage {

    private static final String FIRST_NAME = "[name='fname']";
    private static final String LAST_NAME = "[name='lname']";
    private static final String EMAIL = "[name='emailid']";
    private static final String ADDRESS = "[name='addr']";
    private static final String PHONE_NUMBER = "[name='telephoneno']";
    private static final String SUBMIT_BUTTON = "[name='submit']";
    private static final String FIRST_NAME_ERROR_MESSAGE = "#message";
    private static final String LAST_NAME_ERROR_MESSAGE = "#message50";
    private static final String EMAIL_ERROR_MESSAGE = "#message9";
    private static final String ADDRESS_ERROR_MESSAGE = "#message3";
    private static final String PHONE_ERROR_MESSAGE = "#message7";
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
    public void negativeRegistration(){
        $(FIRST_NAME).click();
        $(LAST_NAME).click();
        $(EMAIL).click();
        $(ADDRESS).click();
        $(PHONE_NUMBER).click();
        $(SUBMIT_BUTTON).click();
        $(FIRST_NAME_ERROR_MESSAGE).shouldBe(Condition.visible);
        $(LAST_NAME_ERROR_MESSAGE).shouldBe(Condition.visible);
        $(EMAIL_ERROR_MESSAGE).shouldBe(Condition.visible);
        $(ADDRESS_ERROR_MESSAGE).shouldBe(Condition.visible);
        $(PHONE_ERROR_MESSAGE).shouldBe(Condition.visible);
    }

}
