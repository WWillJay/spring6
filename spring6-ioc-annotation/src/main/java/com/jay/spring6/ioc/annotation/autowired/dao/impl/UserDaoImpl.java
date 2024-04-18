package com.jay.spring6.ioc.annotation.autowired.dao.impl;


import com.jay.spring6.ioc.annotation.autowired.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("UserDaoImpl say");
        System.out.println("say hello");
    }
}
