package designpattern.abstractfactory;

/**
 * Created by Fisher on 4/9/2017.
 */
public class ActionMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
