package com.example.Sporcleish.repositories.QuizRepositories;

import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.models.Quiz;

import java.util.List;

public interface QuizRepositoryCustom {

    List<QuestionAnswer> getAllQuestionsForQuizID(Long id);
    List<Quiz> getAllQuizzes();

}
