package com.quizNet.quizNet_backend.repo;
import com.quizNet.quizNet_backend.model.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
