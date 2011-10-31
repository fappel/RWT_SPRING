package com.codeaffine.mvc;

import org.eclipse.rwt.application.ApplicationConfiguration;
import org.eclipse.rwt.application.ApplicationConfiguration.OperationMode;
import org.eclipse.rwt.application.ApplicationConfigurator;

public class SpringAwareConfigurator implements ApplicationConfigurator {

	private SpringAwareEntryPointFactory entryPointfactory;

	public void setEntryPointfactory(SpringAwareEntryPointFactory entryPointfactory) {
		this.entryPointfactory = entryPointfactory;
	}

	public void configure(ApplicationConfiguration configuration) {
		configuration.addEntryPoint("default", entryPointfactory );
		configuration.setOperationMode(OperationMode.JEE_COMPATIBILITY );
	}
}
