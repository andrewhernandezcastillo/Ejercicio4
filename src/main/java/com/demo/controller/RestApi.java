package com.demo.controller;

import com.demo.dto.response.UserResponse;
import com.demo.model.User;
import com.demo.service.Services;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApi {

    private final Services services;

    @GetMapping("api/v1")
    public UserResponse getAll() {
        return userToUserResponse(services.getAllUsers());
    }

    @PostMapping("api/v1")
    public UserResponse add(@Valid @RequestBody User user) {
        return userToUserResponse(services.addUser(user));
    }

    private UserResponse userToUserResponse(User user) {
        return UserResponse.builder()
                .message("Operacion exitosa")
                .user(user)
                .build();
    }
    private UserResponse userToUserResponse(List<User> user) {
        return UserResponse.builder()
                .message("Operacion exitosa")
                .users(user)
                .build();
    }
}