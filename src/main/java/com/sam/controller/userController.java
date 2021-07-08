package com.sam.controller;

import com.sam.mapper.userMapper;
import com.sam.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return userService.hello();
    }
}
