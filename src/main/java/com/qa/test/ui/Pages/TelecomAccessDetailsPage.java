package com.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TelecomAccessDetailsPage {
    private static final String HOME_BUTTON = "li .button";

    public void checkOfRegistration(){
        getHomeButton().shouldBe(Condition.visible);
    }




    private SelenideElement getHomeButton(){return $(HOME_BUTTON);}
}
