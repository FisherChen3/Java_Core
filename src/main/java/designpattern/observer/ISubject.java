package designpattern.observer;

/**
 * Created by Fisher on 4/2/2017.
 */
public interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers(int i);
}
