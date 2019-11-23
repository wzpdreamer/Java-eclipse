import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.io.*;
import java.util.*;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionListener;
import java.util.function.Consumer;
import org.eclipse.swt.events.SelectionEvent;

public class MyTextFile extends ArrayList<String> {
	public MyTextFile() {}
    public static String read(String fileName,ProgressBar Bar) {
    	File ins=new File(fileName);
    	int filebyte=(int)(ins.length())/(1024*1024)+1;
    	int i = 0;
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in= new BufferedReader(new FileReader(
                    new File(fileName).getAbsoluteFile()));
            try {
                String s;
                Bar.setMaximum(filebyte);
                while((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                    Bar.setSelection(Bar.getSelection() + 1);
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

	protected Shell shell;
	private Text text_1;
	private Text text_2;
	private ProgressBar Bar;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyTextFile window = new MyTextFile();
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
//		String file = read("D:\\◊¿√Ê\\Œ‰÷«≈Ù\\a.txt");
//        write("test.txt", file);
//        TextFile text = new TextFile("test.txt");
//        text.write("test2.txt");
		shell = new Shell();
		shell.setSize(485, 366);
		shell.setText("SWT Application");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(202, 10, 220, 30);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(202, 54, 220, 30);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 157, 30);
		lblNewLabel.setText("\u8BF7\u8F93\u5165\u88AB\u590D\u5236\u6587\u4EF6\u8DEF\u5F84");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 54, 145, 30);
		lblNewLabel_1.setText("\u8BF7\u8F93\u5165\u590D\u5236\u6587\u4EF6\u8DEF\u5F84");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				String file = read(text_1.getText(),Bar);
		        write(text_2.getText(), file);
			}
		});
		btnNewButton.setBounds(38, 90, 98, 30);
		btnNewButton.setText("\u590D\u5236");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btnNewButton_2.setText("ª÷∏¥");
			}
		});
		btnNewButton_2.setBounds(38, 167, 98, 30);
		btnNewButton_2.setText("\u6682\u505C");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(324, 167, 98, 30);
		btnNewButton_3.setText("\u53D6\u6D88");
		
		Bar = new ProgressBar(shell, SWT.NONE);
		Bar.setBounds(38, 233, 384, 35);
	}
}

