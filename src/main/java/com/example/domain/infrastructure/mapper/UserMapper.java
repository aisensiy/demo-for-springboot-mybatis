package com.example.domain.infrastructure.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    void insert(@Param("user") User user);

    User findById(@Param("id") String id);
}
