package designpattern.bridge;

/**
 * Created by Fisher on 4/10/2017.
 */
public class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Red color with " +border+" inch border");
    }
}
