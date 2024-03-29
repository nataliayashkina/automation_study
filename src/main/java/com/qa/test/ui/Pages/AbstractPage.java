package com.qa.test.ui.Pages;

import com.codeborne.selenide.SelenideDriver;
import com.qa.test.ui.Util.PropertiesContext;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.assertj.core.internal.bytebuddy.utility.RandomString;

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

    public int getRandomNumber(int start, int end) {
        return RandomUtils.nextInt(start, end);
    }
}
