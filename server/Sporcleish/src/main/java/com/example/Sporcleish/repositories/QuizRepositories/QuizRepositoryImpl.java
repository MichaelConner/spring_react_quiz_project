package com.example.Sporcleish.repositories.QuizRepositories;

import com.example.Sporcleish.models.QuestionAnswer;
import com.example.Sporcleish.models.Quiz;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class QuizRepositoryImpl implements QuizRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Quiz> getAllQuizzes(){
        List<Quiz> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Quiz.class);
            results = cr.list();

        } catch (HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }

    @Transactional
    public List<QuestionAnswer> getAllQuestionsForQuizID(Long id){
        List<QuestionAnswer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(QuestionAnswer.class);
            cr.add(Restrictions.eq("quiz.id", id));
            results = cr.list();

        } catch (HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }
    


}
