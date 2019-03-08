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
    }


}
