package designpattern.iterator;

/**
 * Created by Fisher on 4/4/2017.
 */
public interface IIterator {
    void First();//Reset to first element
    String Next();//get next element
    Boolean IsDone();//End of collection check
    String CurrentItem();//Retrieve Current Item
}
