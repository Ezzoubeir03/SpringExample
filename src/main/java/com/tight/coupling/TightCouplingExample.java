package com.tight.coupling;

import java.awt.desktop.SystemSleepEvent;

public class TightCouplingExample {

    public static void main(String[] args){

        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
