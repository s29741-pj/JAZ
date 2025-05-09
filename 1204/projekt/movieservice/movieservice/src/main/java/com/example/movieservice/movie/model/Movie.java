package com.example.movieservice.movie.model;

public class Movie {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String genre;

public Movie( String title, String genre) {
    this.id = idCounter++;
    this.title = title;
    this.genre = genre;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        idCounter--;
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
}
