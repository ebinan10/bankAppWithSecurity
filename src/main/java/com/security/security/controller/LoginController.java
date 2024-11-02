package com.security.security.controller;

import com.security.security.model.Users;
import com.security.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public String login(@RequestBody Users user){
         System.out.println(user);
         return service.verify(user);
    }

    @GetMapping("/login")
    public String login(){
        return "i am logged in";
    }
}
