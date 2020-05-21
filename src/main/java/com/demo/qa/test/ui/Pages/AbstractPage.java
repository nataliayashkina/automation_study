package com.demo.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideDriver;
import com.demo.qa.test.ui.Util.PropertiesContext;

public abstract class AbstractPage {
    protected SelenideDriver driver;
    protected PropertiesContext context = PropertiesContext.getInstance();

    public PropertiesContext getContext() {
        return context;
    }

    public SelenideDriver getDriver() {
        return driver;
    }

    public String getSelector() {
        return "";
    }

    public void reload() {
        driver.refresh();
    }

    /**
     * Pause the execution for animation or any other purposes
     *
     * @param time in milliseconds
     */
    public void suspend(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
