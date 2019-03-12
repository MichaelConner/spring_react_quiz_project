package com.example.Sporcleish.controllers;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.repositories.QuestionRepositories.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/questions")
public class QuestionAnswerController {

    @Autowired
    QuestionAnswerRepository questionAnswerRepository;


    @GetMapping("/{question_id}")
    public List<QuestionAnswer> findQuestionAnswerById(@PathVariable Long question_id){
        return questionAnswerRepository.getQuestionAnswerById(question_id);
    }

    @GetMapping("/categories/{category}")
    public List<QuestionAnswer> findQuestionAnswersByCategory(@PathVariable String category){
        return questionAnswerRepository.getAllQuestionsForCategory(category);

    }

    @GetMapping
    public List<QuestionAnswer> getAllQuestions(){
        return questionAnswerRepository.findAll();
    }

    @DeleteMapping("/{question_id}")
    public void deleteById(@PathVariable Long question_id){
        questionAnswerRepository.deleteById(question_id);
    }

    @PostMapping
    public void addNewQuestion(@RequestBody QuestionAnswer question){
        questionAnswerRepository.save(question);
    }

}
