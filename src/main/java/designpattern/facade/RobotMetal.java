package designpattern.facade;

/**
 * Created by Fisher on 4/4/2017.
 */
public class RobotMetal {
    private String metal;
    public void SetMetal(String metal) {
        this.metal = metal;
        System.out.println("Metal is set to : " + this.metal);
    }
}
