package Shapetext;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import Shape.IShape;
import Shape.Circle;
import Shape.Rect;
import Shape.RoundRect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;

public class Mydraw {

	protected Shell shell;
	private static GC gcMain = null;
	private int startX;
	private int startY;
	private static boolean LeftButtunDown = false;
	private static int Width;
	private static int Height;
	private static int LastWidth;
	private static int LastHeight;
	private static String ShapeType ;
	private static ArrayList<String> ShapeTypes = new ArrayList<String>();
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			List listClass = null;
			String pkg = "Shape";
			listClass = ClassUtil.getClassList(pkg, true, null);
			for (Object object : listClass) {
				String name = ((Class<?>)object).getName();
				if(!name.equals("Shape.IShape")){
					ShapeTypes.add(name);
				}
			}
			Mydraw window = new Mydraw();
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
		createContents(display);
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
	protected void createContents(Display display) {
	
		shell = new Shell();
		shell.setSize(679, 459);
		Broad broad = new Broad();
		gcMain = new GC(shell);
		String[] Colors = { "Blue","Dark_Blue", "Red","Dark_Red", "Yellow", "Dark_Yellow","Green", "Dark_Green",
				"Black", "Gray","Dark_Gray", "Cyan", "Dark_Cyan" ,"Magenta","Dark_Magenta"};
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(Colors);
		combo.setBounds(526, 0, 110, 28);
		String[] LineStyles = {"LINE_DOT","LINE_SOLID","LINE_CUSTOM","LINE_DASH","LINE_DASHDOT","LINE_DASHDOTDOT"};
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setItems(LineStyles);
		combo_1.setBounds(526, 29, 110, 28);
		
		Combo combo_2 = new Combo(shell, SWT.NONE);
		combo_2.setBounds(526, 57, 110, 28);
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(460, 0, 65, 28);
		label.setText("\u7EBF\u6761\u989C\u8272");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(460, 29, 65, 28);
		lblNewLabel.setText("\u7EBF\u6761\u6837\u5F0F");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(460, 57, 65, 28);
		lblNewLabel_1.setText("\u7EBF\u6761\u5BBD\u5EA6");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(538, 102, 98, 30);
		btnNewButton_1.setText("\u8BFB\u53D6");
		Width = 0;
		Height = 0;
		LastWidth=0;
		LastHeight=0;
		
		shell.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent e) {
				if(LeftButtunDown) {
					gcMain.setLineStyle(SWT.LINE_DOT);
					gcMain.setForeground(shell.getBackground());
					
					gcMain.drawRectangle(startX,startY,LastWidth,LastHeight);
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
					gcMain.drawRectangle(startX,startY,e.x-startX,e.y-startY);
					LastWidth = e.x-startX;
					LastHeight = e.y - startY;
					
					gcMain.setLineStyle(SWT.LINE_SOLID);
				}
			}
		});
		shell.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				// 设置光标类型为十字
				shell.setCursor(new Cursor(null,SWT.CURSOR_ARROW));
				LeftButtunDown = false;
				Width = e.x-startX;
				Height = e.y-startY;
				gcMain.setLineStyle(SWT.LINE_DOT);
				gcMain.setForeground(shell.getBackground());
				gcMain.drawRectangle(startX,startY,Width,Height);
				
				gcMain.setLineStyle(SWT.LINE_SOLID);
				switch(combo_1.getText()) {
				case "LINE_DOT":
					gcMain.setLineStyle(SWT.LINE_DOT);break;
				case "LINE_SOLID":
					gcMain.setLineStyle(SWT.LINE_SOLID);break;
				case "LINE_CUSTOM":
					gcMain.setLineStyle(SWT.LINE_CUSTOM);break;
				case "LINE_DASH":
					gcMain.setLineStyle(SWT.LINE_DASH);break;
				case "LINE_DASHDOT":
					gcMain.setLineStyle(SWT.LINE_DASHDOT);break;
				case "LINE_DASHDOTDOT":
					gcMain.setLineStyle(SWT.LINE_DASHDOTDOT);break;
				}
				gcMain.setLineWidth(Integer.parseInt(combo_2.getText()));
				gcMain.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
				switch(combo.getText()) {
				case "Blue":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_BLUE));break;
				case "Dark_Blue":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_BLUE));break;
				case "Red":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_RED));break;
				case "Dark_Red":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_RED));break;
				case "Yellow":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_YELLOW));break;
				case "Dark_Yellow":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_YELLOW));break;
				case "Green":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_GREEN));break;
				case "Dark_Green":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_GREEN));break;
				case "Black":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_BLACK));break;
				case "Gray":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_GRAY));break;
				case "Dark_Gray":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_GRAY));break;
				case "Cyan":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_CYAN));break;
				case "Dark_Cyan":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_CYAN));break;
				case "Magenta":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_MAGENTA));break;
				case "Dark_Magenta":
					gcMain.setForeground(display.getSystemColor(SWT.COLOR_DARK_MAGENTA));break;
				}
				IShape shape;
				try {
					Class shapeClass = Class.forName(ShapeType);
					Object oshape = shapeClass.newInstance();
					shape = (IShape)oshape;
					shape.setTop(startX);
					shape.setLeft(startY);
					shape.setWidth(e.x-startX);
					shape.setHeight(e.y-startY);
					shape.setGcMain(gcMain);
				}catch(Exception ex) {
					ex.printStackTrace();
					shape = null;
				}
				if(shape!=null) {
					broad.addShape(shape);
					broad.Refresh();
				}
				shell.addPaintListener(new PaintListener() {
					public void paintControl(PaintEvent e) {
						broad.Refresh();
					}
				});
			}
			@Override
			public void mouseDown(MouseEvent e) {
				shell.setCursor(new Cursor(null,SWT.CURSOR_CROSS));
				LeftButtunDown = true;
				startX = e.x;
				startY = e.y;
			}
		});
		// add button by shapeTypes
		int indexButton = 0;
		for (String strClass : ShapeTypes) {
			Button btn = new Button(shell, SWT.NONE);
			btn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ShapeType = strClass;
			}
		});
		btn.setBounds(84 * indexButton, 0, 80, 27);
		indexButton++;
		try {
			Class<?> shapeClass = Class.forName(strClass);
			Method method = shapeClass.getMethod("getToolText");  
			btn.setText(method.invoke(null, null).toString());
			btn.setData("ShapeType", strClass);
		} catch (Exception e) {
			btn.setText(strClass);
			btn.setData("ShapeType", strClass);
		}

		shell.setSize(680, 500);
		shell.setText("SWT Application");
		}
	}
}

