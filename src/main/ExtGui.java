package main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.io.File;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public class ExtGui {

	protected Shell shell;
	private Boolean activegui = false;

	public void open(int number) {
		Display display = Display.getDefault();
		createContents(number);	
		String pngpath = getClass().getResource("/img/logo_16x.png").getFile();
		File file = new File(pngpath);
		Image image = new Image(display, file.getAbsolutePath());
	    shell.setImage(image);   
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
				activegui = true;
			}
		}
		activegui = false;
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	protected void createContents(int number) {
		shell = new Shell();
		shell.setSize(450, 300);		
		shell.setText("Arduino Interface | Config Button " + number);
		
		Label lblButtonConfiguration = new Label(shell, SWT.NONE);
		lblButtonConfiguration.setBounds(10, 10, 148, 15);
		lblButtonConfiguration.setText("Button " + number + " Configuration");

	}


	public Boolean getActivegui() {
		return activegui;
	}
}
