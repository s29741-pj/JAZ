package com.example.rentalservice.movie.model;


public class Movie {
    private Long id;
    private String title;
    private String genre;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailableTrue(Movie movie) {
        if (!movie.isAvailable) {
            this.isAvailable = true;
        }
    }
}