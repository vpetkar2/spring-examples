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
    
    public Person selectRecord(int id) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Object record = session.get(Person.class, id);
        Person p = (Person)record;
        t.commit();
        session.close();
        return p;
    }
    
    public void insertRecord(Person p) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.save(p);
        t.commit();
        session.close();
    }
    
    public void updateRecord(int id, String name, int age, String phone) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        Object record = session.get(Person.class, id);
        Person p = (Person)record;
        p.setAge(age);
        p.setName(name);
        p.setPhone(phone);
        session.update(p);
        t.commit();
        session.close();
    }
    
    public void deleteRecord(Person p) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.delete(p);
        t.commit();
        session.close();
    }
}
