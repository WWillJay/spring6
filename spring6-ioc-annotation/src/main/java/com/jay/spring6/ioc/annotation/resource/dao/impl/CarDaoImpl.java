package com.jay.spring6.ioc.annotation.resource.dao.impl;

import com.jay.spring6.ioc.annotation.resource.dao.CarDao;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public void run(){
        System.out.println("run...");
    }

}
