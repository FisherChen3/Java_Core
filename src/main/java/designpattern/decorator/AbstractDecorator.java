package designpattern.decorator;

/**
 * Created by Fisher on 4/4/2017.
 */
public abstract class AbstractDecorator extends Component{
    protected Component com;
    public void setComponent(Component c){
        this.com = c;
    }
    public void doJob(){
        if(com!=null){
            com.doJob();
        }
    }
}
