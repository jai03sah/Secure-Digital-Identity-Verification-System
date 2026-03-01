package com.jai.spring.boot.service;

import org.springframework.stereotype.Service;
import com.jai.spring.boot.model.User;

@Service
public class UserService {

    public User getUser(){
        return new User("jai", 23);
    }
    
    public String saveUser(User user){
        return "saved user :" + user.getName();
    }

}
