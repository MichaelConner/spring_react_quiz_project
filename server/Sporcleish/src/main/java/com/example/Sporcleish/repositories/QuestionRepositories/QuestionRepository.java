package com.example.Sporcleish.repositories.QuestionRepositories;


import com.example.Sporcleish.models.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<QuestionAnswer, Long>, QuestionRepositoryCustom {

    List<QuestionAnswer> getQuestionAnswerById(Long questionId);
    List<QuestionAnswer> getAllQuestions();
    List<QuestionAnswer> getAllQuestionsForCategory(String category);

}
