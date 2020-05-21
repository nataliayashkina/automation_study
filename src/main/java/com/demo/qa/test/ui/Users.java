package com.demo.qa.test.ui;

import com.demo.qa.test.ui.Util.PropertiesContext;

import java.util.HashMap;
import java.util.Map;


public enum Users {
    //    private static final PropertiesContext context = PropertiesContext.getInstance();
    ADMIN(
            PropertiesContext.getInstance().getProperty("admin.user.name"),
            PropertiesContext.getInstance().getProperty("admin.user.password")
    );
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, String> getUserMap() {
        Map<String, String> user = new HashMap<>();
        user.put("username", userName);
        user.put("password", password);
        return user;
    }
}
