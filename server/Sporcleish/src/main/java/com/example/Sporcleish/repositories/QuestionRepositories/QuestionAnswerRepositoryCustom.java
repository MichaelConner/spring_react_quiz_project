package com.example.Sporcleish.repositories.QuestionRepositories;

import com.example.Sporcleish.models.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerRepositoryCustom {

    List<QuestionAnswer> getAllQuestions();
    List<QuestionAnswer> getAllQuestionsForCategory(String category);

}
