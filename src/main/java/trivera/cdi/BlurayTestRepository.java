package trivera.cdi;

/**
 * Created by Fisher on 3/15/2017.
 */
public class BlurayTestRepository implements BlurayRepository {

    @Override
    public void add(Bluray bluray) {
        System.out.println("BluerayDatabaseTest repository " + bluray);
    }
}
