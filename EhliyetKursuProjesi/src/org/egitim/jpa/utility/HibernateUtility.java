package org.egitim.jpa.utility;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Logger log = Logger.getLogger("org.hibernate");
			log.setLevel(Level.ALL);
			return new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
		} catch (Throwable exception) {
			System.err.println("SessionFactory failed: " + exception);
			throw new ExceptionInInitializerError(exception);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

}
