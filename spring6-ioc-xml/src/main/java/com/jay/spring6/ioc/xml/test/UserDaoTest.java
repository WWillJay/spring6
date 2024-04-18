package com.jay.spring6.ioc.xml.test;

import com.jay.spring6.ioc.xml.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
        userDao.say();
    }

}
