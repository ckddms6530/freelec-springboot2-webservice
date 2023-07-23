package com.spring.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {

        // 내장 WAS 실행
        SpringApplication.run(BookApplication.class, args);
    }

}
