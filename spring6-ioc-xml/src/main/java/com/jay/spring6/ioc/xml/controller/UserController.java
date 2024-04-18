package com.jay.spring6.ioc.xml.controller;

import com.jay.spring6.ioc.xml.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public void say(){
        userService.say();
    }

}
