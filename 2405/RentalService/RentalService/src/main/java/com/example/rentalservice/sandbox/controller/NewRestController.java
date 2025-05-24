package com.example.rentalservice.sandbox.controller;

import com.example.rentalservice.movie.model.Movie;
import com.example.rentalservice.movie.service.NewMovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class NewRestController {

private NewMovieService newMovieService;

public NewRestController(NewMovieService newMovieService) {
    this.newMovieService = newMovieService;
}

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable long id) {
        return newMovieService.getMovieFromMovieService("/movies/" + Long.toString(id));
    }



}
