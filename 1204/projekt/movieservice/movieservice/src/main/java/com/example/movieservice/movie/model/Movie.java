package com.example.movieservice.movie.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
//    @Enumerated(EnumType.STRING)
    private String genre;

public Movie(){

}

public Movie(int id,  String title, String genre) {
    this.id = id;
    this.title = title;
    this.genre = genre;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
//        idCounter--;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
    return genre;
    }

    public void setGenre(String genre) {
    this.genre = genre;
    }

    public String getMovieData(){
        return "Title: " + this.title + " | Genre: " + this.genre;
    }



//    private static int idCounter = 0;

}
