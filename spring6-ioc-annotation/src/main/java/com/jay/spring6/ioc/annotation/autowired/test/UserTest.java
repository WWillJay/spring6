package com.jay.spring6.ioc.annotation.autowired.test;

import com.jay.spring6.ioc.annotation.autowired.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);

    }

}
