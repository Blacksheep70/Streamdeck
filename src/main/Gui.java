package main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Gui {

	protected Shell shell;
	ExtGui extgwindow = new ExtGui();
	
	
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
		
		Button btnBut_1 = new Button(shell, SWT.NONE);
		btnBut_1.setBounds(36, 28, 40, 30);
		btnBut_1.setText("1");
		btnBut_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(1); }
			}
		});

		
		Button btnBut_2 = new Button(shell, SWT.NONE);
		btnBut_2.setText("2");
		btnBut_2.setBounds(82, 28, 40, 30);
		btnBut_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(2); }
			}
		});

		
		Button btnBut_3 = new Button(shell, SWT.NONE);
		btnBut_3.setText("3");
		btnBut_3.setBounds(128, 28, 40, 30);
		btnBut_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(3); }
			}
		});

		
		Button btnBut_4 = new Button(shell, SWT.NONE);
		btnBut_4.setText("4");
		btnBut_4.setBounds(174, 28, 40, 30);
		btnBut_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(4); }
			}
		});
		
		Button btnBut_5 = new Button(shell, SWT.NONE);
		btnBut_5.setText("5");
		btnBut_5.setBounds(220, 28, 40, 30);
		btnBut_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(5); }
			}
		});
		
		Button btnBut_6 = new Button(shell, SWT.NONE);
		btnBut_6.setBounds(36, 64, 40, 30);
		btnBut_6.setText("6");
		btnBut_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(6); }
			}
		});

		
		Button btnBut_7 = new Button(shell, SWT.NONE);
		btnBut_7.setText("7");
		btnBut_7.setBounds(82, 64, 40, 30);
		btnBut_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(7); }
			}
		});

		
		Button btnBut_8 = new Button(shell, SWT.NONE);
		btnBut_8.setText("8");
		btnBut_8.setBounds(128, 64, 40, 30);
		btnBut_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(8); }
			}
		});

		
		Button btnBut_9 = new Button(shell, SWT.NONE);
		btnBut_9.setText("9");
		btnBut_9.setBounds(174, 64, 40, 30);
		btnBut_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(9); }
			}
		});
		
		Button btnBut_10 = new Button(shell, SWT.NONE);
		btnBut_10.setText("10");
		btnBut_10.setBounds(220, 64, 40, 30);
		btnBut_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(10); }
			}
		});
		
		
		
		Button btnBut_11 = new Button(shell, SWT.NONE);
		btnBut_11.setBounds(36, 100, 40, 30);
		btnBut_11.setText("11");
		btnBut_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(11); }
			}
		});

		
		Button btnBut_12 = new Button(shell, SWT.NONE);
		btnBut_12.setText("12");
		btnBut_12.setBounds(82, 100, 40, 30);
		btnBut_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(12); }
			}
		});

		
		Button btnBut_13 = new Button(shell, SWT.NONE);
		btnBut_13.setText("13");
		btnBut_13.setBounds(128, 100, 40, 30);
		btnBut_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(13); }
			}
		});

		
		Button btnBut_14 = new Button(shell, SWT.NONE);
		btnBut_14.setText("14");
		btnBut_14.setBounds(174, 100, 40, 30);
		btnBut_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(14); }
			}
		});
		
		Button btnBut_15 = new Button(shell, SWT.NONE);
		btnBut_15.setText("15");
		btnBut_15.setBounds(220, 100, 40, 30);
		btnBut_15.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (!extgwindow.getActivegui()) { extgwindow.open(5); }
			}
		});
	}
}
