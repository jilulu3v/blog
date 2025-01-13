package com.jll;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jll.componentmanager.mapper")
public class ComponentManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentManagerApplication.class, args);
    }

}
