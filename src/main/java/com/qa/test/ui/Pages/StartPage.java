package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbstractPage {
    private static final String LOGOUT_BUTTON = "[href='Logout.php']";
    private static final String TELECOM_BUTTON = "[href='http://demo.guru99.com/telecom/index.html']";
    private static final String NEW_CUSTOMER_PAGE = "[href='addcustomerpage.php']";

    public void checkOfLogin() {
        $(LOGOUT_BUTTON).shouldBe(Condition.visible);
    }

    public TelecomPage goToTelecomPage() {
        $(TELECOM_BUTTON).click();
        return new TelecomPage();
    }

    public NewCustomerPage goToBankRegistration() {
        $(NEW_CUSTOMER_PAGE).click();
        return new NewCustomerPage();
    }
}
