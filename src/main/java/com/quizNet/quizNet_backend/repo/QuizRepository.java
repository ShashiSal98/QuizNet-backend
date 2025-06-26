package com.quizNet.quizNet_backend.repo;

import com.quizNet.quizNet_backend.model.exam.Category;
import com.quizNet.quizNet_backend.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    public List<Quiz> findBycategory(Category category);

    public List<Quiz> findByactive(Boolean b);

    public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
}
