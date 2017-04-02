package trivera.futures.adapter;

import trivera.futures.MovieSearcher;
import trivera.movies.model.Movie;
import trivera.movies.service.SimpleMovieService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
public class SimpleMovieServiceAdapter implements MovieSearcher {

    private SimpleMovieService service = new SimpleMovieService();

    public CompletableFuture<List<Movie>> searchByTitle(final String title) {

        return CompletableFuture.supplyAsync(() -> {
            List<Movie> allMovies = service.getAllMovies();
            return allMovies.stream().filter(movie -> contains(movie.getTitle(), title)).collect(Collectors.toList());
        });
    }

    private boolean contains(String title, String contains) {

        if (title == null || contains == null)
            return false;
        String escapedFragment = Pattern.quote(contains);
        Pattern pat = Pattern.compile(escapedFragment, Pattern.CASE_INSENSITIVE);

        Matcher m = pat.matcher(title);
        return m.find();
    }
}
