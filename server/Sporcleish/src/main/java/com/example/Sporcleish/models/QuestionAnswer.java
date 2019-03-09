package com.example.Sporcleish.models;


import javax.persistence.*;

@Entity
@Table(name="questions")
public class QuestionAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="question")
    private String question;

    @Column(name="cateogry")
    private String category;

    public QuestionAnswer(String question, String category) {
        this.question = question;
        this.category = category;
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


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
