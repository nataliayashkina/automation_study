package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebDriverUniversityLoginPortalPage extends AbstractPage{
    private static final String USERNAME_INPUT = "#text";
    private static final String PASSWORD_INPUT = "#password";
    private static final String LOGIN_BUTTON = "#login-button";
    private static final String SUCCESS_ALERT = "[location.href='run.html']";
    private static final String FAIL_ALERT = "[location.href='fail.html'";

    public void fillingLoginForm(String username,String password){
        $(USERNAME_INPUT).click();
        $(USERNAME_INPUT).setValue(username);
        $(PASSWORD_INPUT).setValue(password);
        $(LOGIN_BUTTON).click();
    }

    public SelenideElement getSuccessAlert (){return $(SUCCESS_ALERT).shouldBe(Condition.visible);}

    public SelenideElement getFailAlert (){ return $(FAIL_ALERT).shouldBe(Condition.visible);}
}
