package com.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NewCustomerForTelecomPage extends AbstractPage {

private static final String FIRST_NAME = "[name='fname']";
private static final String LAST_NAME = "[name='lname']";
private static final String EMAIL = "[name='emailid']";
private static final String ADDRESS = "[name='addr']";
private static final String PHONE_NUMBER = "[name='telephoneno']";
private static final String SUBMIT_BUTTON = "[name='submit']";
private static final String BACKGROUND_CHECK_DONE = "[id='done']";
private static final String BACKGROUND_CHECK_PENDING = "[id='pending']";
    private TelecomAccessDetailsPage TelecomAccessDetailsPage;

    public TelecomAccessDetailsPage registration(){
        getFirstName().click();
    getFirstName().setValue("Natalia");
    getLastName().click();
    getLastName().setValue("Yashkina");
    getEmail().click();
    getEmail().setValue("test123@gmail.com");
    getAddress().click();
    getAddress().setValue("Green str 123");
    getPhoneNumber().click();
    getPhoneNumber().setValue("+12345678909");
   // getCheckDone().click();
    getSubmitButton().click();
    return TelecomAccessDetailsPage;
}




private SelenideElement getFirstName(){ return $(FIRST_NAME);}
private SelenideElement getLastName(){ return $(LAST_NAME);}
private SelenideElement getEmail(){ return $(EMAIL);}
private SelenideElement getAddress(){ return $(ADDRESS);}
private SelenideElement getPhoneNumber(){ return $(PHONE_NUMBER);}
private SelenideElement getSubmitButton(){ return $(SUBMIT_BUTTON);}
private SelenideElement getCheckDone(){ return $(BACKGROUND_CHECK_DONE);}
private SelenideElement getCheckPending(){ return $(BACKGROUND_CHECK_PENDING);}

}
