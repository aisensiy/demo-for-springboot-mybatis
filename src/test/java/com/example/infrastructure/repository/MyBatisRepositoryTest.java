package com.example.infrastructure.repository;

import com.example.domain.User;
import com.example.domain.UserRepository;
import com.example.domain.infrastructure.repository.MyBatisUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@MybatisTest
@Import(UserRepository.class)
public class MyBatisRepositoryTest {

    @Autowired
    private MyBatisUserRepository userRepository;

    @Test
    public void should_save_user_success() throws Exception {
        User user = new User(UUID.randomUUID().toString(), "abc");
        userRepository.save(user);
    }
}
