package com.quizNet.quizNet_backend.service;

import com.quizNet.quizNet_backend.model.User;
import com.quizNet.quizNet_backend.model.UserRole;

import java.util.Set;

public interface UserService {
    //Creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);
}
