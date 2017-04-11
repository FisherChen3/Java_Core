package designpattern.bridge;

/**
 * Created by Fisher on 4/10/2017.
 */
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}
