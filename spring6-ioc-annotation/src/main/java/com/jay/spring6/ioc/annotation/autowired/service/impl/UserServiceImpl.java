package com.jay.spring6.ioc.annotation.autowired.service.impl;


import com.jay.spring6.ioc.annotation.autowired.dao.UserDao;
import com.jay.spring6.ioc.annotation.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void say() {
        System.out.println("UserServiceImpl say");
        userDao.say();
    }
}
