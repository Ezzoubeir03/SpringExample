package com.loose.coupling;

import com.tight.coupling.UserDatabase;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){

        return "User Details From Database";
    }
}
