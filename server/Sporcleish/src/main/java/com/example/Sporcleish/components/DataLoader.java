package com.example.Sporcleish.components;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        QuestionAnswer Q1  = new QuestionAnswer("What is the capital of France?");
        questionRepository.save(Q1);
        QuestionAnswer Q2  = new QuestionAnswer("What is the capital of Germany?");
        questionRepository.save(Q2);
        QuestionAnswer Q3  = new QuestionAnswer("What is the capital of Spain?");
        questionRepository.save(Q3);
        QuestionAnswer Q4  = new QuestionAnswer("What is the capital of Secaucus?");
        questionRepository.save(Q4);
    }


}
