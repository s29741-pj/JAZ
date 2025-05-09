package com.example.movieservice.sandbox.controller;

import com.example.movieservice.movie.model.Movie;
import com.example.movieservice.movie.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/test")
public class MyRestController {

    private MovieService movieService;

    public MyRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<ArrayList> getAllMovies() {
        return ResponseEntity.ok(movieService.getMovies());
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable int id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        movieService.add(movie);
        int last_index = movieService.getMovies().size() - 1;
        return ResponseEntity.ok(movieService.getMovie(last_index));
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable int id) {
        movieService.update(movie, id);
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        movieService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
