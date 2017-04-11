package guice.learning.google.guice;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import java.io.File;

/**
 * Created by Fisher on 4/1/2017.
 */
// CSVSupplier's instantiation will be delayed -- changed to lazy instantiation
public class CSVSupplierProvider implements Provider<CSVSupplier> {
    // all the attributes initialization will be completed here
    private String csvFolderPath;
    SearchRequest searchRequest;


    @Inject
    public CSVSupplierProvider(@Named("csvFolderPath") String csvFolderPath,SearchRequest searchRequest){
        this.csvFolderPath = csvFolderPath;
        this.searchRequest = searchRequest;
    }

    @Override
    public CSVSupplier get() {
        CSVSupplier csvSupplier = new CSVSupplier();
        csvSupplier.setCsvFolder(new File(csvFolderPath));
        csvSupplier.setSearchRequest(searchRequest);
        return csvSupplier;
    }


}
