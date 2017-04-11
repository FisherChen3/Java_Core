package designpattern.prototype;

/**
 * Created by Fisher on 4/9/2017.
 */
public class Nano extends BasicCar {
    public Nano(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
