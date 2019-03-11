package com.example.Sporcleish.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quizzes")
public class Quiz {


    @Column(name="category")
    private String category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonIgnore
    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<QuestionAnswer> questionAnswer;


    public Quiz(String category) {
        this.category = category;
        this.questionAnswer = new ArrayList<>();

    }

    public Quiz() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<QuestionAnswer> getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(List<QuestionAnswer> questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public void addQuestionAnswer(QuestionAnswer qa){
        this.questionAnswer.add(qa);
    }
}
