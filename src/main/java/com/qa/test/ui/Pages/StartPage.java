package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbstractPage {
    private static final String LOGOUT_BUTTON = "[href='Logout.php']";
    private static final String TELECOM_BUTTON = "[href='http://demo.guru99.com/telecom/index.html']";

    public void checkOfLogin(){
        getLogOutButton().shouldBe(Condition.visible);
    }
    public TelecomPage goToTelecomPage(){
        getNewCustomerButton().click();
        return new TelecomPage();
    }

    private SelenideElement getLogOutButton(){ return $(LOGOUT_BUTTON); }
    private SelenideElement getNewCustomerButton(){ return $(TELECOM_BUTTON);}
}
