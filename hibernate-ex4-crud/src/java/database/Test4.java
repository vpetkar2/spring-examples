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
public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Object record = session.get(Person.class, 1);
        Person p = (Person)record;
        
        session.delete(p);
        t.commit();
        System.out.println("Record Deleted Successfully.");
        session.close();
        factory.close();
    }
}
