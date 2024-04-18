package com.jay.spring6.ioc.annotation.autowired.test;

import com.jay.spring6.ioc.annotation.autowired.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {

    @Test
    public void say(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.say();
    }

}
