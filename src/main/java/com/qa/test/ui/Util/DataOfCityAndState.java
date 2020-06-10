package com.qa.test.ui.Util;

import java.util.*;

public class DataOfCityAndState {
    private List<String> cityList = Arrays.asList("NewYork", "Kiev", "Madrid", "Milan");
    private List<String> stateList = Arrays.asList("NewYork", "California", "Florida", "Illinois");
    private List<String> streetList = Arrays.asList("Green street", "Black Street", "Sun street", "Sea street");
    private List<String> countryList = Arrays.asList("USA", "Ukraine", "Spain", "Italy");
    private List<String> genderList = Arrays.asList("Mr", "Mrs", "Miss", "Ms", "Doctor", "Captain", "Duchess", "Duke", "Father",
            "General", "Lady", "Lord", "Major", "Master", "Sir");
    private Random rand = new Random();
    private String randomCity = cityList.get(rand.nextInt(cityList.size()));
    private String randomState = stateList.get(rand.nextInt(stateList.size()));
    private String randomStreet = streetList.get(rand.nextInt(streetList.size()));
    private String randomGender = genderList.get(rand.nextInt(genderList.size()));
    private String country;

    private String selectCountry(String randomCity) {
        if (randomCity == "New York") {
            country = "USA";
        } else if (randomCity == "Kiev") {
            country = "Ukraine";
        } else if (randomCity == "Madrid") {
            country = "Spain";
        } else country = "Italy";
        return null;

    }

    public String getRandomGender() {
        return randomGender;
    }

    public String getCountry() {
        selectCountry(randomCity);
        return country;
    }

    public String getRandomState() {
        return randomState;
    }


    public String getRandomCity() {
        return randomCity;
    }

    public String getRandomStreet() {
        return randomStreet;
    }

}

