package com.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideElement;
import com.qa.test.ui.Users;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends AbstractPage {
    private final String LOGIN_URI = getContext().getProperty("app.url");
    private static final String LOGIN_USERNAME_FIELD = "[name='uid']";
    private static final String LOGIN_PASSWORD_FIELD = "[name='password']";
    private static final String LOGIN_BUTTON = "[name='btnLogin']";

    public void goToLoginPage() {
        open(LOGIN_URI);
    }

    public StartPage login(Users user) {
        $(LOGIN_USERNAME_FIELD).setValue(user.getUserName());
        $(LOGIN_PASSWORD_FIELD).setValue(user.getPassword());
        $(LOGIN_BUTTON).click();
        return new StartPage();
    }
}
