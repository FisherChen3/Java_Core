package designpattern.chainofresponsibility;

/**
 * Created by Fisher on 4/10/2017.
 */
public class ChainOfResponsibilityPatternEx {
    public static void main(String[] args) {
        System.out.println("***Chain of Responsibility Pattern Demo***\n");
//Making the chain first: IssueRaiser->FaxErrorhandler->EmailErrorHandler
        IReceiver faxHandler, emailHandler;
//end of chain
        emailHandler = new EmailErrorHandler(null);
//fax handler is before email
        faxHandler = new FaxErrorHandler(emailHandler);
//starting point: raiser will raise issues and set the first handler
        IssueRaiser raiser = new IssueRaiser(faxHandler);
        Message m1 = new Message("Fax is reaching late to the destination",
                MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("In Email, BCC field is disabled occasionally",
                MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination",
                MessagePriority.High);
        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
