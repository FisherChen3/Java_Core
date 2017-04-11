package designpattern.chainofresponsibility;

/**
 * Created by Fisher on 4/10/2017.
 */
public class EmailErrorHandler implements IReceiver {
    private IReceiver nextReceiver;
    public EmailErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }
    @Override
    public boolean processMessage(Message msg) {
        if (msg.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + msg.priority +
                    "priority issue: " + msg.text);
            return true;
        } else {
            if (nextReceiver != null)
                nextReceiver.processMessage(msg);
        }
        return false;
    }
}
