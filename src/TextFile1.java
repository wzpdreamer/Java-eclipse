import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.swt.widgets.ToolBar;

public class TextFile1 {
    private static Text text;
    private static Text text_1;

    public static void copyfile(String infile,String outfile,ProgressBar bar)throws IOException
    {
        int num=0,filebyte;
        byte[] b=new byte[1024*1024];
        File ins=new File(infile);
        filebyte=(int)(ins.length())/(1024*1024)+1;
        DataInputStream din=new DataInputStream(new FileInputStream(infile));
        DataOutputStream dou=new DataOutputStream( new FileOutputStream(outfile));
        bar.setMaximum(filebyte);
        while(din.read(b)>0)
        {
            dou.write(b);
            bar.setSelection(bar.getSelection() + 1);
        }
        din.close();
        dou.close();

    }
    public static void main(String[] args) throws IOException {
        Display display = Display.getDefault();
        Shell shell = new Shell();
        shell.setSize(450, 300);
        shell.setText("SWT COPY");
        shell.setLayout(null);

        ProgressBar bar = new ProgressBar(shell, SWT.NONE);
        bar.setBounds(10, 222, 412, 21);

        Label lblOldFile = new Label(shell, SWT.NONE);
        lblOldFile.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
        lblOldFile.setBounds(10, 20, 68, 36);
        lblOldFile.setText("old file");

        text = new Text(shell, SWT.BORDER);
        text.setBounds(84, 10, 231, 36);

        text_1 = new Text(shell, SWT.BORDER);
        text_1.setBounds(84, 84, 231, 36);

        Label lblNewFile = new Label(shell, SWT.NONE);
        lblNewFile.setText("目标文件地址");
        lblNewFile.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
        lblNewFile.setBounds(10, 84, 68, 36);

        Button btnCopy = new Button(shell, SWT.NONE);
        btnCopy.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                bar.setSelection(0);
                String oldfile=text.getText();
                String newfile=text_1.getText();
                try {
                    copyfile(oldfile,newfile,bar);
                } catch (IOException e1) {
                    System.out.println("111");
                }
            }
        });
        btnCopy.setBounds(84, 158, 98, 30);
        btnCopy.setText("copy");

        Button btnMove = new Button(shell, SWT.NONE);
        btnMove.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                bar.setSelection(0);
                String oldfile=text.getText();
                String newfile=text_1.getText();
                try {
                    copyfile(oldfile,newfile,bar);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    System.out.println("123");
                }
                File file=new File(oldfile);
                file.delete();
            }
        });
        btnMove.setBounds(239, 158, 98, 30);
        btnMove.setText("move");

        shell.open();
        shell.layout();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
}

