package designpattern.chainofresponsibility;

/**
 * Created by Fisher on 4/10/2017.
 */
public class IssueRaiser {
    public IReceiver setFirstReceiver;
    public IssueRaiser(IReceiver firstReceiver){
        this.setFirstReceiver = firstReceiver;
    }
    public void raiseMessage(Message msg){
        if(setFirstReceiver !=null){
            setFirstReceiver.processMessage(msg);
        }
    }
}
