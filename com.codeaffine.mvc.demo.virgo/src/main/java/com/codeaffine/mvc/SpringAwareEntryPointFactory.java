package com.codeaffine.mvc;

import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.rwt.lifecycle.IEntryPointFactory;


public class SpringAwareEntryPointFactory implements IEntryPointFactory {

	private IEntryPoint entryPoint;

	public IEntryPoint create() {
		return entryPoint;
	}

	public void setEntryPoint(IEntryPoint entryPoint) {
		this.entryPoint = entryPoint;
	}
}
