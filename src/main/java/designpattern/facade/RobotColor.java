package designpattern.facade;

/**
 * Created by Fisher on 4/4/2017.
 */
public class RobotColor {
    private String color;
    public void SetColor(String color) {
        this.color = color;
        System.out.println("Color is set to : " + this.color);
    }
}
