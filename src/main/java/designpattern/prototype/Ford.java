package designpattern.prototype;

/**
 * Created by Fisher on 4/9/2017.
 */
public class Ford extends BasicCar {
    public Ford(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
