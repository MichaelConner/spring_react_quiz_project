package com.example.Sporcleish.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="questions")
public class QuestionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="question")
    private String question;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "quizz_id", nullable = false)
    private Quiz quiz;

    public QuestionAnswer(String question, Quiz quiz) {
        this.question = question;
        this.quiz = quiz;
    }

    public QuestionAnswer(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
