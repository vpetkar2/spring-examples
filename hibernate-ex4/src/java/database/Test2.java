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
public class Test2 {
    
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        Object record = session.get(Person.class, 1);
        Person p = (Person)record;
        System.out.println("Id = " + p.getId());
        System.out.println("Name = " + p.getName());
        System.out.println("Age = " + p.getAge());
        System.out.println("Phone = " + p.getPhone());
        System.out.println("Class = " + p.getClass());
        
        t.commit();
        session.close();
        factory.close();
    }
}
