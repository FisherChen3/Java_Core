package designpattern.visitor;

/**
 * Created by Fisher on 4/10/2017.
 */
public class VisitorPatternEx {
    public static void main(String[] args) {
        System.out.println("***Visitor Pattern Demo***\n");
        IVisitor v = new Visitor();
        MyClass myClass = new MyClass();
        myClass.accept(v);
    }
}
