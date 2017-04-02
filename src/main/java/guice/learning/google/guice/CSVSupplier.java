package guice.learning.google.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.io.File;

/**
 * Created by Fisher on 3/30/2017.
 */
public class CSVSupplier implements FlightSupplier {
    @Inject
    @Named("csvPath")
    String csvPath;

    @Inject
    SearchRequest searchRequest;

    private File csvFolder;

    @Override
    public String getResult() {
        System.out.println(csvPath);
        return csvPath;
    }

    public String getCsvPath() {
        return csvPath;
    }

    public void setCsvPath(String csvPath) {
        this.csvPath = csvPath;
    }

    @Override
    public SearchRequest getSearchResult() {
        System.out.println("in CSVSupplier, if search request is null? " + searchRequest.toString());
        return searchRequest;
    }



    @Inject
    public void setCsvFolder(File csvFolder){
        this.csvFolder = csvFolder;
    }

    public void setSearchRequest(SearchRequest searchRequest) {
        this.searchRequest = searchRequest;
    }

    @Override
    public File getCsvFolder() {
        return csvFolder;
    }
}
