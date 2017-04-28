package com.example.domain;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    void save(User user);
}
