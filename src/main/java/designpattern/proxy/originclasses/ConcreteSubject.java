package designpattern.proxy.originclasses;

/**
 * Created by Fisher on 4/2/2017.
 */
public class ConcreteSubject extends Subject {

    @Override
    public void doSomeWork() {
        System.out.println(" I am from concrete subject");
    }
}
