package trivera.cdi;

import javax.enterprise.inject.Default;

/**
 * Created by Fisher on 3/15/2017.
 */
@Default
public class SimpleBrRepository implements BlurayRepository {

    @Override
    public void add(Bluray bluray) {
        System.out.println("Adding " + bluray);
    }
}
