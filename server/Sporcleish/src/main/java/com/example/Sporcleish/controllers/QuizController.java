package com.example.Sporcleish.controllers;

import com.example.Sporcleish.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value="/quizzes")
public class QuizController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping
    public
}
