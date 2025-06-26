package com.quizNet.quizNet_backend.repo;

import com.quizNet.quizNet_backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
