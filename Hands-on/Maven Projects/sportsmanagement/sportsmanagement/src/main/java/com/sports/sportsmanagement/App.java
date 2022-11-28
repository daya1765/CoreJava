package com.sports.sportsmanagement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Sports.class);
 
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
 
        // Initialize Session Object
        Session session = sessionFactory.openSession();
 
        Sports sp = new Sports();
 
        sp.setId(1);
        sp.setPlayerName("Virat Kohli");
        sp.setGameName("Cricket");
        
        Sports sp2 = new Sports();
        sp2.setId(119);
        sp2.setPlayerName("Sachin");
        sp2.setGameName("Cricket");
        
        Sports sp3 = new Sports();
        
        sp3.setId(121);
        sp3.setPlayerName("Ronaldo");
        sp3.setGameName("Football");
        
 
        session.beginTransaction();
 
        // Here we have used
        // save() method of JPA
        session.save(sp);
        session.save(sp2);
        session.save(sp3);
 
        session.getTransaction().commit();
    }
    
}
