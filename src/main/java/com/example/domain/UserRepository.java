package com.example.domain;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    void save(User user);

    Optional<User> findById(String id);
}
