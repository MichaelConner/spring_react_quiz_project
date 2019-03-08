package com.example.Sporcleish.repositories;


import com.example.Sporcleish.models.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<QuestionAnswer, Long> {
    List<QuestionAnswer> findQuestionAnswersById(Long questionId);



}
