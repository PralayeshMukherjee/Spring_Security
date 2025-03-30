package com.security.SpringSecurityDemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello Raj";
    }
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userLogin(){
        return "Hello, User";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminLogin(){
        return "Hello, Admin";
    }
}
