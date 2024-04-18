package com.jay.spring6.ioc.xml.service.impl;

import com.jay.spring6.ioc.xml.dao.UserDao;
import com.jay.spring6.ioc.xml.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        userDao.say();
    }
}
