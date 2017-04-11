package designpattern.chainofresponsibility;

/**
 * Created by Fisher on 4/10/2017.
 */
interface IReceiver {
    boolean processMessage(Message msg);
}
