package designpattern.strategy;

/**
 * Created by Fisher on 4/4/2017.
 */
public class SecondChoice implements IChoice {
    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:" + s1 + s2);
        System.out.println("***End of the strategy***");
    }
}
