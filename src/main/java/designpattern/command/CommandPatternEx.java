package designpattern.command;

/**
 * Created by Fisher on 4/4/2017.
 */
public class CommandPatternEx {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");
        Receiver intendedreceiver = new Receiver();
/*Client holds Invoker and Command Objects*/
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.executeCommand(unCmd);
        inv.executeCommand(reCmd);
    }
}
