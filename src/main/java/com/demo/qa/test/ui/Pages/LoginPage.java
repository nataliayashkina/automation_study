package com.demo.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideElement;
import com.demo.qa.test.ui.Users;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends AbstractPage {
    private final String LOGIN_URI = getContext().getProperty("app.url");
    private static final String LOGIN_USERNAME_FIELD = "[name='username']";
    private static final String LOGIN_PASSWORD_FIELD = "[name='password']";
    private static final String LOGIN_BUTTON = ".btn.loginbtn";

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
