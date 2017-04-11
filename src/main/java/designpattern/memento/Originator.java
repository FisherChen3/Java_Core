package designpattern.memento;

/**
 * Created by Fisher on 4/4/2017.
 */
/* The originator can have the internal states
and it has the ability to restore into its earlier state
when it's provided with a memento
*/
public class Originator {
    private String state;
    Memento m;
    public void setState(String state) {
        this.state = state;
        System.out.println("State at present : " + state);
    }
    // create memento
    public Memento OriginatorMemento(){
        m = new Memento(state);
        return m;
    }
    // back to old state
    public void Revert(Memento memento){
        System.out.println("Restoring to previous state...");
        state = memento.getState();
        System.out.println("State at present : " + state);
    }
}
