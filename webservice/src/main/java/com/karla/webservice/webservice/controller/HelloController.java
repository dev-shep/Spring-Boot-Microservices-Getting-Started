package com.karla.webservice.webservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "This is the main page";
    }
    

    @GetMapping("/welcome")    public String welcome() {
        return "welcome to spring boot";
    }

    @GetMapping("/hello")    public String hello() {
        return "Hello springboot";
    }
}   
