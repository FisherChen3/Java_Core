package designpattern.flyweight.modified;

import java.util.Random;

/**
 * Created by Fisher on 4/4/2017.
 */
public class FlyweightPatternModifiedEx {
    public static void main(String[] args) throws Exception {
        RobotFactory myfactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example Modified***\n");
        Robot shape;
/*Here we are trying to get 3 king type robots*/
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myfactory.GetRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }
/*Here we are trying to get 3 queen type robots*/
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myfactory.GetRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }
        int NumOfDistinctRobots = myfactory.TotalObjectsCreated();
//System.out.println("\nDistinct Robot objects created till now ="+ NumOfDistinctRobots);
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);
    }
    static String getRandomColor() {
        Random r = new Random();
/*You can supply any number of your choice in nextInt argument.
Chapter 16 ¡ Flyweight Patterns
107
* we are simply checking the random number generated is an even number
* or an odd number. And based on that we are choosing the color. For
simplicity, we'll use only two colors.red and green
*/
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
