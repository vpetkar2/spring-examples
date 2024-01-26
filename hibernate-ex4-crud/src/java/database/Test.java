/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author developer
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Person p = new Person(7, "Raju", 28, "1234567890");
        session.save(p);
        
        t.commit();
        session.close();
        factory.close();
    }
}
