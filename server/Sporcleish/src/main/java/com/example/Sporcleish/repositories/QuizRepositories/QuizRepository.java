package com.example.Sporcleish.repositories.QuizRepositories;

import com.example.Sporcleish.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long>, QuizRepositoryCustom {



}
