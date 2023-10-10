package com.example.demo.grouce.services;

import org.springframework.stereotype.Service;

// @Component
@Service
public class GrouceService {

    public String getHome(){
        return "Welcome to the Homepage! Try url 'localhost:8080/api/v1/1' ";
    }

    public String getFirst(){
        return "First piece of data";
    }

    public String getSecond(){
        return "Second piece of data.";
    }

    public String getThird(){
        return "Third piece of data";
    }
}
