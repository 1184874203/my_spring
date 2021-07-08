package com.sam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("/com.sam.mapper")
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

}
