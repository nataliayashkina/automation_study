package com.qa.test.ui.Pages;

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
    public void registration(){
        getNameInput().setValue("Natalia");
        getDateOfBirth().setValue("19.05.1997");
        getCity().setValue("NewYork");
        getAdress().setValue("Green str. 123");
        getState().setValue("NewYork");
        getPin().setValue("123456");
        getEmail().setValue("test123@gmail.com");
        getSubmitButton().click();
        getPhoneNumber().setValue("123456789012345");



    }






    private SelenideElement getPhoneNumber(){ return $(PHOME_NUMBER);}
    private SelenideElement getSubmitButton(){ return $(SUBMIT_BUTTON);}
    private SelenideElement getEmail(){ return $(EMAIL);}
    private SelenideElement getPin(){ return $(PIN);}
    private SelenideElement getState(){ return $(STATE);}
    private SelenideElement getAdress(){ return  $(ADRESS);}
    private SelenideElement getNameInput(){ return $(NAME_INPUT);}
    private SelenideElement getDateOfBirth(){ return $(DATE_OF_BIRTH);}
    private SelenideElement getCity(){ return $(CITY_NAME);}
}
