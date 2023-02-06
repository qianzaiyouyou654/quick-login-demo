package com.liusiqi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLoginController {

    @GetMapping("/test")
    public String testLogin() {
        return "test";
    }

    @GetMapping("/test1")
    public String testLogin1() {
        return "test1";
    }
}
