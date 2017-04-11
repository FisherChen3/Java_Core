package designpattern.singleton;

/**
 * Created by Fisher on 4/2/2017.
 * by using synchronization to achieve thread-safe
 * bad performance
 */
public class SingletonSync {

    private static SingletonSync singletonSync;

    private SingletonSync(){}

    public static synchronized SingletonSync getSingletonSync(){
        // lazy initializtion
        if(singletonSync==null){
            singletonSync = new SingletonSync();
        }
        return singletonSync;
    }

}
