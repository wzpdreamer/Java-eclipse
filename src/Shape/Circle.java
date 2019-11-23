package Shape;

import org.eclipse.swt.graphics.GC;

public class Circle implements IShape{
	public Circle() {}
	public static String getToolText() {
		return "Բ��";
	}
	private int top;
	private int left;
	private int width;
	private int height;
	private  GC gcMain;
	public Circle(int top, int left, int width, int height, GC gc) {
		this.top=top;
		this.left=left;
		this.width=width;
		this.height=height;
		gcMain = gc;
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
	@Override
	public void draw() {
		gcMain.drawOval(top, left, width, height);
	}
}
