package com.geolocation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geolocation.api.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
