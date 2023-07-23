package com.spring.book.web;

import com.spring.book.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    @GetMapping("/hello/dto")
//    public HelloResponseDto helloResponseDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
//        return new HelloResponseDto(name,amount);
//    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(HelloResponseDto dto){
        return dto;
    }
}
