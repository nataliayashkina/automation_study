package com.qa.test.ui.Pages;

import static com.codeborne.selenide.Selenide.$;

public class InsurancePage extends AbstractPage {
    private static final String REGISTRATION_BUTTON = "[href='register.php']";

    public NewInsuranceCustomerPage goToRegistration() {
        $(REGISTRATION_BUTTON).click();
        return new NewInsuranceCustomerPage();
    }
}
