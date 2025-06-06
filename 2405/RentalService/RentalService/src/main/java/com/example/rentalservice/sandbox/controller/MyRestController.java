package com.example.rentalservice.sandbox.controller;

import com.example.rentalservice.movie.model.Movie;
import com.example.rentalservice.movie.service.RentalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MyRestController {

private RentalService rentalService;

public MyRestController(RentalService rentalService) {
    this.rentalService = rentalService;
}
//home
    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable long id) {
        return rentalService.getMovieFromMovieService("http://localhost:8080/test/movies/" + Long.toString(id)); }

    @GetMapping("/movies/available_true/{id}")
    public Movie returnMovie(@PathVariable long id) {
        return rentalService.returnMovieFromMovieService("http://localhost:8080/test/movies/available_true/" + Long.toString(id));
    }

    @GetMapping("/movies/available_false/{id}")
    public Movie rentMovie(@PathVariable long id) {
        return rentalService.rentMovieFromMovieService("http://localhost:8080/test/movies/available_false/" + Long.toString(id));
    }


}
