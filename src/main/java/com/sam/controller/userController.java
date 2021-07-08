package com.sam.controller;

import com.sam.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class userController {

    @Autowired
    private userMapper userMapper;

    public String hello(){
        return "hello";
    }
}
