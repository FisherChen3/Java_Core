package guice.learning.google.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by Fisher on 3/30/2017.
 */
public class FlightEngine {
    @Inject
    @CSV
    Provider<FlightSupplier> supplierProvider;


    public void print() {
        supplierProvider.get().getResult();
        supplierProvider.get().getSearchResult();
        String path = supplierProvider.get().getCsvFolder().getAbsolutePath();
        System.out.println("FlightEngine");
        System.out.println("directory path is: " + path);
    }
}
