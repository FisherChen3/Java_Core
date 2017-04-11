package designpattern.abstractfactory;

/**
 * Created by Fisher on 4/9/2017.
 */
public interface IMovieFactory {
    ITollywoodMovie GetTollywoodMovie();
    IBollywoodMovie GetBollywoodMovie();
}
