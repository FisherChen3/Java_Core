package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fisher on 4/2/2017.
 */
public class Subject implements ISubject {
    List<IObserver> observerList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }
    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }
    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }
    @Override
    public void notifyObservers(int updatedValue) {
        for(IObserver o: observerList){
            o.update(updatedValue);
        }
    }
}
