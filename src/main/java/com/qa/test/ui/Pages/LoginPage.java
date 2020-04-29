package com.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideElement;
import com.qa.test.ui.Users;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends AbstractPage {
    private final String LOGIN_URI = getContext().getProperty("app.url");
    private static final String LOGIN_USERNAME_FIELD = "";
    private static final String LOGIN_PASSWORD_FIELD = "";
    private static final String LOGIN_BUTTON = "";

    public void goToLoginPage() {
        open(LOGIN_URI);
    }

    public StartPage login(Users user) {
        getUserNameField().setValue(user.getUserName());
        getPasswordField().setValue(user.getPassword());
        getLoginButton().click();
        return new StartPage();
    }

    private SelenideElement getUserNameField() {
        return $(LOGIN_USERNAME_FIELD);
    }

    private SelenideElement getPasswordField() {
        return $(LOGIN_PASSWORD_FIELD);
    }

    private SelenideElement getLoginButton() {
        return $(LOGIN_BUTTON);
    }

}
