package org.defascat.goalachievement

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

class EMF {
	private static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("transactions-optional");

	private EMF() {
	}

	static EntityManagerFactory get() {
		emfInstance;
	}
	
	static EntityManager getEntityManager() {
		emfInstance.createEntityManager();	
	}
}
