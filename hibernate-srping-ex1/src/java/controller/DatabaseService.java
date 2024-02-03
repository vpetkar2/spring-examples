/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.HibernateUtility;
import database.Person;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

/**
 *
 * @author developer
 */
public class DatabaseService {
    
    public int getMaxId() {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Criteria c = session.createCriteria(Person.class);
        c.setProjection(Projections.max("id"));
        Object record = c.uniqueResult();
        int maxId = 0;
        if (record != null) {
            maxId = (int)record;
        }
        t.commit();
        session.close();
        return maxId;
    }
    
    public void insert(Person p) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        t.commit();
        session.close();
    }
}
