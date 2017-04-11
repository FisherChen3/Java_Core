package designpattern.proxy.proxyclasses;

import designpattern.proxy.originclasses.ConcreteSubject;
import designpattern.proxy.originclasses.Subject;

/**
 * Created by Fisher on 4/2/2017.
 */
public class Proxy extends Subject {
    ConcreteSubject cs;
    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");

        // lazy initialization
        if(cs==null){
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
