package designpattern.state;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. Going to be on now");
        context.setState(new On());
    }
}
