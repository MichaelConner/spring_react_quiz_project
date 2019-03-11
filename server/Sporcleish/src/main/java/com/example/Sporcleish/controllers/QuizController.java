package com.example.Sporcleish.controllers;

import com.example.Sporcleish.models.Quiz;
import com.example.Sporcleish.repositories.QuizRepositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/quizzes")
public class QuizController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping("/{id}")
    public List<Quiz> findQuizById(@PathVariable Long id){
        return quizRepository.getQuizById(id);
    }

    @GetMapping("/categories/{category}")
    public List<Quiz> findQuizByCateogry(@PathVariable String category){
        return quizRepository.getAllQuestionsForCategory(category);
    }

}
