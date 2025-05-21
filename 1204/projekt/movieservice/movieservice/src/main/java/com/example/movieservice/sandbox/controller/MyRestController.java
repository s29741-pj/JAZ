package com.example.movieservice.sandbox.controller;

import com.example.movieservice.movie.model.Movie;
import com.example.movieservice.movie.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class MyRestController {

    private MovieService movieService;

    public MyRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    //home
    @GetMapping("/movies/available_true/{id}")
    public ResponseEntity<Movie> availableTrue(@PathVariable long id) {
        movieService.changeAvailability(id);
        return ResponseEntity.ok(movieService.findById(id));
    }


    //home
    @GetMapping("/movies/title/{title}")
    public ResponseEntity<Optional> findByTitle(@PathVariable String title) {
        return ResponseEntity.ok(movieService.findByTitle(title));
    }
    //home
    @GetMapping("/movies/title_contain/{title}")
    public ResponseEntity<List> findByTitleContaining(@PathVariable String title) {
        return ResponseEntity.ok(movieService.findByTitleContaining(title));
    }
    //home
    @GetMapping("/movies/genre/{genre}")
    public ResponseEntity<List> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(movieService.findByGenre(genre));
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping("/movies")
    public ResponseEntity<String> createMovie(@RequestBody Movie movie) {
        movieService.create(movie);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<String> updateMovie( @PathVariable long id, @RequestBody Movie movie) {
        movieService.update(id, movie);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable long id) {
        movieService.delete(id);
        return ResponseEntity.noContent().build();
    }


    //    @GetMapping("/movies")
//    public ResponseEntity<ArrayList> getAllMovies() {
//        return ResponseEntity.ok(movieService.getMovies());
//    }

//    @PostMapping("/movies")
//    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
//        movieService.add(movie);
//        int last_index = movieService.getMovies().size() - 1;
//        return ResponseEntity.ok(movieService.getMovie(last_index));
//    }
//
//    @PutMapping("/movies/{id}")
//    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable int id) {
//        movieService.update(movie, id);
//        return ResponseEntity.ok(movieService.getMovie(id));
//    }
//
//    @DeleteMapping("/movies/{id}")
//    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
//        movieService.delete(id);
//        return ResponseEntity.noContent().build();
//    }

}
