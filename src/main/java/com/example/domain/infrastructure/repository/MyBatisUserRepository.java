package com.example.domain.infrastructure.repository;

import com.example.domain.User;
import com.example.domain.UserRepository;
import com.example.domain.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyBatisUserRepository implements UserRepository {
    @Autowired
    private UserMapper mapper;

    @Override
    public void save(User user) {

    }
}
