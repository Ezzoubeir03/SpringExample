package com.ioc.coupling;
import com.ioc.coupling.UserDataProvider;
public class UserManager {
    private com.loose.coupling.UserDataProvider userDataProvider;

    public UserManager(UserDataProvider UserDataProvider) {

        this.UserDataProvider = UserDataProvider;
    }

    public String getUserInfo(){

        return UserDataProvider.getUserDetails();
    }
}
