package com.example.demo.controller;

import com.example.demo.bean.Book;
import com.example.demo.mapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloMapper helloMapper;

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/book")
    public List<Book> book() {
        System.out.println("789");
        List<Book> books = null;
        books = helloMapper.selectOne();
        return books;
    }

}