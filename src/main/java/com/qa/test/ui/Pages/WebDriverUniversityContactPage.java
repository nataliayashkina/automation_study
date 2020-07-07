package com.qa.test.ui.Pages;

import static com.codeborne.selenide.Selenide.$;

public class WebDriverUniversityContactPage extends AbstractPage{
    private static final String FIRST_NAME_INPUT = "[name='first_name']";
    private static final String LAST_NAME_INPUT = "[name='last_name']";
    private static final String EMAIL_INPUT = "[name='email']";
    private static final String COMMENTS_INPUT = "[name='message']";
    private static final String RESET_BUTTON = "[value='RESET']";
    private static final String SUBMIT_BUTTON = "[value='SUBMIT']";
    private static final String SUCCESS_CONTACT_MESSAGE = "div#contact_reply";
    private static final String ERROR_MESSAGE = "body";

    public void fillingContactUsForm(String firstName, String lastName, String email, String comment){
        $(FIRST_NAME_INPUT).setValue(firstName);
        $(LAST_NAME_INPUT).setValue(lastName);
        $(EMAIL_INPUT).setValue(email);
        $(COMMENTS_INPUT).setValue(comment);
        $(SUBMIT_BUTTON).click();
    }

    public String getSuccessContactMessage() { return $(SUCCESS_CONTACT_MESSAGE).getText();}

    public String getErrorMessage(){return $(ERROR_MESSAGE).getText();}


}
