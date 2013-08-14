package org.defascat.goalachievement

class BasicDaoBean {
	def executeQuery(String query, def processResults) {
		def em = EMF.entityManager;
		try {
			def nativeQuery = em.createQuery(query);
			nativeQuery.setMaxResults(1);
			processResults(nativeQuery.resultList)
		} finally {
			em.close();
		}
	}
}
