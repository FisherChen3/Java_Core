package designpattern.factorymethod;

/**
 * Created by Fisher on 4/4/2017.
 */
public abstract class IAnimalFactory {
    /*if we cannot instantiate in later stage, we'll throw exception*/
    public abstract IAnimal getAnimalType(String type) throws Exception;
}
