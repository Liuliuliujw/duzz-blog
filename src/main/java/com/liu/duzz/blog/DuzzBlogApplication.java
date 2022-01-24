package com.liu.duzz.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liu.duzz.blog.mapper")
public class DuzzBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuzzBlogApplication.class, args);
    }

}
