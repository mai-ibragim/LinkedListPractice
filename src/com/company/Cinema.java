package com.company;

import java.util.List;

public class Cinema {
    List<Movie> movies;

    public Cinema() {
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
