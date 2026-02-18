package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User data from DATABASE: Ahmed, age 25";
    }
}