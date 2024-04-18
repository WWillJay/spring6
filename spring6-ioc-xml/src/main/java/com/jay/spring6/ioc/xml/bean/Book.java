package com.jay.spring6.ioc.xml.bean;

import lombok.Data;

@Data
public class Book {

    private String bName;

    private Integer bNum;

    private String others;

    public Book(){
    }

    public Book(String bName, Integer bNum){
        this.bName = bName;
        this.bNum = bNum;
    }

    public Book(String bName, Integer bNum, String others){
        this.bName = bName;
        this.bNum = bNum;
        this.others = others;
    }

}
