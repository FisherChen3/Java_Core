package trivera.futures.adapter;

import trivera.futures.MovieSearcher;
import trivera.movies.model.Movie;
import trivera.movies.service.CallbackMovieService;
import trivera.movies.service.MovieSearchCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
 * <p>
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 * <p>
 * Copyright c 2015 The Trivera Group, LLC. http://www.triveratech.com
 * </p>
 *
 * @author The Trivera Tech Team.
 */
public class CallbackMovieServiceAdapter implements MovieSearcher {

    private CallbackMovieService service = new CallbackMovieService();

//    private boolean searchComplete;

    public CompletableFuture<List<Movie>> searchByTitle(final String title) {

        CompletableFuture<List<Movie>> future = new CompletableFuture<>();


//        searchComplete = false;

        MovieSearchCallback callback = new MovieSearchCallback() {

            List<Movie> movies = new ArrayList<>();

            @Override
            public void searchComplete() {
                future.complete(movies);
            }

            @Override
            public void movieFound(Movie movie) {
                movies.add(movie);
            }
        };

        service.searchByTitle(title, callback);

        return future;
    }
}
