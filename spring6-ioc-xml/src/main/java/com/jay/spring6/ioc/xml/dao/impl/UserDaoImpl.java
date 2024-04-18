package com.jay.spring6.ioc.xml.dao.impl;

import com.jay.spring6.ioc.xml.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("say hello");
    }
}
