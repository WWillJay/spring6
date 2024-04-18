package com.jay.spring6.ioc.annotation.resource.controller;

import com.jay.spring6.ioc.annotation.resource.service.CarService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Resource(name = "carServiceImpl")
    private CarService carService;

    public void run(){
        carService.run();
    }

}
