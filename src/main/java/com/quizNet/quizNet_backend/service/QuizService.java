package com.quizNet.quizNet_backend.service;

import com.quizNet.quizNet_backend.model.exam.Category;
import com.quizNet.quizNet_backend.model.exam.Quiz;

import java.util.List;
import java.util.Set;

public interface QuizService {
    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();

    public Quiz getQuiz(Long quizId);
    public void deleteQuiz(Long quizId);
    public List<Quiz> getQuizzesOfCategory(Category category);
    public List<Quiz> getActiveQuizzes();
    public List<Quiz> getActiveQuizzesOfCategory(Category category);
}
