package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fisher on 4/4/2017.
 */
public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();
    public int totalObjectsCreated() {
        return shapes.size();
    }
    public IRobot getRobotFromFactory(String RobotCategory) throws Exception {
        IRobot robotCategory = null;
        if (shapes.containsKey(RobotCategory)) {
            robotCategory = shapes.get(RobotCategory);
        } else {
            switch (RobotCategory) {
                case "small":
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot now.");
                    robotCategory = new SmallRobot();
                    shapes.put("small", robotCategory);
                    break;
                case "large":
                    System.out.println("We do not have Large Robot. So we are creating a Large Robot now .");
                    robotCategory = new LargeRobot();
                    shapes.put("large", robotCategory);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only small and large shapes");
            }
        }
        return robotCategory;
    }
}
