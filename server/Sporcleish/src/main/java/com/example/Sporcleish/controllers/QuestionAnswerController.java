package com.example.Sporcleish.controllers;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/categories/{category}")
    public List<QuestionAnswer> findQuestionAnswersByCategory(@PathVariable String category){
        return questionRepository.getAllQuestionsForCategory(category);

    }

    @GetMapping
    public List<QuestionAnswer> getAllQuestions(){
        return questionRepository.findAll();
    }

    @DeleteMapping("/{question_id}")
    public void deleteById(@PathVariable Long question_id){
        questionRepository.deleteById(question_id);
    }

    @PostMapping
    public void addNewQuestion(QuestionAnswer question){
        questionRepository.save(question);
    }
    
}
