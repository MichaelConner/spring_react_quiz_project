package com.example.Sporcleish.components;


import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.models.Quiz;
import com.example.Sporcleish.repositories.QuestionRepositories.QuestionRepository;
import com.example.Sporcleish.repositories.QuizRepositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    QuizRepository quizRepository;


    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Quiz quiz1 = new Quiz("geography");
        quizRepository.save(quiz1);

        Quiz quiz2 = new Quiz("politics");
        quizRepository.save(quiz2);

        Quiz quiz3 = new Quiz("science");
        quizRepository.save(quiz3);



        QuestionAnswer Q1  = new QuestionAnswer("What is the capital of France?", "Paris",quiz1);
        questionRepository.save(Q1);

        QuestionAnswer Q2  = new QuestionAnswer("What is the capital of Spain?", "Madrid",quiz1);
        questionRepository.save(Q2);

        QuestionAnswer Q3  = new QuestionAnswer("Which lake is the world's deepest?", "Baikal",quiz1);
        questionRepository.save(Q3);

        QuestionAnswer Q4  = new QuestionAnswer("Which moon is the largest moon of Jupiter?", "Ganymede",quiz2);
        questionRepository.save(Q4);

        QuestionAnswer Q5  = new QuestionAnswer("At what speed does light travel (to the nearest thousand mph)?", "186000", quiz2);
        questionRepository.save(Q5);

        QuestionAnswer Q6  = new QuestionAnswer("Ophidiophobia is the fear of which animal?", "snake", quiz2);
        questionRepository.save(Q6);

        QuestionAnswer Q7  = new QuestionAnswer("Born in Giffnock, Scotland in 1951, who served as UK Prime Minister between 2007 and 2010?", "Gordon Brown", quiz3);
        questionRepository.save(Q7);

        QuestionAnswer Q8  = new QuestionAnswer("A choral balm inn is an anagram of the name of which US president?", "Abraham Lincoln", quiz3);
        questionRepository.save(Q8);

        QuestionAnswer Q9  = new QuestionAnswer("Who served as the first president of Zimbabwe?", "Canaan Banana", quiz3);
        questionRepository.save(Q9);

        quiz1.addQuestionAnswer(Q1);
        quiz1.addQuestionAnswer(Q2);
        quiz1.addQuestionAnswer(Q3);
        quiz2.addQuestionAnswer(Q4);
        quiz2.addQuestionAnswer(Q5);
        quiz2.addQuestionAnswer(Q6);
        quiz3.addQuestionAnswer(Q7);
        quiz3.addQuestionAnswer(Q8);
        quiz3.addQuestionAnswer(Q9);


    }

}
