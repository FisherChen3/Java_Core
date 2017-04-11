package designpattern.memento;

/**
 * Created by Fisher on 4/4/2017.
 */
/*
The caretaker takes care of the memento’s safekeeping or protection
and it should not examine the contents of the memento.
 */
public class Caretaker {
    private Memento memento;
    public void saveMemento(Memento m){
        this.memento = m;
    }
    public Memento retrieveMemento(){
        return memento;
    }
}
