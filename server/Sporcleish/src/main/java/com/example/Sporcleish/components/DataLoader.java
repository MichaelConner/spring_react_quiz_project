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

        Quiz quiz1 = new Quiz("Geography");
        quizRepository.save(quiz1);

        Quiz quiz2 = new Quiz("Politics");
        quizRepository.save(quiz2);

        Quiz quiz3 = new Quiz("Science");
        quizRepository.save(quiz3);

        Quiz quiz4 = new Quiz("Science/Animals");
        quizRepository.save(quiz4);

        Quiz quiz5 = new Quiz("Music");
        quizRepository.save(quiz5);

        Quiz quiz6 = new Quiz("History");
        quizRepository.save(quiz6);

        Quiz quiz7 = new Quiz("The Simpsons");
        quizRepository.save(quiz7);

        Quiz quiz8 = new Quiz("Disney");
        quizRepository.save(quiz8);

        Quiz quiz9 = new Quiz("Sports");
        quizRepository.save(quiz9);

        Quiz quiz10 = new Quiz("Books");
        quizRepository.save(quiz10);

        Quiz quiz11 = new Quiz("Kids");
        quizRepository.save(quiz11);

        Quiz quiz12 = new Quiz("Actors and Actresses");
        quizRepository.save(quiz12);










        QuestionAnswer Q1  = new QuestionAnswer("What is the capital of France?", "Paris",quiz1);
        questionRepository.save(Q1);

        QuestionAnswer Q2  = new QuestionAnswer("What is the capital of Spain?", "Madrid",quiz1);
        questionRepository.save(Q2);

        QuestionAnswer Q3  = new QuestionAnswer("Which lake is the world's deepest?", "Baikal",quiz1);
        questionRepository.save(Q3);

        QuestionAnswer Q4  = new QuestionAnswer("Which moon is the largest moon of Jupiter?", "Ganymede",quiz3);
        questionRepository.save(Q4);

        QuestionAnswer Q5  = new QuestionAnswer("At what speed does light travel (to the nearest thousand mph)?", "186000", quiz3);
        questionRepository.save(Q5);

        QuestionAnswer Q6  = new QuestionAnswer("Ophidiophobia is the fear of which animal?", "snake", quiz3);
        questionRepository.save(Q6);

        QuestionAnswer Q7  = new QuestionAnswer("Born in Giffnock, Scotland in 1951, who served as UK Prime Minister between 2007 and 2010?", "Gordon Brown", quiz2);
        questionRepository.save(Q7);

        QuestionAnswer Q8  = new QuestionAnswer("A choral balm inn is an anagram of the name of which US president?", "Abraham Lincoln", quiz2);
        questionRepository.save(Q8);

        QuestionAnswer Q9  = new QuestionAnswer("Who served as the first president of Zimbabwe?", "Canaan Banana", quiz2);
        questionRepository.save(Q9);

        QuestionAnswer Q10 = new QuestionAnswer("The Cottontop tamarin is what type of animal?", "Monkey", quiz4);
        questionRepository.save(Q10);

        QuestionAnswer Q11 = new QuestionAnswer("What is the collective name for a group of Crows?", "A Murder", quiz4);
        questionRepository.save(Q11);

        QuestionAnswer Q12 = new QuestionAnswer("The horns of a goat are made out of what substance?", " Keratin", quiz4);
        questionRepository.save(Q12);

        QuestionAnswer Q13 = new QuestionAnswer("Which female vocalist performed 'The Star-Spangled Banner' at the 2018 NFL Superbowl?", " Pink", quiz5);
        questionRepository.save(Q13);

        QuestionAnswer Q14 = new QuestionAnswer("In which year did The Beatles release 'Hey Jude'?", " 1968", quiz5);
        questionRepository.save(Q14);

        QuestionAnswer Q15 = new QuestionAnswer("Which female vocalist won three Ivor Novello Awards including Best Contemporary Song for 'Stronger Than Me' in 2004?", "Amy Winehouse", quiz5);
        questionRepository.save(Q15);

        QuestionAnswer Q16 = new QuestionAnswer("Edward VI deposed his cousin Henry VI in 1461 during which wars?", "Wars of the Roses", quiz6);
        questionRepository.save(Q16);

        QuestionAnswer Q17 = new QuestionAnswer("In January 1777 which American General defeated the British General Cornwallis at the battle of Princeton?", " General George Washington", quiz6);
        questionRepository.save(Q17);

        QuestionAnswer Q18 = new QuestionAnswer("In 1536 which English Queen was arrested and imprisoned on charges of adultery, incest, treason and witchcraft.", "Anne Boleyn", quiz6);
        questionRepository.save(Q18);

        QuestionAnswer Q19 = new QuestionAnswer("What is the name of Bart's graffiti-tagging alter-ego?", "El Barto", quiz7);
        questionRepository.save(Q19);

        QuestionAnswer Q20 = new QuestionAnswer("True or false: Bart is the only one of the 5 main Simpsons characters not named after someone in creator Matt Groening's family?", "True", quiz7);
        questionRepository.save(Q20);

        QuestionAnswer Q21 = new QuestionAnswer("What is Bart's first name short for?", "Bartholomew", quiz7);
        questionRepository.save(Q21);

        QuestionAnswer Q22 = new QuestionAnswer("In the film Frozen, who played the voice of Anna?", "Kristen Bell", quiz8);
        questionRepository.save(Q22);

        QuestionAnswer Q23 = new QuestionAnswer("Which Disney film is set in Scotland and has Billy Connolly as the voiuce of Fergus?", "Brave", quiz8);
        questionRepository.save(Q23);

        QuestionAnswer Q24 = new QuestionAnswer("In Toy Story, who provides the voice of Buzz Lightyear?", "Tim Allen", quiz8);
        questionRepository.save(Q24);

        QuestionAnswer Q25 = new QuestionAnswer("Which British athlete won gold in both the 5,000 and 10,000 Summer Olympics in 2016?", "Mo Farah", quiz9);
        questionRepository.save(Q25);

        QuestionAnswer Q26 = new QuestionAnswer("In which British city would you find the Alexander Stadium athletics track at Perry Barr?", "Birmingham", quiz9);
        questionRepository.save(Q26);

        QuestionAnswer Q27 = new QuestionAnswer("Bob and Mike Bryan were well known brothers in which sport?", "Tennis", quiz9);
        questionRepository.save(Q27);

        QuestionAnswer Q28 = new QuestionAnswer("Which eponymous Jane Austen novel has amongst its characters George Knightly and Jane Fairfax?", "Emma", quiz10);
        questionRepository.save(Q28);

        QuestionAnswer Q29 = new QuestionAnswer("In which Dickens novel do the characters of Mr Jaggers and Abel Magwitch appear?", "Great Expectations", quiz10);
        questionRepository.save(Q29);

        QuestionAnswer Q30 = new QuestionAnswer("Dorothea Brooke is a major character in which book by George Eliot?", "Middlemarch", quiz10);
        questionRepository.save(Q30);

        QuestionAnswer Q31 = new QuestionAnswer("Which British children's sketch comedy television series, based on the books written by Terry Deary has a black rat puppet 'host' called Rattus Rattus?", "Horrible Histories", quiz11);
        questionRepository.save(Q31);

        QuestionAnswer Q32 = new QuestionAnswer("In the film Frozen, who is Olaf?", "A Snowman", quiz11);
        questionRepository.save(Q32);

        QuestionAnswer Q33 = new QuestionAnswer("In Dennis the Menace, who is Dennis's main rival?", "Walter", quiz11);
        questionRepository.save(Q33);

        QuestionAnswer Q34 = new QuestionAnswer("British actress who starred alongside Tom Cruise in The Edge of Tomorrow and played Queen Victoria in the film The Young Victoria.", "Emily Blunt", quiz12);
        questionRepository.save(Q34);

        QuestionAnswer Q35 = new QuestionAnswer("Uma Thurman is famous for playing 'The Bride' in this tale of murder and revenge from 2003.", "Kill Bill Vol1", quiz12);
        questionRepository.save(Q35);

        QuestionAnswer Q36 = new QuestionAnswer("Never Say Never Again was the final James Bond appearance for which actor?", "Sean Connery", quiz12);
        questionRepository.save(Q36);





        quiz1.addQuestionAnswer(Q1);
        quiz1.addQuestionAnswer(Q2);
        quiz1.addQuestionAnswer(Q3);
        quiz2.addQuestionAnswer(Q4);
        quiz2.addQuestionAnswer(Q5);
        quiz2.addQuestionAnswer(Q6);
        quiz3.addQuestionAnswer(Q7);
        quiz3.addQuestionAnswer(Q8);
        quiz3.addQuestionAnswer(Q9);
        quiz4.addQuestionAnswer(Q10);
        quiz4.addQuestionAnswer(Q11);
        quiz4.addQuestionAnswer(Q12);
        quiz5.addQuestionAnswer(Q13);
        quiz5.addQuestionAnswer(Q14);
        quiz5.addQuestionAnswer(Q15);
        quiz6.addQuestionAnswer(Q17);
        quiz6.addQuestionAnswer(Q18);
        quiz6.addQuestionAnswer(Q19);
        quiz7.addQuestionAnswer(Q20);
        quiz7.addQuestionAnswer(Q21);
        quiz7.addQuestionAnswer(Q22);
        quiz8.addQuestionAnswer(Q23);
        quiz8.addQuestionAnswer(Q24);
        quiz8.addQuestionAnswer(Q25);
        quiz9.addQuestionAnswer(Q26);
        quiz9.addQuestionAnswer(Q27);
        quiz9.addQuestionAnswer(Q27);
        quiz10.addQuestionAnswer(Q28);
        quiz10.addQuestionAnswer(Q29);
        quiz10.addQuestionAnswer(Q30);
        quiz11.addQuestionAnswer(Q31);
        quiz11.addQuestionAnswer(Q32);
        quiz11.addQuestionAnswer(Q33);
        quiz12.addQuestionAnswer(Q34);
        quiz12.addQuestionAnswer(Q35);
        quiz12.addQuestionAnswer(Q36);







    }

}
