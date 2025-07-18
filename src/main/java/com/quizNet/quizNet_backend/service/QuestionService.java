package com.quizNet.quizNet_backend.service;

import com.quizNet.quizNet_backend.model.exam.Question;
import com.quizNet.quizNet_backend.model.exam.Quiz;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public Set<Question> getQuestionsOfQuiz(Quiz quiz);

    public void  deleteQuestion(Long quesId);

}

