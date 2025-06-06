package com.example.movieservice.movie.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    @Column(name="isAvailable")
    private Boolean isAvailable;

    public Movie() {

    }

    public Movie(Long id, String title, String genre, Boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
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

    public String getMovieData() {
        return "Title: " + this.title + " | Genre: " + this.genre;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailableTrue() {
        if(!this.isAvailable || this.isAvailable == null) {
            this.isAvailable = true;
        }
    }

    public void setAvailableFalse() {
        if(this.isAvailable || this.isAvailable == null) {
            this.isAvailable = false;
        }
    }


//    private static int idCounter = 0;

}
