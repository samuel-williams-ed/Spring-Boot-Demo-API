package com.example.demo.grouce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrouceController {

    @GetMapping
    public String getHome(){
        return "Welcome";
    }
}
