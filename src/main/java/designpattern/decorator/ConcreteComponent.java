package designpattern.decorator;

/**
 * Created by Fisher on 4/4/2017.
 */
public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println(" I am from Concrete Component-I am closed for modification.");
    }
}
