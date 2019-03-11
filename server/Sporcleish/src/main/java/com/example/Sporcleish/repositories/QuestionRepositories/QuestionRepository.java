package com.example.Sporcleish.repositories.QuestionRepositories;


import com.example.Sporcleish.models.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
<<<<<<< HEAD:server/Sporcleish/src/main/java/com/example/Sporcleish/repositories/QuestionRepository.java
public interface QuestionRepository extends JpaRepository<QuestionAnswer, Long> {
=======
public interface QuestionRepository extends JpaRepository<QuestionAnswer, Long>, QuestionRepositoryCustom {
>>>>>>> develop:server/Sporcleish/src/main/java/com/example/Sporcleish/repositories/QuestionRepositories/QuestionRepository.java

    List<QuestionAnswer> getQuestionAnswerById(Long questionId);
    List<QuestionAnswer> getAllQuestions();
    List<QuestionAnswer> getAllQuestionsForCategory(String category);

}

