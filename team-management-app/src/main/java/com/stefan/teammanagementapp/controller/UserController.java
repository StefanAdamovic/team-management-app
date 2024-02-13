package com.stefan.teammanagementapp.controller;

import com.stefan.teammanagementapp.model.user.impl.PasswordUpdateRequest;
import com.stefan.teammanagementapp.model.user.impl.UserRequest;
import com.stefan.teammanagementapp.model.user.impl.UserResponse;
import com.stefan.teammanagementapp.model.user.impl.UsersPageResponse;
import org.springframework.http.ResponseEntity;

public interface UserController {

    ResponseEntity<UserResponse> createUser(UserRequest userDtoRequest);

    ResponseEntity<UserResponse> getUserById(Long userId);

    ResponseEntity<UsersPageResponse> getAllUsers();

    ResponseEntity<UserResponse> updateUser(Long userId, UserRequest userDtoRequest);

    ResponseEntity<UserResponse> deleteUser(Long userId);

    ResponseEntity<UserResponse> updatePassword(Long userId, PasswordUpdateRequest passwordUpdateRequest);
    
}
