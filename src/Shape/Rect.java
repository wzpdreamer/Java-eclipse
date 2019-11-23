package Shape;

import org.eclipse.swt.graphics.GC;

public class Rect implements IShape{
	public Rect(){}
	public static String getToolText() {
		return "¾ØÐÎ";
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public GC getGcMain() {
		return gcMain;
	}
	public void setGcMain(GC gcMain) {
		this.gcMain = gcMain;
	}
	private int top;
	private int left;
	private int width;
	private int height;
	private GC gcMain = null;
	public Rect(int top,int left, int width,int height, GC gc) {
		this.top=top;
		this.left=left;
		this.width=width;
		this.height=height;
		gcMain = gc;
	}
	@Override
	public void draw() {
		gcMain.drawRectangle(top,left,width,height);
	}

}
