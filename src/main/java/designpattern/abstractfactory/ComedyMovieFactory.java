package designpattern.abstractfactory;

/**
 * Created by Fisher on 4/9/2017.
 */
public class ComedyMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
