package com.qa.test.ui;


import com.codeborne.selenide.SelenideDriver;
import com.qa.test.ui.Util.PropertiesContext;
import com.qa.test.ui.Util.WebDriverWrapper;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

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
        return RandomStringUtils.random(length, true, false);
    }

    protected String getRandomNumber(int length) {
        return RandomStringUtils.random(length, false, true);
    }

    public int getRandomNumberFromRange(int start, int end) {
        return RandomUtils.nextInt(start, end);
    }
    public static LocalDate randomBirthday() {
        return LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 200))));
    }

}
