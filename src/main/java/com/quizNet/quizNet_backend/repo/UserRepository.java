package com.quizNet.quizNet_backend.repo;

import com.quizNet.quizNet_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);
}