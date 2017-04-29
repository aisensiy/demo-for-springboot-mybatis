package com.example.domain.infrastructure.repository;

import com.example.domain.User;
import com.example.domain.UserRepository;
import com.example.domain.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MyBatisUserRepository implements UserRepository {
    @Autowired
    private UserMapper mapper;

    @Override
    public void save(User user) {
        mapper.insert(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(mapper.findById(id));
    }
}
