package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TelecomPage extends AbstractPage{
    private static final String NEW_CUSTOMER_BUTON = "[href='addcustomer.php']";
    private NewCustomerForTelecomPage NewCustomerForTelecomPage;

    public void checkOfTelecomPage(){
        getNewCustomerButton().shouldBe(Condition.visible);
    }

    public NewCustomerForTelecomPage goToRegistration(){
        getNewCustomerButton().click();
        return NewCustomerForTelecomPage;
    }




    private SelenideElement getNewCustomerButton(){ return $(NEW_CUSTOMER_BUTON);}
}
