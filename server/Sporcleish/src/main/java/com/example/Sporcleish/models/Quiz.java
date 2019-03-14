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

    @Column(name="difficulty")
    private double difficulty;

    @Column(name="imgurl")
    private String imgurl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonIgnore
    @OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<QuestionAnswer> questionAnswer;


    public Quiz(String category, String imgurl) {
        this.category = category;
        this.questionAnswer = new ArrayList<>();
        this.difficulty = 0.5;

        if (imgurl.isEmpty()){
            this.imgurl = "General";
        } else {
            this.imgurl = imgurl;
        }

    }


    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
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

    public void setDifficulty(){
        double totalCorrect = 0;
        double totalAttempted = 0;
        for(QuestionAnswer question: this.questionAnswer){
            totalCorrect += (double) question.getCorrect();
            totalAttempted += (double) question.getAttempted();
        }
        this.difficulty =  1- totalCorrect/totalAttempted;
    }

    public double getDifficulty() {
        return difficulty;
    }
}
