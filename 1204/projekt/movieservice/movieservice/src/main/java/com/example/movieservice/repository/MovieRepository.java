package com.example.movieservice.repository;

import com.example.movieservice.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    //home
    Optional<Movie> findByTitle(String title);
    List<Movie> findByTitleContaining(String title);
    List<Movie> findByGenre(String genre);

}
