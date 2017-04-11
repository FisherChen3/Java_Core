package designpattern.proxy;

import designpattern.proxy.proxyclasses.Proxy;

/**
 * Created by Fisher on 4/2/2017.
 */
public class ProxyPatternEx {

    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy px = new Proxy();
        px.doSomeWork();
    }

}
