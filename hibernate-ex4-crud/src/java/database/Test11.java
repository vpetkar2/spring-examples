/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author developer
 */
public class Test11 {
    public static void main(String[] args) {
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Criteria c = session.createCriteria(Person.class);
        c.setProjection(Projections.max("age"));
        
        Object record = c.uniqueResult();
        
        int maxage = (int)record;
        System.out.println("Max Age = " + maxage);

        t.commit();
        session.close();
        factory.close();
    }
}