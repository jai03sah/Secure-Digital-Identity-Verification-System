package com.jai.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.jai.spring.boot.model.User;
import com.jai.spring.boot.repository.UserRepository;

@Service 
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public String register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepository.save(user);
        return "User Registered Successfully";
    }

    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user == null){
            return "User not found";
        }
        if(passwordEncoder.matches(password, user.getPassword())){
            return "Login Successful";
        }
        return "Invalid Password";
    }
}

