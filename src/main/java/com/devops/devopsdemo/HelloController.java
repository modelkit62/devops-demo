package com.devops.devopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value="/hello")
    public String hello() {
        return "Hello World!";
    }
}