package designpattern.singleton;

/**
 * Created by Fisher on 4/2/2017.
 * using static nested class to achieve lazy instantiation and thread safe
 * from (Bill Pugh's solution)
 */
public class SingletonStaticClass {


    private SingletonStaticClass(){}

    private static class SingletonHelper {

        private static final SingletonStaticClass singleton = new SingletonStaticClass();

    }

    private static SingletonStaticClass getSingleton(){
        return SingletonHelper.singleton;
    }

}
