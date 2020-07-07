package com.qa.test.ui.Pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebDriverUniversityStartPage extends AbstractPage{
    private final String START_URL = getContext().getProperty("newapp.url");
    private static final String CONTACT_PAGE = "#contact-us";
    private static final String LOGIN_PORTAL_PAGE = "#login-portal";
    private static final String BUTTON_CLICKS_PAGE = "#button-clicks";

    public void goToStartPage(){ open (START_URL);}
    public WebDriverUniversityContactPage goToContactPage(){
        $(CONTACT_PAGE).click();
        return new WebDriverUniversityContactPage();
    }
    public WebDriverUniversityLoginPortalPage goToLoginPortalPage(){
        $(LOGIN_PORTAL_PAGE).click();
        return new WebDriverUniversityLoginPortalPage();
    }
    public WebDriverUniversityButtonClicksPage goToButtonClicksPage(){
        $(BUTTON_CLICKS_PAGE).click();
        return new WebDriverUniversityButtonClicksPage();
    }


}
