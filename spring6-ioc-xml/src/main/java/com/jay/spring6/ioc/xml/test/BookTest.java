package com.jay.spring6.ioc.xml.test;

import com.jay.spring6.ioc.xml.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void run(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean(Book.class);
        System.out.println(book);

    }

}
