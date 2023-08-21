package com.example.demo.grouce.services;

import org.springframework.stereotype.Service;

// @Component
@Service
public class GrouceService {

    public String getHome(){
        return "Welcome";
    }

    public String getDefault() { return "Page Loaded Successfully"; }
}
