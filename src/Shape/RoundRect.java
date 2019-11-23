package Shape;
import org.eclipse.swt.graphics.GC;
public class RoundRect implements IShape{
	public RoundRect() {}
	public static String getToolText() {
		return "30Բ�Ǿ���";
	}
	private int top;
	private int left;
	private int width;
	private int height;
	private GC gcMain = null;
	public RoundRect(int top, int left, int width, int height, GC gc) {
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
		gcMain.drawRoundRectangle(top, left, width, height, 30, 30);
	}
}