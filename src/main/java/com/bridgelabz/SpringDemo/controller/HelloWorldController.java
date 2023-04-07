package com.bridgelabz.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/Vinayak")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }
}
