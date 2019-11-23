import java.util.Scanner;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class dsjc {

	protected Shell shell;
	private Text input;
	private Text result;

	/**
	 * Launch the application.
	 * @param args
	 */
	public StringBuilder dsjc(int n) {
		int[] a=new int[1000];
        int[] b=new int[1000];
        a[0]=1;
        int i,c,d,e=0,alength=1,blength=0;
        for(int k=1;k<=n;k++)
        {
            for(i=alength-1;i>=0;i--){
                c=a[i]*k;
                c=e+c;
                d=c%10;
                b[blength++]=d;
                e=c/10;
            }
            while(e != 0){
                b[blength++]=(e%10);
                e = e / 10;
            }
            int m=0,q=blength-1;
            while(m<blength){
                a[m++]=b[q--];
            }
            alength=blength;
            blength=0;
        }
        StringBuilder s1 = new StringBuilder();
        for(int k=0;k<alength;k++) {
        	s1.append(a[k]);
        }
        return s1;
	}
	public static void main(String[] args) {
		try {
			dsjc window = new dsjc();
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
		Scanner in = new Scanner(System.in);
		
		shell = new Shell();
		shell.setSize(770, 500);
		shell.setText("´óÊý½×³Ë");
		
		input = new Text(shell, SWT.BORDER);
		input.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		input.setBounds(0, 0, 755, 150);
		
		result = new Text(shell, SWT.BORDER);
		result.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		result.setBounds(0, 300, 755, 150);
		
		Button jisuan = new Button(shell, SWT.NONE);
		jisuan.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int input1 = Integer.parseInt(input.getText());
				StringBuilder s = dsjc(input1);
				result.setText(""+s);
			}
		});
		jisuan.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.NORMAL));
		jisuan.setBounds(0, 150, 755, 150);
		jisuan.setText("\u8BA1\u7B97");
	}
}
