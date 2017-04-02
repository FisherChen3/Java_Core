package guice.learning.google.guice;

import com.google.inject.Inject;

/**
 * Created by Fisher on 3/30/2017.
 */
public class Client {
    @Inject
    FlightEngine flightEngine;

    public FlightEngine getFlightEngine() {
        return flightEngine;
    }

    public void setFlightEngine(FlightEngine flightEngine) {
        this.flightEngine = flightEngine;
    }

    public void print(){
        flightEngine.print();
        System.out.println("client");
    }
}
