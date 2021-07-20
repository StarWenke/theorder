package com.wk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wk.mapper")
@SpringBootApplication
public class TheorderApplication {

    public static void main(String[] args) {

        SpringApplication.run(TheorderApplication.class, args);
    }

}
