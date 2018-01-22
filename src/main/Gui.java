                                     package main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Gui {

	protected Shell shell;

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Arduino Interface | Settings");
		shell.setLayout(null);
		
		Button btnBut = new Button(shell, SWT.NONE);
		btnBut.setBounds(10, 27, 75, 25);
		btnBut.setText("SooS");
		
		Button btnBut_1 = new Button(shell, SWT.NONE);
		btnBut_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
			}
		});
		btnBut_1.setText("SaaS");
		btnBut_1.setBounds(10, 58, 75, 25);
		
		Button btnBut_2 = new Button(shell, SWT.NONE);
		btnBut_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
			}
		});
		btnBut_2.setText("SeeS");
		btnBut_2.setBounds(10, 88, 75, 25);
	}
}
