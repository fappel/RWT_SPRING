package com.codeaffine.mvc;

import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SpringAwareEntryPoint implements IEntryPoint {

	static int count;
    int localCount;
    
	public void init() {
		count++;
		localCount++;
	}
	
	public int createUI() {
		System.out.println( count );
		System.out.println( localCount );
		
		Display display = new Display();
		Shell shell = new Shell(display, SWT.INHERIT_DEFAULT );
		shell.setLayout( new FillLayout() );
		Label label = new Label(shell, SWT.NONE);
		label.setText( "Hello World" );
		
		shell.open();
		
		return 0;
	}

}
