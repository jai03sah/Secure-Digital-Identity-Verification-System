package com.jai.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jai.spring.boot.model.User;
import com.jai.spring.boot.service.UserService;

@RestController
@RequestMapping("/users") 
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }
}


