package com.codeaffine.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.eclipse.rwt.application.Application;
import org.eclipse.rwt.application.ApplicationConfigurator;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringRWTServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		ApplicationConfigurator configurator = springContext.getBean( ApplicationConfigurator.class );
	    Application application = new Application( configurator, sce.getServletContext() );
	    application.start();
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
