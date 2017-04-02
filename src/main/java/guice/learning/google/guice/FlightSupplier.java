package guice.learning.google.guice;

import java.io.File;

/**
 * Created by Fisher on 3/30/2017.
 */
public interface FlightSupplier {

    String getResult();

    SearchRequest getSearchResult();

    File getCsvFolder();

}
