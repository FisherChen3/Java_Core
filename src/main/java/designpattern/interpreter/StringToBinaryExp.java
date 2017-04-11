package designpattern.interpreter;

/**
 * Created by Fisher on 4/10/2017.
 */
public class StringToBinaryExp implements IExpression {
    private String str;

    public StringToBinaryExp(String s) {
        str = s;
    }

    @Override
    public void interpret(Context ic) {
        ic.getBinaryForm(str);
    }
}
