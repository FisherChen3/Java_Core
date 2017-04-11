package designpattern.mediator;

/**
 * Created by Fisher on 4/9/2017.
 */
public abstract class Friend {
    protected Mediator mediator;
    public String name;

    // Constructor
    public Friend(Mediator _mediator) {
        mediator = _mediator;
    }
}
