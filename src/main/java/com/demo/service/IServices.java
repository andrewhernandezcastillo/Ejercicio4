package com.demo.service;

import com.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IServices implements Services{
    List<User> users = new ArrayList<>();
    @Override
    public User addUser(User user) {
        users.add(user);
        return users.stream().filter(user1 -> user1.getId().equals(user.getId())).findFirst().get();
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
