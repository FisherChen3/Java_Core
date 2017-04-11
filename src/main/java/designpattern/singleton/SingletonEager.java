package designpattern.singleton;

/**
 * Created by Fisher on 4/2/2017.
 * using static eager instantiation
 */
public class SingletonEager {

    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getSingleton(){
        return singleton;
    }
}
