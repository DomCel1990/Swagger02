package com.example.swagger.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultMessage {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping
    public String getMessage(){
        return "Welcome in my localhost: " + serverPort;
    }
}
