package designpattern.decorator;

/**
 * Created by Fisher on 4/4/2017.
 */
public class ConcreteDecoratorEx1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        //Add additional thing if necessary
        System.out.println("I am explicitly from Ex_1");
    }
}
