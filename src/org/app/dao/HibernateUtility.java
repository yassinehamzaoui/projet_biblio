package org.app.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory sessionFactory;
	
	private HibernateUtility()
	{
		
	}
	
	public static synchronized SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(org.app.beans.Etudiant.class);
			configuration.addAnnotatedClass(org.app.beans.Professeur.class);
			configuration.addAnnotatedClass(org.app.beans.Administrateur.class);
			configuration.addAnnotatedClass(org.app.beans.Livre.class);
			configuration.addAnnotatedClass(org.app.beans.News.class);
			configuration.addAnnotatedClass(org.app.beans.User.class);
			
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

    				.applySettings(configuration.getProperties());
			
			sessionFactory = configuration.buildSessionFactory(builder.build());
			
		}
		return sessionFactory;
	}

}
