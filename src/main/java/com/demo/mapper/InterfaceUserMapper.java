package com.demo.mapper;

import com.demo.dto.response.UserResponse;
import com.demo.model.User;

import java.util.List;

public interface InterfaceUserMapper {

    UserResponse userToUserResponse(User user);

    UserResponse userToUserResponse(List<User> user);
}
