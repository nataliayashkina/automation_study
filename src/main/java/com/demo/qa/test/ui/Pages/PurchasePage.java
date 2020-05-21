package com.demo.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class PurchasePage extends AbstractPage {
    private static final String GAVLOCHKA = "[name='marketingConsent']";

    public PurchasePage checkPurchase(){
        $(GAVLOCHKA).shouldBe(Condition.visible);
        return this;
    }

}
