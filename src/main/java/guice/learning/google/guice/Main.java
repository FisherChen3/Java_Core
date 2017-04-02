package guice.learning.google.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Fisher on 3/30/2017.
 */
public class Main {

    public static void main(String[] args) {
        // pass all the instances of various modules, which have binding configurations
        Injector injector = Guice.createInjector(new CSVSupplierModule());
        // injector will be used to create the instances of the objects
        // Guice managed objects
        Client client = injector.getInstance(Client.class);
        client.print();
    }

}
