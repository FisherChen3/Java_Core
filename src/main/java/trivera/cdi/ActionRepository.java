package trivera.cdi;

import trivera.bluray.Genre;

/**
 * Created by Fisher on 3/15/2017.
 */
@GenreType(genre= Genre.ACTION)
public class ActionRepository implements BlurayRepository {

    @Override
    public void add(Bluray bluray) {
        System.out.println("Action Repo add: " + bluray);
    }
}
