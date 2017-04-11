package designpattern.command;

/**
 * Created by Fisher on 4/4/2017.
 */
public class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }
    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}
