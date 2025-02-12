package com.neoteric.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HiController {

    @GetMapping("/protected")
    public String sayHi(){
        return "HI";
    }


    @GetMapping("/nonProtected")
    public String nonProtected(){
        return "nonProtected";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/finance")
    public String finance_admin(){
        return "finance_admin";
    }

    @GetMapping("/employee")
    public String emp(){
        return "emp";
    }

}
