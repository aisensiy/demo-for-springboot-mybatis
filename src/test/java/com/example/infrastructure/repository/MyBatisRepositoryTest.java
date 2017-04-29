package com.example.infrastructure.repository;

import com.example.domain.User;
import com.example.domain.UserRepository;
import com.example.domain.infrastructure.repository.MyBatisUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import java.util.Optional;
import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@MybatisTest
@Import(MyBatisUserRepository.class)
public class MyBatisRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void should_save_user_success() throws Exception {
        User user = new User(UUID.randomUUID().toString(), "abc");
        userRepository.save(user);
        Optional<User> userOptional = userRepository.findById(user.getId());
        assertThat(userOptional.get(), is(user));
    }
}
