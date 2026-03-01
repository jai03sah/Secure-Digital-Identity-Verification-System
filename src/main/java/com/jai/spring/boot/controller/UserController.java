package com.jai.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.jai.spring.boot.service.UserService;
import com.jai.spring.boot.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// @RestController 
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping("/")
    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/") 
    public String createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}

