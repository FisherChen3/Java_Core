package designpattern.builder;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Director {
    IBuilder myBuilder;
    // A series of steps—for the production
    public void Construct(IBuilder builder)
    {
        myBuilder=builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
