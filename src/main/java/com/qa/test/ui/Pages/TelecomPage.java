package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TelecomPage extends AbstractPage {
    private static final String NEW_CUSTOMER_BUTON = "[href='addcustomer.php']";

    public NewTelecomCustomerPage goToRegistration() {
        $(NEW_CUSTOMER_BUTON).click();
        return new NewTelecomCustomerPage();
    }
}
