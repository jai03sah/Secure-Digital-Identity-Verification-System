package com.jai.spring.boot.repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}


