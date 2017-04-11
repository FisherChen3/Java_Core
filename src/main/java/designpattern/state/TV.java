package designpattern.state;

/**
 * Created by Fisher on 4/4/2017.
 */
public class TV {
    private RemoteControl state;
    public RemoteControl getState() {
        return state;
    }
    public void setState(RemoteControl state) {
        this.state = state;
    }
    public TV(RemoteControl state) {
        this.state = state;
    }
    public void pressButton() {
        state.pressSwitch(this);
    }
}
