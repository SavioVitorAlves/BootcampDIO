package com.example.login_auth_api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login_auth_api.domain.users.user;

public interface UserRepository  extends JpaRepository <user, String>{
    Optional<user> findByEmail(String email);
}
