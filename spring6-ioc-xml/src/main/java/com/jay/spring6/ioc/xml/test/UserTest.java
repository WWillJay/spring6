package com.jay.spring6.ioc.xml.test;

import com.jay.spring6.ioc.xml.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据ID获取
        User userById = (User)context.getBean("user");
        System.out.println("get user by id: " + userById);

        // 根据类型获取
        User userByClass = context.getBean(User.class);
        System.out.println("get user by class: " + userByClass);

        // 根据ID和类型获取
        User userByIdAndClass = context.getBean(User.class);
        System.out.println("get user by id and class: " + userByIdAndClass);

    }

}
