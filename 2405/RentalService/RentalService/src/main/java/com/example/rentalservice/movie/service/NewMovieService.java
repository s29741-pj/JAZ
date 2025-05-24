package com.example.rentalservice.movie.service;

import com.example.rentalservice.movie.model.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewMovieService {
    private final RestTemplate restTemplate;

    public NewMovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void getMovieFromMovieService(String url){
        restTemplate.getForObject(url, Movie.class);
    }


}
