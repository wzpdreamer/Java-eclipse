import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.io.*;
import java.util.*;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class TextFile extends ArrayList<String> {
	public TextFile() {}
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in= new BufferedReader(new FileReader(
                    new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
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
	private Text text_3;
	private Text text_4;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TextFile window = new TextFile();
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
	protected void createContents() {
//		String file = read("D:\\◊¿√Ê\\Œ‰÷«≈Ù\\a.txt");
//        write("test.txt", file);
//        TextFile text = new TextFile("test.txt");
//        text.write("test2.txt");
		shell = new Shell();
		shell.setSize(450, 300);
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
				String file = read(text_1.getText());
		        write(text_2.getText(), file);
			}
		});
		btnNewButton.setBounds(10, 90, 98, 30);
		btnNewButton.setText("\u590D\u5236");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 126, 157, 30);
		lblNewLabel_2.setText("\u8BF7\u8F93\u5165\u88AB\u79FB\u52A8\u6587\u4EF6\u8DEF\u5F84");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(202, 126, 220, 30);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setAlignment(SWT.CENTER);
		lblNewLabel_3.setBounds(10, 177, 157, 30);
		lblNewLabel_3.setText("\u79FB\u52A8\u5230");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(202, 174, 220, 30);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				File file = new File(text_3.getText());
				file.renameTo(new File(text_4.getText()+"\\"+file.getName()));
			}
		});
		btnNewButton_1.setBounds(10, 213, 98, 30);
		btnNewButton_1.setText("\u79FB\u52A8");
	}
}
