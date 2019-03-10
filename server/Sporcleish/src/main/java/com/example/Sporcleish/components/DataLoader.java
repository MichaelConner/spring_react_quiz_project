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
        QuestionAnswer Q1  = new QuestionAnswer("What is the capital of France?", "geography");
        questionRepository.save(Q1);

        QuestionAnswer Q2  = new QuestionAnswer("What is the capital of Spain?", "geography");
        questionRepository.save(Q2);

        QuestionAnswer Q3  = new QuestionAnswer("Which lake is the world's deepest?", "geography");
        questionRepository.save(Q3);

        QuestionAnswer Q4  = new QuestionAnswer("Between which two planets in the solar system does the asteroid belt lie?", "science");
        questionRepository.save(Q4);

        QuestionAnswer Q5  = new QuestionAnswer("The detective C. August Dupin appears in the the murder mystery stories written by which author?", "literature");
        questionRepository.save(Q5);

        QuestionAnswer Q6  = new QuestionAnswer("How many snooker world championship titles has Stephen Hendry won?", "sport");
        questionRepository.save(Q6);
    }


}
