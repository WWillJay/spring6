package com.jay.spring6.ioc.annotation.autowired.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private String name;

    private Integer age;

}
