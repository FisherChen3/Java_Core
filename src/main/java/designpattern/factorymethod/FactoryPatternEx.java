package designpattern.factorymethod;

/**
 * Created by Fisher on 4/4/2017.
 */
public class FactoryPatternEx {
    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.getAnimalType("Duck");
        DuckType.speak();
        IAnimal TigerType = animalFactory.getAnimalType("Tiger");
        TigerType.speak();
//There is no Lion type. So, an exception will be thrown
        IAnimal LionType = animalFactory.getAnimalType("Lion");
        LionType.speak();
    }
}
