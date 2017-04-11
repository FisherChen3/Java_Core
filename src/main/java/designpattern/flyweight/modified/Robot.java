package designpattern.flyweight.modified;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Robot implements IRobot {
    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }
    // this is the part which is open for customization from user,
    // and can be modified after object has been instantiated
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void print() {
        System.out.println(" This is a " + robotType + " type robot with "+colorOfRobot+ " color");
    }
}
