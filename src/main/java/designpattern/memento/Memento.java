package designpattern.memento;

/**
 * Created by Fisher on 4/4/2017.
 */
/*
The memento will store the
internal states of the originator.
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
