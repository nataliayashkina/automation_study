package com.qa.test.ui;


import com.qa.test.ui.Pages.LoginPage;
import com.qa.test.ui.Pages.StartPage;
import org.testng.annotations.Test;

public class TestDefaultFlow extends AbstractTest {

    @Test(groups = {"ui", "login"})
    public void testLoginPage() {
        LoginPage loginPage = new LoginPage();
        loginPage.goToLoginPage();
        StartPage startPage = loginPage.login(Users.ADMIN);
    }

}
