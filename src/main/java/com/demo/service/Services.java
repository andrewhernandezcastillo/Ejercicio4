package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface Services {

    User addUser(User user);
    List<User> getAllUsers();

}
