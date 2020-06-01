package com.qa.test.ui.Util;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DataOfCityAndState {
    private List<String> cityList = Arrays.asList("NewYork", "Chicago", "LosAngeles", "Miami");
    private List<String> stateList = Arrays.asList("NewYork", "California", "Florida", "Illinois");
    private Random rand = new Random();
    private String randomCity = cityList.get(rand.nextInt(cityList.size()));
    private String randomState = stateList.get(rand.nextInt(stateList.size()));
    private int day = rand.nextInt(31);
    private int month = rand.nextInt(12);
    private int year = rand.nextInt(2010);

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getRandomCity() {
        return randomCity;
    }

    public String getRandomState() {
        return randomState;
    }
}
