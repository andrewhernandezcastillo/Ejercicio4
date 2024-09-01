package com.demo.controller;

import com.demo.dto.response.UserResponse;
import com.demo.mapper.InterfaceUserMapper;
import com.demo.model.User;
import com.demo.service.Services;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class RestApi {

    private final Services services;
    private final InterfaceUserMapper interfaceUserMapper;

    @GetMapping("api/v1")
    public UserResponse getAll() {
        return interfaceUserMapper.userToUserResponse(services.getAllUsers());
    }

    @PostMapping("api/v1")
    public UserResponse add(@Valid @RequestBody User user) {
        return interfaceUserMapper.userToUserResponse(services.addUser(user));
    }

}