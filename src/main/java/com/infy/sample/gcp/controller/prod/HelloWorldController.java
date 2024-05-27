package com.infy.sample.gcp.controller.prod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Sample test!";
    }
}
