package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User data from NEW DATABASE: Ali, age 28";
    }
}