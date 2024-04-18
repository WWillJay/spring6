package com.jay.spring6.ioc.annotation.resource.service.impl;

import com.jay.spring6.ioc.annotation.resource.dao.CarDao;
import com.jay.spring6.ioc.annotation.resource.service.CarService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarDao carDao;

    @Override
    public void run() {
        carDao.run();
    }
}
