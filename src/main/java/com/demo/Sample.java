package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class Sample {

    @GetMapping("/msg")
    public String getMsg(){
        return "Hello";
    }

    @GetMapping("/get")
    public String msg(){
        return "Hii";
    }    
}
