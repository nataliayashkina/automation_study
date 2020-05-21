package com.demo.qa.test.ui.Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends AbstractPage {
    private static final String WELCOME_MESSAGE = ".text-align-left:contains(%s)";

    public StartPage checkWelcomeMessage(){
        $(String.format(WELCOME_MESSAGE, "Hi, Demo User")).shouldBe(Condition.visible);
        return this;
    }

}
