package designpattern.decorator;

/**
 * Created by Fisher on 4/4/2017.
 */
public class DecoratorPatternEx {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorEx1 cd_1 = new ConcreteDecoratorEx1();
// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1
        cd_1.setComponent(cc);
        cd_1.doJob();
        ConcreteDecoratorEx2 cd_2 = new ConcreteDecoratorEx2();
// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1 &
//ConcreteDecoratorEX_2
        cd_2.setComponent(cd_1);//Adding //results from cd_1 now
        cd_2.doJob();
    }
}
