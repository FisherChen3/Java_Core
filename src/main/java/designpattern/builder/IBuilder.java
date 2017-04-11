package designpattern.builder;

/**
 * Created by Fisher on 4/4/2017.
 */
public interface IBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
