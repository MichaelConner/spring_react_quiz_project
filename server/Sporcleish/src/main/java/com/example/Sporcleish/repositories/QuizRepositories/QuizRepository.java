package com.example.Sporcleish.repositories.QuizRepositories;

import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long>, QuizRepositoryCustom {

    List<Quiz> getQuizById(Long quiz_id);
    List<Quiz> getAllQuizzes();
    List<QuestionAnswer> getAllQuestionsForQuizID(Long id);
}
