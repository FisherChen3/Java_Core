package designpattern.visitor;

/**
 * Created by Fisher on 4/10/2017.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(MyClass myClassElement) {
        System.out.println("Visitor is trying to change the integer value");
        myClassElement.setMyInt(100);
        System.out.println("Exiting from Visitor- visit");
    }
}
