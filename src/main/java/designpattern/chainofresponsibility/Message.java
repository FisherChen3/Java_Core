package designpattern.chainofresponsibility;

/**
 * Created by Fisher on 4/10/2017.
 */
public class Message {
    public String text;
    public MessagePriority priority;
    public Message(String msg, MessagePriority p){
        text = msg;
        this.priority = p;
    }
}
