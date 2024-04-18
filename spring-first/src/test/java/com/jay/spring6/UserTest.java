package com.jay.spring6;

import org.slf4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void add(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.add();
        logger.info("调用成功！");
    }

    /**
     * 反射方式创建
     */
    @Test
    public void reflect() throws Exception {
        Class<?> clazz = Class.forName("com.jay.spring6.User");
        // 旧方式：Object obj = clazz.newInstance();
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        user.add();
    }

}
