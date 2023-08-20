package com.example.demo.grouce.controller;

import com.example.demo.grouce.services.GrouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/")
public class GrouceController {

    private final GrouceService grouceService;

    @Autowired
    public GrouceController(GrouceService grouceService) {
        this.grouceService = grouceService;
    }

    @GetMapping
    public String getHome(){
        return grouceService.getHome();
    }
}
