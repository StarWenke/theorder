package com.wk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@MapperScan("com.wk.mapper")
@SpringBootApplication
@EntityScan(basePackages = "com.wk.entity")
public class TheorderApplication {

    public static void main(String[] args) {

        SpringApplication.run(TheorderApplication.class, args);
    }

}
