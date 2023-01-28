package com.gokul.userservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class HelloWorldController {


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello EveryOne!!";
    }
}
