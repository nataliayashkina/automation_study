package com.qa.test.ui.Pages;

import com.qa.test.ui.Util.DataOfCityAndState;

import static com.codeborne.selenide.Selenide.$;

public class NewInsuranceCustomerPage extends AbstractPage {
    private static final String GENDER = "select#user_title";
    private static final String YEAR = "select#user_dateofbirth_1i";
    private static final String MONTH = "select#user_dateofbirth_2i";
    private static final String DAY = "select#user_dateofbirth_3i";
    private static final String LICENCE = "select#user_licenceperiod";
    private static final String OCCUPATION = "select#user_occupation_id";
    private static final String FIRST_NAME_INPUT = "[name='firstname']";
    private static final String LAST_NAME_INPUT = "[name='lastname']";
    private static final String PHONE_NUMBER = "[name='phone']";
    private static final String STREET = "[name='street']";
    private static final String CITY = "[name='city']";
    private static final String COUNTRY = "[name='county']";
    private static final String POST_CODE = "[name='post_code']";
    private static final String EMAIL = "[name='email']";
    private static final String PASSWORD = "[name='password']";
    private static final String CONFIRM_PASSWORD = "[name='c_password']";
    private static final String SUBMIT_BUTTON = "[name='submit']";

    public InsurancePage insuranceRegistration(String firstName, String lastName, String phone, String street,
                                               String city, String country, String postCode, String email, String password) {
        DataOfCityAndState dataOfCityAndState = new DataOfCityAndState();
        String gender = dataOfCityAndState.getRandomGender();
        $(GENDER).selectOption(gender);
        $(YEAR).selectOptionByValue(String.valueOf(getRandomNumber(1940, 1999)));
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
