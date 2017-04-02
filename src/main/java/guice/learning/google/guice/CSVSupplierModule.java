package guice.learning.google.guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import java.io.File;

/**
 * Created by Fisher on 3/30/2017.
 */
public class CSVSupplierModule extends AbstractModule {

    @Override
    protected void configure() {
        /**
         * untargeted bindings
         * eagerly injection
         */
        bind(String.class).annotatedWith(Names.named("csvPath")).toInstance("/flightCSV");


        bind(String.class).annotatedWith(Names.named("csvFolderPath")).toInstance("/flightCSV");
        // bind type to it's implementation
        // linked bindings
//        bind(FlightSupplier.class).to(CSVSupplier.class);

        bind(String.class).toInstance("./str4File");

        //Constructor binding
        try {
            bind(File.class).toConstructor(File.class.getConstructor(String.class));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // static injection -- useful for utility class
//        bindConstant().annotatedWith(Names.named(dateFormat)).to(dd-MM-yy);
//        requestStaticInjection(FlightUtils.class);

        bind(FlightSupplier.class)
                .annotatedWith(CSV.class)
                .toProvider(CSVSupplierProvider.class);

        bind(SearchRequest.class).toInstance(new SearchRequest());
    }
}
