package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Sunil Sir Changes is updated
@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "WELCOME TO CSI PUNE";
    }

    @GetMapping("/services")
    public String csiServices()
    {
        return "SOFTWARE DEVELOPMENT";
    }

    @GetMapping("/address")
    public String csiAddress()
    {
        return "INSPIRIA MALL | PUNE | MH | INDIA";
    }
}
