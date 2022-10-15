package com.cf.fromzerotoexpert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/FromZerotoExpert")
    public String index(){
        System.out.println("hello");
        return "index";
    }
}
