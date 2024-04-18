package com.jay.spring6.ioc.annotation.resource.test;

import com.jay.spring6.ioc.annotation.config.Spring6Config;
import com.jay.spring6.ioc.annotation.resource.controller.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarControllerTest {

    @Test
    public void run(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        CarController carController = applicationContext.getBean(CarController.class);
        carController.run();
    }

    @Test
    public void run2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        CarController carController = applicationContext.getBean(CarController.class);
        carController.run();
    }

}
