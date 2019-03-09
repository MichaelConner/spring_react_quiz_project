package com.example.Sporcleish.repositories;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class QuizRepositoryImpl implements QuizRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Quiz> getAllQuizzes(){
//        List<Quiz> results = null;
//        Session session = entityManager.unwrap(Session.class);
//        try {
//            Criteria cr = session.createCriteria(Quiz.class);
//            results = cr.list();
//
//        } catch (HibernateException ex){
//            ex.printStackTrace();
//        }
//
//
//        return results;
//    }


}
