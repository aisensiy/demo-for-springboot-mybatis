package com.example.domain;

import lombok.Getter;

import java.util.Objects;

@Getter
public class User {
    private String id;
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
