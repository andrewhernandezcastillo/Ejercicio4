package com.demo.mapper;

import com.demo.dto.response.UserResponse;
import com.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper implements InterfaceUserMapper{
    @Override
    public UserResponse userToUserResponse(User user) {
        return UserResponse.builder()
                .user(user)
                .build();
    }

    @Override
    public UserResponse userToUserResponse(List<User> user) {
        return UserResponse.builder()
                .users(user)
                .build();
    }
}
