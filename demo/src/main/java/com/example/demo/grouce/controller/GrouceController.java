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

    @GetMapping(path = "1")
    public String getFirst(){
        return grouceService.getFirst();
    }

    @GetMapping(path = "2")
    public String getSecond(){
        return grouceService.getSecond();
    }

    @GetMapping(path = "3")
    public String getThird(){
        return grouceService.getThird();
    }
}
