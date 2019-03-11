package com.example.Sporcleish.controllers;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/questions")
public class QuestionAnswerController {

    @Autowired
    QuestionRepository questionRepository;


    @GetMapping("/{question_id}")
    public List<QuestionAnswer> findQuestionAnswerById(@PathVariable Long question_id){
        return questionRepository.getQuestionAnswerById(question_id);
    }


}
