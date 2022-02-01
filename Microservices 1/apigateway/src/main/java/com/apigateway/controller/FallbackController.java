package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        System.out.println("SERVER DOWN");
        return "user service is down!!";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        System.out.println("SERVER DOWN");
        return "contact service is down!!";
    }
}
