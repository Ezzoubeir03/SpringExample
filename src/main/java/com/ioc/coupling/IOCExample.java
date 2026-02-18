package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {

    public static void main(String[] args){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationIoCLouseCouplingExample.xml");

        UserManager userManagerWithDB =
                context.getBean("userManagerWithUserDataProvider", UserManager.class);
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWS =
                context.getBean("userManagerWithWebServiceDataProvider", UserManager.class);
        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithNewDB =
                context.getBean("userManagerWithNewDataProvider", UserManager.class);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
