package designpattern.flyweight.modified;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fisher on 4/4/2017.
 */
public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<String, IRobot>();
    public int TotalObjectsCreated() {
        return shapes.size();
    }
    public IRobot GetRobotFromFactory(String robotType) throws Exception {
        IRobot robotCategory = null;
        if (shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } else {
            switch (robotType) {
                // King and Queen is the intrinsic state, colors will be extrinsic state
                case "King":
                    System.out.println("We do not have King Robot. So we are creating a King Robot now.");
                    robotCategory = new Robot("King");
                    shapes.put("King", robotCategory);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now.");
                    robotCategory = new Robot("Queen");
                    shapes.put("Queen", robotCategory);
                    break;
                default:
                    throw new Exception(" Robot Factory can create only king and queen type robots");
            }
        }
        return robotCategory;
    }
}
