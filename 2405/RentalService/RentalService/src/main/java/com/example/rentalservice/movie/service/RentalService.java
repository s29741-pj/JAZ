package com.example.rentalservice.movie.service;

import com.example.rentalservice.movie.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//home
    public Movie getMovieFromMovieService(String url){
        return restTemplate.getForObject(url, Movie.class);
    }

    public Movie returnMovieFromMovieService(String url){
        return restTemplate.getForObject(url, Movie.class);
    }

    public Movie rentMovieFromMovieService(String url){
        return restTemplate.getForObject(url, Movie.class);
    }


}
