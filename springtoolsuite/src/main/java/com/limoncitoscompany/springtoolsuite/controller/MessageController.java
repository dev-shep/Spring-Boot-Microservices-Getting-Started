package com.limoncitoscompany.springtoolsuite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MessageController {
    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }


    @GetMapping("/hello")
    public String helloMsg() {
        return "helloPage";
    }
    
    @GetMapping("/start")
    public String startMsg() {
        return "startPage";
    }
    
}
