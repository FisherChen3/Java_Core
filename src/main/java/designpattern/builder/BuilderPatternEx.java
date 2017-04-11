package designpattern.builder;

/**
 * Created by Fisher on 4/4/2017.
 */
public class BuilderPatternEx {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");
        Director director = new Director();
        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();
// Making Car
        director.Construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();
//Making MotorCycle
        director.Construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}
