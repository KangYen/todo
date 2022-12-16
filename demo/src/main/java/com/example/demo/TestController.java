package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class TestController {
    @GetMapping("/")
    public String HelloWorld(){
        return "To-do Application !";
    }
}
