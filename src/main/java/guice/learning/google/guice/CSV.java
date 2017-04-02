package guice.learning.google.guice;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Fisher on 4/1/2017.
 */
@BindingAnnotation
@Target({FIELD, PARAMETER, METHOD})
@Retention(RUNTIME)
public @interface CSV {

    // together with this annotation, this is another way of injection
//    @Inject
//    public FlightEngine(@CSV FlightSupplier flightSuplier){
//        this.csvFlightSupplier = flightSuplier;
//    }
//
//    bind(FlightSupplier.class)
//        .annotatedWith(CSV.class)
//        .to(CSVSupplier.class);
}
