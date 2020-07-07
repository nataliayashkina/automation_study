package com.qa.test.ui.Pages;

import com.qa.test.ui.Util.DataOfCityAndState;
import com.qa.test.ui.Util.Environment.Genders;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class NewInsuranceCustomerPage extends AbstractPage {
    private static final String GENDER = "select#user_title";
    private static final String YEAR = "select#user_dateofbirth_1i";
    private static final String MONTH = "select#user_dateofbirth_2i";
    private static final String DAY = "select#user_dateofbirth_3i";
    private static final String LICENCE = "select#user_licenceperiod";
    private static final String OCCUPATION = "select#user_occupation_id";
    private static final String FIRST_NAME_INPUT = "input#user_firstname";
    private static final String LAST_NAME_INPUT = "input#user_surname";
    private static final String PHONE_NUMBER = "input#user_phone";
    private static final String STREET = "input#user_address_attributes_street";
    private static final String CITY = "input#user_address_attributes_city";
    private static final String COUNTRY = "input#user_address_attributes_county";
    private static final String POST_CODE = "input#user_address_attributes_postcode";
    private static final String EMAIL = "input#user_user_detail_attributes_email";
    private static final String PASSWORD = "input#user_user_detail_attributes_password";
    private static final String CONFIRM_PASSWORD = "input#user_user_detail_attributes_password_confirmation";
    private static final String SUBMIT_BUTTON = "[name='submit']";

    public InsurancePage insuranceFillingRegistrationForm(String firstName, String lastName, String phone, String street,
                                                          String city, String country, String postCode, String email, String password) {
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        Genders gender = Genders.randomGender();
        $(GENDER).selectOption(String.valueOf(gender));
        $(YEAR).selectOptionByValue(String.valueOf(getRandomNumber(1940, 1995)));
        $(MONTH).selectOptionByValue(String.valueOf(getRandomNumber(1, 12)));
        $(DAY).selectOptionByValue(String.valueOf(getRandomNumber(1, 31)));
        $(LICENCE).selectOptionByValue(String.valueOf(getRandomNumber(1, 50)));
        $(OCCUPATION).selectOptionByValue(String.valueOf(getRandomNumber(1, 27)));
        $(FIRST_NAME_INPUT).setValue(firstName);
        $(LAST_NAME_INPUT).setValue(lastName);
        $(PHONE_NUMBER).setValue(phone);
        $(STREET).setValue(street);
        $(CITY).setValue(city);
        $(COUNTRY).setValue(country);
        $(POST_CODE).setValue(postCode);
        $(EMAIL).setValue(email);
        $(PASSWORD).setValue(password);
        $(CONFIRM_PASSWORD).setValue(password);
        $(SUBMIT_BUTTON).click();
        return new InsurancePage();
    }
}
