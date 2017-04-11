package designpattern.observer;

/**
 * Created by Fisher on 4/2/2017.
 */
public class Observer1 implements IObserver{
    @Override
    public void update(int i) {
        System.out.println("Observer1: myValue in Subject is now: "+i);
    }
}
