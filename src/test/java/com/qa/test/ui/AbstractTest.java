package com.qa.test.ui;


import com.codeborne.selenide.SelenideDriver;
import com.qa.test.ui.Util.PropertiesContext;
import com.qa.test.ui.Util.WebDriverWrapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public abstract class AbstractTest {
    protected PropertiesContext context;
    protected SelenideDriver driver = null;


    public AbstractTest() {
        context = PropertiesContext.getInstance();
    }

    @BeforeMethod
    public void tearUp(Method method) {
        System.out.println("========================== START TEST " + method.getName() + " " +
                "==============================");
        System.out.println("Server URL = " + context.getProperty("app.url"));
        driver = WebDriverWrapper.getWebDriver();
    }

    @AfterMethod
    public void tearDown(Method method) {
        System.out.println("========================== END TEST " + method.getName() + " " +
                "==============================");
        driver.getWebDriver().quit();
    }

    protected String getRandomString(int length) {
        return RandomStringUtils.random(length, true, true);
    }

    protected String getRandomNumber(int length) {
        return RandomStringUtils.random(length, false, true);
    }

}
