package basics.callback2;

/**
 * Created by Fisher on 2/4/2017.
 */
public abstract class AsyncJob<T> {

    public abstract void start(Callback<T> callback);

}
