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
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author developer
 */
public class Test5 {
    public static void main(String[] args) {
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Criteria c1 = session.createCriteria(Person.class);
        List recordlist = c1.list();
        for(Object ele: recordlist) {
            Person p = (Person)ele;
            System.out.println("Ele = " + p.getId() + " - " + p.getName() + " - " + p.getAge() + " - " + p.getPhone());
        }
        t.commit();
        session.close();
        factory.close();
        
        Restrictions.gt("age", 25);
    }
}
