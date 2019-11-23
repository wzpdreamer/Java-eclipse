package Calculator;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Calculator {

	protected Shell shell;
	private Text text;
	public StringBuilder str = new StringBuilder();

	public void StrBu() {
		StringBuilder st = new StringBuilder(text.getText());
		str =st;
	}
	public void eval(String e)  throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptEngine engine = manager.getEngineByName("js");
	    Object result = engine.eval(e);
	    text.setText(result+"");
	}
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator window = new Calculator();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
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
	 * Create contents of the window.
	 */
	protected void createContents()  {
		shell = new Shell();
		shell.setSize(770, 601);
		shell.setText("¼ÆËãÆ÷");
	     
		text = new Text(shell, SWT.BORDER);
		text.setBounds(0, 0, 750, 150);
		
		Button Button1 = new Button(shell, SWT.NONE);
		Button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("%");
				text.setText(str.toString());
			}
		});
		Button1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button1.setBounds(0, 150, 150, 130);
		Button1.setText("%");
		
		Button Button2 = new Button(shell, SWT.NONE);
		Button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("(");
				text.setText(str.toString());
			}
		});
		Button2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button2.setBounds(150, 150, 150, 80);
		Button2.setText("(");
		
		Button Button3 = new Button(shell, SWT.NONE);
		Button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append(")");
				text.setText(str.toString());
			}
		});
		Button3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button3.setBounds(300, 150, 150, 80);
		Button3.setText(")");
		
		Button Button4 = new Button(shell, SWT.NONE);
		Button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.delete(str.length()-1,str.length());
				text.setText(str.toString());
			}
		});
		Button4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button4.setBounds(450, 150, 150, 80);
		Button4.setText("C");
		
		Button Button5 = new Button(shell, SWT.NONE);
		Button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.delete(0,str.length());
				text.setText(str.toString());
			}
		});
		Button5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button5.setBounds(600, 150, 150, 80);
		Button5.setText("\u6E05\u7A7A");
		
		Button Button6 = new Button(shell, SWT.NONE);
		Button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("/");
				text.setText(str.toString());
			}
		});
		Button6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button6.setText("/");
		Button6.setBounds(0, 280, 150, 130);
		
		Button Button7 = new Button(shell, SWT.NONE);
		Button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("7");
				text.setText(str.toString());
			}
		});
		Button7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button7.setBounds(150, 230, 150, 80);
		Button7.setText("7");
		
		Button Button8 = new Button(shell, SWT.NONE);
		Button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("8");
				text.setText(str.toString());
			}
		});
		Button8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button8.setBounds(300, 230, 150, 80);
		Button8.setText("8");
		
		Button Button9 = new Button(shell, SWT.NONE);
		Button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("9");
				text.setText(str.toString());
			}
		});
		Button9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button9.setBounds(450, 230, 150, 80);
		Button9.setText("9");
		
		Button Button10 = new Button(shell, SWT.NONE);
		Button10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("*");
				text.setText(str.toString());
			}
		});
		Button10.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 25, SWT.NORMAL));
		Button10.setBounds(600, 230, 150, 80);
		Button10.setText("*");

		Button Button16 = new Button(shell, SWT.NONE);
		Button16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("-");
				text.setText(str.toString());
			}
		});
		Button16.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		Button16.setBounds(0, 410, 150, 140);
		Button16.setText("-");
		
		Button Button12 = new Button(shell, SWT.NONE);
		Button12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("4");
				text.setText(str.toString());
			}
		});
		Button12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button12.setBounds(150, 310, 150, 80);
		Button12.setText("4");
		
		Button Button13 = new Button(shell, SWT.NONE);
		Button13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("5");
				text.setText(str.toString());
			}
		});
		Button13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button13.setBounds(300, 310, 150, 80);
		Button13.setText("5");
		
		Button Button14 = new Button(shell, SWT.NONE);
		Button14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("6");
				text.setText(str.toString());
			}
		});
		Button14.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button14.setBounds(450, 310, 150, 80);
		Button14.setText("6");
		
		Button Button15 = new Button(shell, SWT.NONE);
		Button15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("+");
				text.setText(str.toString());
			}
		});
		Button15.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button15.setBounds(600, 310, 150, 80);
		Button15.setText("+");
			
		
		Button Button17 = new Button(shell, SWT.NONE);
		Button17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("1");
				text.setText(str.toString());
			}
		});
		Button17.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button17.setBounds(150, 390, 150, 80);
		Button17.setText("1");
		
		Button Button18 = new Button(shell, SWT.NONE);
		Button18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("2");
				text.setText(str.toString());
			}
		});
		Button18.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button18.setBounds(300, 390, 150, 80);
		Button18.setText("2");
		
		Button Button19 = new Button(shell, SWT.NONE);
		Button19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("3");
				text.setText(str.toString());
			}
		});
		Button19.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button19.setBounds(450, 390, 150, 80);
		Button19.setText("3");
		
		Button Button20 = new Button(shell, SWT.NONE);
		Button20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				try {
					eval(text.getText());
				} catch (ScriptException e1) {
					e1.printStackTrace();
				}
				str.delete(0,str.length());
			}
		});
		Button20.setText("=");
		Button20.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button20.setBounds(600, 390, 150, 160);
		Button20.setText("=");
		
		
		
		Button Button22 = new Button(shell, SWT.NONE);
		Button22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				text.setText(str.toString()+"1/");
				StrBu();
			}
		});
		Button22.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button22.setBounds(150, 470, 150, 80);
		Button22.setText("1/x");
		
		Button Button23 = new Button(shell, SWT.NONE);
		Button23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append("0");
				text.setText(str.toString());
			}
		});
		Button23.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		Button23.setBounds(300, 470, 150, 80);
		Button23.setText("0");
		
		Button Button24 = new Button(shell, SWT.NONE);
		Button24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				str.append(".");
				text.setText(str.toString());
			}
		});
		Button24.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 30, SWT.NORMAL));
		Button24.setBounds(450, 470, 150, 80);
		Button24.setText(".");
		
		
	}
}
