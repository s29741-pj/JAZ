package com.example.movieservice.movie.storage;

import com.example.movieservice.movie.model.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MovieStorage {
public ArrayList<Movie> movies = new ArrayList<Movie>();

public MovieStorage() {
    movies.add(new Movie(1, "Film 1", "comedy"));
    movies.add(new Movie( 2,"Film 2", "horror"));
    movies.add(new Movie(3,"Film 3", "document"));
    movies.add(new Movie( 4,"Film 4", "comedy"));
}

public ArrayList<Movie> getMovies() {
    return movies;
}

}
