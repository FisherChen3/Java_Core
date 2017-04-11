package designpattern.command;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Invoke {
    ICommand cmd;
    public void executeCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.doSomething();
    }
}
