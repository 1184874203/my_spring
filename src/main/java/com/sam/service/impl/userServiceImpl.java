package com.sam.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sam.mapper.userMapper;
import com.sam.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private userMapper userMapper;


    @Override
    public String hello() {
        return "hello";
    }
}
