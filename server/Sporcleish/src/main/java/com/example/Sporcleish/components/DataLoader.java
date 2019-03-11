package com.example.Sporcleish.components;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.models.Quiz;
import com.example.Sporcleish.repositories.QuestionRepositories.QuestionRepository;
import com.example.Sporcleish.repositories.QuizRepositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;
    QuizRepository quizRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
       Quiz quiz = new Quiz("Geography");
       quizRepository.save(quiz);


       QuestionAnswer Q1  = new QuestionAnswer("What is the capital of France?", quiz);
        questionRepository.save(Q1);

        QuestionAnswer Q2  = new QuestionAnswer("What is the capital of Spain?", quiz);
        questionRepository.save(Q2);

    }

}
