package com.example.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HelloController {
    @GetMapping("/second")
    public String hellow() {
        return "Hello World Called in Second Service";
    }
}
