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

    public String getRandomString() {
        return RandomStringUtils.random(10, true, false);
    }

    public String getRandomNumber() {
        return RandomStringUtils.random(10, false, true);
    }

    public String getRandomDay() {
        return RandomStringUtils.random(2, 1, 31, false, true);
    }

    public String getRandomMonth() {
        return RandomStringUtils.random(2, 1, 12, false, true);
    }

    public String getRandomYear() {
        return RandomStringUtils.random(4, 1910, 2010, false, true);
    }
}
