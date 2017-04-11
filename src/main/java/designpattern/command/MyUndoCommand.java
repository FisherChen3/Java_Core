package designpattern.command;

/**
 * Created by Fisher on 4/4/2017.
 */
public class MyUndoCommand implements ICommand {
    private Receiver receiver;
    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void doSomething() {
        //Call undo in receiver
        receiver.performUndo();
    }
}
