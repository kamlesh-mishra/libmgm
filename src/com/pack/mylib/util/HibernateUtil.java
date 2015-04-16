package com.pack.mylib.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static 
    {
        try 
        {
        	Configuration configuration = new AnnotationConfiguration().configure(".//hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        } 
        catch (Throwable ex) 
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
}
