package com.qa.test.ui.Util;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DataOfCityAndState {
    List<String> cityList = Arrays.asList("NewYork", "Chicago", "LosAngeles", "Miami");
    List<String> stateList = Arrays.asList("NewYork", "California", "Florida", "Illinois");
    Random rand = new Random();
    String randomCity = cityList.get(rand.nextInt(cityList.size()));
    String randomState = stateList.get(rand.nextInt(stateList.size()));
    int day = rand.nextInt(31);
    int month = rand.nextInt(12);
    int year = rand.nextInt(2010);

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
