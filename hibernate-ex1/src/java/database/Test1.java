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
public class Test1 {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("In Main..");
            SessionFactory factory = HibernateUtility.getSessionFactory();
            Session session = factory.openSession();
            Transaction t = session.beginTransaction();

            Person p = new Person(3, "Raju", 23, "1234567890");
            session.save(p);

            t.commit();
            session.close();
            factory.close();
        }
        catch(Exception e) {
            System.out.println("E="+e);
        }
    }
}
