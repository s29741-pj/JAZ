package com.example.movieservice.movie.service;

import com.example.movieservice.movie.model.Movie;
import com.example.movieservice.movie.exception.MovieNotFoundException;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieService {
private final MovieRepository movieRepository;

public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
}

//home
public void changeAvailability(long id) {
    Movie movie = findById(id);
    movie.setAvailableTrue(movie);
    movieRepository.save(movie);
}

//home
public Optional findByTitle(String title) {
    return movieRepository.findByTitle(title);
}
//home
public List<Movie> findByTitleContaining(String title) {
    return movieRepository.findByTitleContaining(title);
}
//home
public List<Movie> findByGenre(String genre) {
    return movieRepository.findByGenre(genre);
}


public Movie findById(Long id) {
    return movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie with ID " + id + " not found."));
}

public void create(Movie movie) {
    movieRepository.save(movie);
}

public void update(Long id, Movie updatedMovie) {
    Movie movie = findById(id);
    movie.setGenre(updatedMovie.getGenre());
    movie.setTitle(updatedMovie.getTitle());
    movieRepository.save(movie);
}

public void delete(Long id) {
    Movie movie = findById(id);
    movieRepository.delete(movie);
}

//public void add(Movie movie) {
//    if (movie.getTitle() == null || movie.getTitle().isEmpty()) {
//        throw new IllegalArgumentException("Title cannot be null");
//    }
//    if (movie.getGenre() == null || movie.getGenre().isEmpty()) {
//        throw new IllegalArgumentException("Genre cannot be null");
//    }
//    movieStorage.getMovies().add(movie);
//}
//
//public void delete(Movie movie) {
//    movieStorage.getMovies().remove(movie);
//}
//
//public void delete(int index) {
//        movieStorage.getMovies().remove(index);
//}
//
//public void update(Movie movie) {
//    movieStorage.getMovies().set(movieStorage.getMovies().indexOf(movie), movie);
//}
//
//public void update( Movie movie, int index) {
//    movieStorage.getMovies().set(index, movie);
//    movieStorage.getMovies().get(index).setId(index);
//}
//
//public Movie getMovie(int index) {
//    return movieStorage.getMovies().get(index);
//}
//
//public int getIndex(Movie movie) {
//    return movieStorage.getMovies().indexOf(movie);
//}
//
//public Movie get(String title) {
//return movieStorage.getMovies().stream().filter(m -> m.getTitle() == title).findFirst().orElse(null);
//}

//public Movie get(String title) {
//    return movieStorage.getMovies().;
//}

//public ArrayList<Movie> getMovies() {
//return movieStorage.getMovies();
//}

}
