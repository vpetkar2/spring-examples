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
public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Object record = session.get(Person.class, 1);
        Person p = (Person)record;
        p.setAge(18);
        p.setName("Babbu");
        session.update(p);
        
        t.commit();
        session.close();
        factory.close();
    }
}
