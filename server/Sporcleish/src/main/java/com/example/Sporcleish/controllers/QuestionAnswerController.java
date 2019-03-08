package com.example.Sporcleish.controllers;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/questions")
public class QuestionAnswerController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/{question}")
    public List<QuestionAnswer> findQuestionAnswersById(@PathVariable Long id){
        return questionRepository.findQuestionAnswersById(id);


    }


}
