package designpattern.bridge;

/**
 * Created by Fisher on 4/10/2017.
 */
public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with " +border+" inch border.");
    }
}
