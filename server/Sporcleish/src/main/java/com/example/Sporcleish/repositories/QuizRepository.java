package com.example.Sporcleish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<QuizRepository, Long> {

//    Quiz getQuizByCategory(String category);
//    List<Quiz> getAllQuizzes();

}



