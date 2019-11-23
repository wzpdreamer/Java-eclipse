package Shapetext;

import java.util.ArrayList;
import java.util.List;

import Shape.IShape;
public class Broad {
    public List<IShape> shapes;
    public Broad(){
        shapes = new ArrayList<IShape>();
    }
    public void addShape(IShape shape){
        shapes.add(shape);
    }
    public void Refresh() {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }
}
