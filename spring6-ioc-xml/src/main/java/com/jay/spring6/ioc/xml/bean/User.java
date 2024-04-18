package com.jay.spring6.ioc.xml.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class User {

    private String name;

    private Integer age;

    private String others1;

    private String others2;

    private String others3;

    private Book book;

    private Book book2;

    private Book book3;

    private String[] loves;

    private List<Book> bookList;

    private Map<String, Book> bookMap;

    private List<Book> utilBookList;

    private Map<String, Book> utilBookMap;

    private Book pBook;

    public void run(){
        System.out.println("run run run");
    }

}
