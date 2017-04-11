package designpattern.factorymethod;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Duck implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Duck says Pack-pack");
    }
}
