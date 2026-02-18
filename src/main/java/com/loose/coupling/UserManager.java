package com.loose.coupling;

import com.loose.coupling.UserDataProvider;

public class UserManager {
    private UserDataProvider UserDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.UserDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return UserDataProvider.getUserDetails();
    }
}