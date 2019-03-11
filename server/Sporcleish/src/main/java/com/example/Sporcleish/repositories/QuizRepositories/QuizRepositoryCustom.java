package com.example.Sporcleish.repositories.QuizRepositories;

import com.example.Sporcleish.models.Quiz;

import java.util.List;

public interface QuizRepositoryCustom {

    List<Quiz> getAllQuestionsForCategory(String category);

}
