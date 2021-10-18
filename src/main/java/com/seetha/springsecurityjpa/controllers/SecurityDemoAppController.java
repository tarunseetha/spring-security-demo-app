package com.seetha.springsecurityjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoAppController {

    @GetMapping("/")
    public String home() {
        return "Welcome Home !!";
    }

    @GetMapping("/user")
    public String showUserHome() {
        return "Welcome User :)";
    }

    @GetMapping("/admin")
    public String showAdminHome() {
        return "Welcome Admin :)";
    }
}
