package designpattern.command;

/**
 * Created by Fisher on 4/4/2017.
 */
public class MyRedoCommand implements ICommand {
    private Receiver receiver;
    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void doSomething() {
        //Call redo in receiver
        receiver.performRedo();
    }
}
