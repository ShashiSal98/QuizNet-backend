package com.quizNet.quizNet_backend.service.impl;

import com.quizNet.quizNet_backend.model.User;
import com.quizNet.quizNet_backend.model.UserRole;
import com.quizNet.quizNet_backend.repo.RoleRepository;
import com.quizNet.quizNet_backend.repo.UserRepository;
import com.quizNet.quizNet_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //Creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local!=null)
        {
            System.out.println("User is already exits");
            throw new Exception("User already present!!");
        } else {
            //user create
            for (UserRole ur: userRoles)
            {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local=this.userRepository.save(user);
        }
        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }
}
