package basics.callback2;

/**
 * Created by Fisher on 2/4/2017.
 */
public interface Callback<T> {

    void onResult(T result);
    void onError(Exception e);

}
