package org.defascat.goalachievement

import org.defascat.goalachievement.auth.AuthDao;
import org.defascat.goalachievement.auth.AuthDaoBean;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.AbstractModule;
import com.google.inject.servlet.GuiceServletContextListener

class ServiceInjector extends GuiceServletContextListener {
	private static currentInjector = null;
	@Override
	protected Injector getInjector() {
		currentInjector = Guice.createInjector(new AbstractModule() {
			@Override
			protected void configure() {
				bind(AuthService).to(AuthServiceBean);
				bind(AuthDao).to(AuthDaoBean);
			};
		});
		currentInjector
	}
	
	Injector getCurrentInjector() {
		currentInjector
	}
}
