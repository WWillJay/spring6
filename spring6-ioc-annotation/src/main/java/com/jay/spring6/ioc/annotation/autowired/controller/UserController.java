package com.jay.spring6.ioc.annotation.autowired.controller;


import com.jay.spring6.ioc.annotation.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // 属性注入
//    @Autowired
//    private UserService userService;


    // set方法
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    // 构造器
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // 形参
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    // 只有一个构造方法，无需注解
//    private UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // 配合@Qualifier，根据名称查找
//    @Autowired
//    @Qualifier(value = "userServiceImpl")
//    private UserService userService;

    public void say(){
        System.out.println("UserController say");
        userService.say();
    }

}
