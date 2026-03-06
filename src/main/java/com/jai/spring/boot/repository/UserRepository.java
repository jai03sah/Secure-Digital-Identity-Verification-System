package com.jai.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jai.spring.boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}