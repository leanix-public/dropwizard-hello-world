package org.example.core.service;

import org.example.db.domain.User;

import javax.inject.Inject;

public class UserServiceImpl implements UserService {

    @Inject
    public UserServiceImpl() {
    }

    @Override
    public User getUser() {
        return User.builder()
                .fName("Alfredo")
                .lName("Faria")
                .build();
    }
}
