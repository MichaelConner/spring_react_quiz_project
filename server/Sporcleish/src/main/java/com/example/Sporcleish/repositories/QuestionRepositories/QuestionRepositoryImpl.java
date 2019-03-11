package com.example.Sporcleish.repositories.QuestionRepositories;

import com.example.Sporcleish.models.QuestionAnswer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class QuestionRepositoryImpl implements QuestionRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<QuestionAnswer> getAllQuestions(){
        List<QuestionAnswer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(QuestionAnswer.class);
            results = cr.list();

        } catch (HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }

    @Transactional
    public List<QuestionAnswer> getAllQuestionsForCategory(String category){
        List<QuestionAnswer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(QuestionAnswer.class);
            cr.add(Restrictions.eq("category", category));
            results = cr.list();

        } catch (HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }


}
